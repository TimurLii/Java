package Baza_1.HomeWork.Homewor_2;

import java.util.ArrayList;
import java.util.List;

public class Task_4 {
    public static void main(String[] args) {
        String JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String ELEMENT1 = "Студент ";
        String ELEMENT2 = " получил ";
        String ELEMENT3 = " по предмету ";
        answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);

    }

    public static void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        String temp = JSON.replace("{", "").replace("}", "").replace("[", "")
                .replace("]", "").replace("\"", "").replace(":", " ")
                .replace(",", " ");
        List<String> element = new ArrayList<>();
        String[] split = temp.split(" ");
        for (int i = 1; i < split.length; i += 2) {
            element.add(split[i]);

            System.out.println(element.size());
        }
        for (int i = 0; i < element.size(); i++) {
            StringBuilder list = new StringBuilder(String.format("%s%s%s%s%s%s", ELEMENT1, element.get(0),
                    ELEMENT2, element.get(1), ELEMENT3, element.get(2)));
            element.removeFirst();
            element.removeFirst();
            element.removeFirst();
            System.out.println(list);

        }
    }

}
