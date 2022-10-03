package recap02;

import java.util.Scanner;

public class Q05_Scanner {
    public static void main(String[] args) {
        /*
        Kullanicidan a' b ve c icin sayilar isteyin ve bu sayilarla asagidai islemi yaptirip sonucu yazdirin.
        a'nin karesinden b'nin karesini cikartip c'nin 3 katina bolunuz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("a sayisini giriniz");
        double a= scan.nextDouble();
        System.out.println("b sayisini giriniz");
        double b= scan.nextDouble();
        System.out.println("c sayisini giriniz");
        double c= scan.nextDouble();
        double sonuc=(a*a-b*b)/(c*3);

        System.out.println("sonuc = " + sonuc);
    }
}
