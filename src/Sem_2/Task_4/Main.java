package Sem_2.Task_4;

//Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
//        который запишет эту строку в простой текстовый файл, обработайте исключения.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;


public class Main {
    static Logger logger;
    public static void main(String[] args) {
        String s = "TEST";
        int n = 100;
        String text = duplicate(s, n);
        String path = "src/test.txt";
        createLogger();
        writeToFile(text, path);
        System.out.println(readInFile(path));
        closeLogger();

    }

    private static void closeLogger() {
        for (Handler handler : Logger.getGlobal().getHandlers()) {
            handler.close();
        }
        System.out.println("handler count = " + logger.getHandlers().length);
    }

    private static void createLogger() {
        logger = Logger.getAnonymousLogger();
        FileHandler fh;
        try {
            fh = new FileHandler("src/log.txt", true);
            logger.addHandler(fh);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SimpleFormatter formatter = new SimpleFormatter();

    }


    private static String readInFile(String path) {
        File file = new File(path);
        StringBuilder sb = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
                sb.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }


    public static void writeToFile(String s1, String path) {

        FileWriter writer;
        try {
            writer = new FileWriter(path, true);
            writer.append(s1);
            writer.append("\n");
            writer.flush();
            writer.close();
            logger.info("Запись выполнена");
        } catch (Exception e) {
            e.printStackTrace();
            logger.warning("Не удалось записать в файл");
        }

    }

    public static String duplicate(String s, int n) {
        return s.repeat(n);
    }
}
