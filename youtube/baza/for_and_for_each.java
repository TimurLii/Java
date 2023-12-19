package youtube.baza;

public class for_and_for_each {
    public static void main(String[] args) {
        int[] numbers = {3, 2, 10, 5, 8};
////        for (int number : numbers) System.out.println(number);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(numbers[i]);
//        }
//        for (int number : numbers) {
//            if (number % 2 == 0) System.out.println(number);
//            System.out.println("====================");

//        }
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) System.out.println("Число" +numbers[i]);
//            if (i % 2==0) System.out.println("Индекс" +i);
//        int count = 1;
//        while(count <= 100){
//            System.out.println(count) ;
//             count++;
//             if( count == 45) break;
//        int count = 0;
//        do {
//            System.out.println(count);
//            count++;
//        }while (count<100);
        //тренер дал задание спортсмену.Он бросает кости , если выпадает любое значение от 1 жо 5 то он отжимается
        //а если выпадает шесть , то он отдыхает
        int[] results = {3, 5, 6, 2, 1};
        for (int result : results) {
            if (result ==6){
                System.out.println("Спортсмен отдыает " + result);
                continue;
            }
            System.out.println("Спортсмент отжимается");
        }
    }
}
