package recap01;

import java.util.Scanner;

public class Q02_YolHizZaman {
    public static void main(String[] args) {
        /*
        Kullanicidan mesafe ve gidilecek ortalama hizi isteyip gidilecek sureyi yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gidilecek mesafeyi giriniz");
        double mesafe= scan.nextDouble();

        System.out.println("Lutfen ortalama hiz bilgisini giriniz");
        double hiz= scan.nextDouble();

        double sure=mesafe/hiz;

        System.out.println("Sure : " + sure +" saat");
    }
}
