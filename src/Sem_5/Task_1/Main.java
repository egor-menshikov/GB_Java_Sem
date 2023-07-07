package Sem_5.Task_1;

//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов.



public class Main {
    public static void main(String[] args) {
        Passports ps = new Passports();
        ps.addNote("123456", "Иванов");
        ps.addNote("321456", "Василь");
        ps.addNote("234561", "Петров");
        ps.addNote("234432", "Иванов");
        ps.addNote("654321", "Петров");
        ps.addNote("345678", "Иванов");
        System.out.println(ps.findByName("Иванов"));
    }
}
