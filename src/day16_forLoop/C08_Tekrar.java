package day16_forLoop;

import java.util.Scanner;

public class C08_Tekrar {
    public static void main(String[] args) {
         /*
        Kullanicidan 2 sayi isteyin.
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip sonucu yazdiran bir method yaziniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 pozitif tamsayi giriniz");
        int bas = scan.nextInt();
        int bitis = scan.nextInt();

        arasiniTopla(bas, bitis);
    }

    public static void arasiniTopla(int bas, int bitis) {

        int toplam = 0;

        if (bas <= bitis) {
            for (int i = bas; i <= bitis; i++) {
                toplam += i;
            }
        } else {
            for (int i = bitis; i <= bas; i++) {
                toplam += i;
            }

        }
        System.out.println("İki sayi arasindaki sayilarin toplami : " + toplam);
    }
}
