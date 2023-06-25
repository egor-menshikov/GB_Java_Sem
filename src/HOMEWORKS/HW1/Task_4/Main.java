package HOMEWORKS.HW1.Task_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        String[] eq_list = equation.split(" ");
        System.out.println(Arrays.toString(eq_list));
        int[][] num1 = num_parse(eq_list[0]);
        int[][] num2 = num_parse(eq_list[2]);
        System.out.println();
        print_arr(num1);
        System.out.println();
        print_arr(num2);

        double base = 10;
        int sum = 0;
        int k;
        for (int i = num1.length - 1; i >= 0; i--) {
            k = (int) Math.pow(base, num1.length - 1 - i);
            if (num1[i][1] == 0)
                sum += num1[i][0] * k;
            else {
                num1[i][1] = k;
            }
        }
        System.out.println(sum);
        print_arr(num1);
    }

    static int[][] num_parse(String num_str) {
        int[][] num_arr = new int[num_str.length()][2];
        for (int i = num_str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(num_str.charAt(i))) {
                num_arr[i][0] = Integer.parseInt(Character.toString(num_str.charAt(i)));
            } else {
                num_arr[i][0] = 0;
                num_arr[i][1] = 1;
            }
        }
        return num_arr;
    }

    static void print_arr( int[][] arr) {
        for (int[] item : arr
        ) {
            System.out.println(Arrays.toString(item));
        }
    }
}

