package L_Sem.Sem3;

import java.util.*;

public class program_sem_3 {
    public static void main(String[] args) {
//        task1();
//        task2(10,1,10);
//        task3();
        List<List<String>>bookshop = new ArrayList<>();
//        System.out.println(bookshop);
        add("Жанр1","Название1",bookshop);
        add("Жанр2","Название1",bookshop);
        add("Жанр3","Название1",bookshop);
        add("Жанр4","Название1",bookshop);
        add("Жанр1","Название1",bookshop);
        add("Жанр1","Название2",bookshop);
        System.out.println(bookshop);

    }

    //    Текст задачи:**
//    Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
//    String s1 = "hello";
//    String s2 = "hello";
//    String s3 = s1;
//    String s4 = "h" + "e" + "l" + "l" + "o";
//    String s5 = new String("hello");
//    String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
    static void task1() {
        String s1 = "hello";

        String s2 = "hello";

        String s3 = s1;

        String s4 = "h" + "e" + "l" + "l" + "o";

        String s5 = new String("hello");

        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));


    }

    static void task2(int size, int min, int max) {
//        Заполнить список десятью случайными числами.
//        Отсортировать список методом sort() и вывести его на экран.
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < size; i++) {
            list.add(new Random().nextInt(min, max + 1));

        }
//        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }

    static void task3() {
//        Текст задачи:
//        Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add("dsfsdf");
        list.add("as,dkndj");
        list.add(13);
        list.add(11.11);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
    static void task4(){
//Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//что на 0й позиции каждого внутреннего списка содержится название жанра,
//а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
        List<List<String>>bookshop = new ArrayList<>();
        System.out.println(bookshop);

    }
    static void add(String genre,String namebook,List<List<String>>bookshop){
        for (int i = 0; i < bookshop.size(); i++) {
            if (bookshop.get(i).get(0).equals(genre)){
                bookshop.get(i).add(namebook);
                return;
            }
        }
        List<String> collek_book = new ArrayList<>();
        collek_book.add(genre);
        collek_book.add(namebook);
        bookshop.add(collek_book);
            
    }
}
