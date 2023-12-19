package youtube.baza;

public class StringFormat {
    public static void main(String[] args) {
        String name = "Юрий";
        int age = 30;
//        String phrase = "Меня зовут " + name + ". Мне " + age + " лет.";
//        String phrase = String.format("Меня зовут %s. Мне %d лет.", name, age);
//        System.out.println(phrase);
//        System.out.printf("Меня зовут %s. Мне %d лет.", name, age);
        String carMark = "Audi";
        String carModel = "Q3";
        double price = 15_000.000;
        boolean hasAutomaticTransmission = true;
        String result = """
                Привет, я менеджер салона %s
                У нас есть модель - %s за %f
                Есть ли у нее автоматическая коробка передач?
                %s
                """.formatted(carMark, carModel, price, hasAutomaticTransmission ? "Да" : "Нет");
//        System.out.println(result);
        //текстовые блоки
        String name1 = "Anton";
        String name2 = "Timer";
        String name3 = "Jon";
        String next = """
                Привет %s
                Пока %s 
                Привет %s
                """.formatted(name1,name3,name2);
        System.out.println(next);

    }
}
