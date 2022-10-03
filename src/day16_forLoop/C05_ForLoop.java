package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan 2 sayi isteyin.
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip sonucu yazdiran bir method yaziniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 2 pozitif tamsayi giriniz");
        int bas= scan.nextInt();
        int bitis= scan.nextInt();

        aralariTopla(bas, bitis);

    }

    public static void aralariTopla(int bas, int bitis) {

        int toplam=0;
        if (bas<=bitis){
            for (int i = bas; i <=bitis ; i++) {
                toplam+=i;
            }
        } else

        for (int i = bitis; i <= bas; i++) {
            toplam+=i;

        }
        System.out.println("Aradaki sayilarin toplami : "+toplam);
    }
}
