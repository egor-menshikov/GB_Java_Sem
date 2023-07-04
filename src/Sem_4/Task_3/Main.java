package Sem_4.Task_3;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean work = true;
        while (work) {
            String line = sc.nextLine();
            if (line.equalsIgnoreCase("print")) {

                ListIterator<String> listIter = list.listIterator(list.size());
                while (listIter.hasPrevious()) {
                    System.out.println(listIter.previous());
                }

                System.out.println(list);
            } else if (line.equalsIgnoreCase("revert") && list.size() > 0) {
                list.removeLast();
                System.out.println(list);
            } else {
                list.add(line);
                System.out.println(list);
            }
        }
    }
}
