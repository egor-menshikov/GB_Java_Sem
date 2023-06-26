package HOMEWORKS.HW1.Task_1;

import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int num = (new Scanner(System.in)).nextInt();
        System.out.printf("Треугольное: %d%nФакториал: %d", triangular(num), factorial(num));
    }

    static int triangular(int num) {
        if (num == 1) return num;
        return num + triangular(num - 1);
    }

    static long factorial(int num) {
        if (num == 1) return num;
        return num * factorial(num - 1);
    }
}
