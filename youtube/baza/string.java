package youtube.baza;

import java.util.Arrays;
import java.util.Locale;

public class string {
    public static void main(String[] args) {
//        String text = new String("hey");
//        String text2 = new String("hey");
//        System.out.println(text2.equals(text));
        String text = "Hello world!";
        //Перевод в верхний регистр
        String textUpper = text.toUpperCase();
//        System.out.println(textUpper);

        //Перевод в нижний регистр
        String textLower = text.toLowerCase();
//        System.out.println(textLower);

        //Длина строки
        int length = text.length();
//        System.out.println(length);

        //Есть ли в тексте другой текст?
        boolean containsHello = text.contains("Hello");
//        System.out.println(containsHello);

        //Замена всех кусков текста(подстроки) на другой текст
        String replacedText = text.replaceAll("l", "a");
//        System.out.println(replacedText);

        //Повторить текст n раз
        String repeatedText = text.repeat(10);
//        System.out.println(repeatedText);

        //Разбить текст на массив String
        String names = "Yuri;Olga;Petr;Vasya";
        String[] namesArray = names.split(";");
//        System.out.println(Arrays.toString(namesArray));

        //Объединение строк (Конкатенация)
        String word1 = "hi ";
        String word2 = "friend";
        String result = word1 + word2;
//        System.out.println(result);

        //Начинается на подстроку
        boolean startsWithHel = text.startsWith("Hel");
//        System.out.println(startsWithHel);

        //Заканчивается на подстроку
        boolean endsWithWorld = text.endsWith("world!");
//        System.out.println(endsWithWorld);

        //Обрезка строки (Первые 5 символов)
        String firstFiveLetters = text.substring(5,text.length());
//        System.out.println(firstFiveLetters);

        String lenghtText2 = "hello".replaceAll("l", "a").toUpperCase();
//        System.out.println(lenghtText2);

//Выбрать текст начиная с 11 символа и до конца строки.Перевести в нижний регистр. Разбить строку на массив по пробелу.
//Вывести на экран каждое слово из массива и длину строки этого слова
        String text1 = "my name is Giovanni Giorgio";
//        System.out.println(text1.substring(10, text1.length()));
//        System.out.println(text1.toLowerCase());
        String[] arrtext = text1.split(" ");
        String[] arr = text1.substring(11).toLowerCase().split(" ");
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arrtext));
        for( String word : arr){
            System.out.println(word);
            System.out.println(word.length());
        }

    }
}
