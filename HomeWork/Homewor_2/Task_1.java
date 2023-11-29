//class Answer {
//    public static StringBuilder answer(String QUERY, String PARAMS){
//        String line1 = PARAMS.replace("{", "");
//        String line2 = line1.replace("}", "");
//        String line3 = line2.replaceAll("\"", "");
//        StringBuilder result = new StringBuilder(QUERY.toString());
//        String[] arrayData = line3.split(", ");
//        for (int i = 0; i < arrayData.length; i++) {
//            String[] arrData = arrayData[i].split(":");
//            if (arrData[1].equals("null") == false) {
//                if (i != 0) {
//                    result.append(" and ");
//                    result.append(arrData[0]);
//                    result.append("=");
//                    result.append("'");
//                    result.append(arrData[1]);
//                    result.append("'");
//                }else{
//                    result.append(arrData[0]);
//                    result.append("=");
//                    result.append("'");
//                    result.append(arrData[1]);
//                    result.append("'");
//                }
//            }
//        }
//
//        // Напишите свое решение ниже
//        return result;
//    }
//
//
//}
//
//
//// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
////public class Printer{
//    public static void main(String[] args) {
//        String QUERY = "";
//        String PARAMS = "";
//
//        if (args.length == 0) {
//            // При отправке кода на Выполнение, вы можете варьировать эти параметры
//            QUERY = "select * from students where ";
//            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
//        }
//        else{
//            QUERY = args[0];
//            PARAMS = args[1];
//        }
//
//        Answer ans = new Answer();
//        System.out.println(ans.answer(QUERY, PARAMS));
//    }
//}