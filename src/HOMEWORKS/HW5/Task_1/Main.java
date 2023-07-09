package HOMEWORKS.HW5.Task_1;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

public class Main {
    public static void main(String[] args) {
        Phonebook book = new Phonebook();
        book.addContact("Egor", "1111111");
        book.addContact("Varvara", "2222222");
        book.addContact("Egor", "3333333");
        book.addContact("Varvara", "4444444");
        book.addContact("Alex", "5555555");
        book.print();
        book.removeContact("Alex");
        book.removePhone("Egor", 0);
        book.print();
    }
}
