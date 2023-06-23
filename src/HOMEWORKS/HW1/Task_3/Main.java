package HOMEWORKS.HW1.Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        double num1 = input.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = input.nextDouble();
        System.out.println("Введите знак арифметической операции: ");
        char operation = input.next().charAt(0);
        System.out.print(num1 + " " + operation + " " + num2 + " = " + calc(num1, num2, operation));
    }

    static double calc(double a, double b, char operation) {
        return
                switch (operation) {
                    case '*' -> a * b;
                    case '/' -> a / b;
                    case '+' -> a + b;
                    case '-' -> a - b;
                    default -> throw new IllegalStateException("Unexpected value: " + operation);
                };
    }
}
