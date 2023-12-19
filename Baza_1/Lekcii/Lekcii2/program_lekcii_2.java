package Baza_1.Lekcii.Lekcii2;

public class program_lekcii_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< 100;i++) {
            sb.append("+");
//            System.out.println(sb);
        }
        String str  = " Язык прогаммирования Java ";
        String str_1 = "Язык программирвоания Python";
        String sroka = str.concat(str_1);
        System.out.println(sroka);

    }


}

