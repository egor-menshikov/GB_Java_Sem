package HOMEWORKS.HW2.Task_1;


import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class Main {
    public static String pathPr = System.getProperty("user.dir");
    public static String pathFile = pathPr + "\\src\\HOMEWORKS\\HW2\\Task_1\\string.json";

    public static void main(String[] args) {
        String json = reader(pathFile);
        String[][][] textKeyVal = parsed(json);
        System.out.println(parsedOutput(textKeyVal));
    }

    public static String parsedOutput(String[][][] input) {
        StringBuilder result = new StringBuilder();
        for (String[][] strings : input) {
            result.append("Студент ").append(strings[0][1])
                    .append(" получил ").append(strings[1][1])
                    .append(" по предмету ").append(strings[2][1]).append("\n");
        }
        return result.toString();
    }


    public static String[][][] parsed(String input) {
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
        return result;
    }

    public static String reader(String path) {
        StringBuilder result = new StringBuilder();
        int c;
        char ch;
        try {
            FileReader reader = new FileReader(path, StandardCharsets.UTF_8);
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

//    public static void writer()
}
