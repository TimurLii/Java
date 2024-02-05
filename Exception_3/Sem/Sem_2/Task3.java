package Exception_3.Sem.Sem_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Запишите в файл следующие строки:
 * <p>
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Полина=?
 * Константин=?
 * Иван=4
 * <p>
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
 * если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных,
 * если сохранено значение ?, заменить его на соответствующее число.Если на каком-то месте
 * встречается символ, отличный от числа или ?, бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами ?.
 */
public class Task3 {
    private static final List<String> strings = List.of
            ("Анна=4", "Елена=5", "Марина=6", "Полина=7", "Владимир=?", "Константин=?", "Иван=4");
//для проверки, заменить какое-то из значений на null

    public static void main(String[] args) {
        write(strings,"1.txt");
        System.out.println(read("1.txt"));
        rewrite("1.txt");
    }

    private static void write(List<String> strings, String path){
        FileWriter fr = null;
        try {
            fr = new FileWriter(path, true);
            for (String string:strings) {
                fr.write(string + "\n");
            }
            fr.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static Map<String, Integer> read(String path){
        Map<String, Integer> result = new LinkedHashMap<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            while((line = br.readLine()) != null) {
                String[] array = line.split("=");
                String key = array[0];
                String temp = array[1];
                int value;
                if (temp.equals("?")) value = key.length();
                else value = Integer.parseInt(temp);
                result.put(key, value);
            }
        } catch (IOException e){
            throw new RuntimeException("Ошибка при работе с файлом");
        } catch (NumberFormatException e){
            throw new RuntimeException("Некорректные данные");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }
    private static void rewrite(String path){
        Map<String, Integer> map = read(path);
        List<String> toWrite = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            toWrite.add(entry.toString());
        }
        write(toWrite, path);
    }
}