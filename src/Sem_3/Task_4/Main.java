package Sem_3.Task_4;


import java.util.ArrayList;
import java.util.List;

//Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й позиции
//каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для
//заполнения данной структуры.
public class Main {
    static List<List<String>> list = new ArrayList<>();

    public static void main(String[] args) {
        addBook("Сказки", "Колобок");
        addBook("Сказки", "Курочка ряба");
        addBook("Фантастика", "Мстители");
        System.out.println(list);

    }

    static void addBook(String genreBook, String nameBook) {
        for (int i = 0; i < list.size(); i++) {
            List<String> genreList = list.get(i);
            String genre = genreList.get(0);
            if (genreBook.equalsIgnoreCase(genre)) {
                if (!genreList.contains(nameBook)) {
                    genreList.add(nameBook);
                }
                return;
            }

        }
        List<String> list_ = new ArrayList<>();
        list_.add(genreBook);
        list_.add(nameBook);
        list.add(list_);
    }
}
