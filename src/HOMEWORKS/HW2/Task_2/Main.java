package HOMEWORKS.HW2.Task_2;

// Задание про пузырьковую сортировку и логгер

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    static Logger log;
    public static String pathPr = System.getProperty("user.dir");
    public static String pathLog = pathPr + "\\src\\HOMEWORKS\\HW2\\Task_2\\log.txt";

    public static void main(String[] args) {
        startLogger();
        int[] array = randArr(10, 0, 20);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
        closeLogger();
    }

    private static void startLogger() {
        log = Logger.getLogger(HOMEWORKS.HW2.Task_1.Main.class.getName());
        FileHandler fh;
        try {
            fh = new FileHandler(pathLog, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        log.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
    }


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    log.info(arr[j - 1] + " <-> " + arr[j]);
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    log.info(Arrays.toString(arr));
                }
            }
        }
    }

    public static int[] randArr(int len, int min, int max) {
        Random rnd = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(min, max + 1);
        }
        return arr;
    }

    public static void closeLogger(){
        for (Handler handler : log.getHandlers()) {
            handler.close();
        }
    }
}
