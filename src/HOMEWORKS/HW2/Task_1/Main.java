package HOMEWORKS.HW2.Task_1;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Main {
    public static String pathPr = System.getProperty("user.dir");
    public static String pathFile = pathPr + "\\src\\HOMEWORKS\\HW2\\Task_1\\string.json";
    public static String pathWrite = pathPr + "\\src\\HOMEWORKS\\HW2\\Task_1\\output.txt";
    public static String pathLog = pathPr + "\\src\\HOMEWORKS\\HW2\\Task_1\\log.txt";

    public static void main(String[] args) {
        String json = reader(pathFile);
        System.out.println(json);
        System.out.println();
        String[][][] textKeyVal = parsedArr(json);
        String output = parsedOutput(textKeyVal);
        System.out.println(output);
        writer(pathWrite, output);
    }

    // Собираем ответ из массива
    public static String parsedOutput(String[][][] input) {
        logger("info", "Собираем распарсенный текст в ответ.");
        StringBuilder result = new StringBuilder();
        for (String[][] strings : input) {
            result.append("Студент ").append(strings[0][1])
                    .append(" получил ").append(strings[1][1])
                    .append(" по предмету ").append(strings[2][1]).append("\n");
        }
        logger("info", "Строка собрана и передана.");
        return result.toString();
    }

    // Парсим исходную строку в массив, удаляем лишние символы
    public static String[][][] parsedArr(String input) {
        logger("info", "Парсим текст.");
        String text = input.replaceAll("[^,}:а-яА-Я0-9]", "");

        String[] textLines = text.split("},");
        for (int i = 0; i < textLines.length; i++) {
            textLines[i] = textLines[i].replace("}", "");
        }

        String[][][] result = new String[textLines.length][3][2];
        for (int i = 0; i < textLines.length; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 2; k++) {
                    String[] pairs = textLines[i].split(",");
                    String[] values = pairs[j].split(":");
                    result[i][j][k] = values[k];
                }
            }
        }
        logger("info", "Парсинг закончен успешно, надеюсь.");
        return result;
    }

    public static String reader(String path) {
        StringBuilder result = new StringBuilder();
        int c;
        char ch;
        try (FileReader reader = new FileReader(path, StandardCharsets.UTF_8)) {
            logger("info", "Считываем файл.");
            while ((c = reader.read()) != -1) {
                ch = (char) c;
                result.append(ch);
            }
            logger("info", "Файл считан.");
        } catch (IOException e) {
            logger("error", "Я что-то нажал, и все исчезло..");
            throw new RuntimeException(e);
        }
        logger("info", "Текст из файла передан в объект String.");
        return result.toString();
    }

    public static void writer(String path, String text) {
        try (FileWriter fw = new FileWriter(path, false)) {
            fw.append(text);
            logger("info", "Текст записан в файл.");
        } catch (IOException e) {
            logger("error", "Я что-то нажал, и все исчезло..");
            throw new RuntimeException(e);
        }
    }

    public static void logger(String level, String message) {
        Logger log = Logger.getLogger(Main.class.getName());
        FileHandler fh;
        try {
            fh = new FileHandler(pathLog, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        log.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        if (level.equalsIgnoreCase("info"))
            log.info(message);
        if (level.equalsIgnoreCase("error"))
            log.log(Level.WARNING, message);
        fh.close();
    }
}
