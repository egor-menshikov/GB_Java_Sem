package HOMEWORKS.HW2.Task_1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
//                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
//                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String json = reader();
        System.out.println(json);
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder group = new StringBuilder();
        boolean add_flag = false;

        for (int i = 0; i < json.length(); i++) {
            if (add_flag && json.charAt(i) != '}') group.append(json.charAt(i));
            if (json.charAt(i) == '{') add_flag = true;
            if (json.charAt(i) == '}') {
                list.add(group);
                add_flag = false;
                group = new StringBuilder();
            }
        }
        for (StringBuilder item : list
             ) {
            System.out.println(item);
        }


    }

    public static String reader() {
        StringBuilder result = new StringBuilder();
        int c;
        char ch;
        String pathPr = System.getProperty("user.dir");
        String pathFile = pathPr + "\\src\\HOMEWORKS\\HW2\\Task_1\\string.json";
        try {
            FileReader reader = new FileReader(pathFile, StandardCharsets.UTF_8);
            while ((c = reader.read()) != -1) {
                ch = (char) c;
                result.append(ch);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result.toString();
    }
}
