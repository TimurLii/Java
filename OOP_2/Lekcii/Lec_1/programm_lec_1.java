package OOP_2.Lekcii.Lec_1;

public class programm_lec_1 {
    static double distanse (int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2- y1, 2));
    }
    public static void main(String[] args) {

        int ax =0;
        int ay =0;
        int bx =0;
        int by =0;
        System.out.println(distanse(ax,ay,bx,by));

    }
}
