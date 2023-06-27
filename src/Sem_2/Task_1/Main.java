package Sem_2.Task_1;


import java.util.Scanner;

//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
//Ответ: c1c2c1…c2 (всего N символов)
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        int n = input.nextInt();
        char c1 = 'A';
        char c2 = 'B';
        for (int i = 1; i <= n; i++) {
            if (i%2 != 0) sb.append(c1);
            else sb.append(c2);
        }
        System.out.println(sb);
    }
}
