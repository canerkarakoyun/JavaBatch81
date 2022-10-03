package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        Bazen tek degisken sorunu cozmeye yetmez. Ornegin kullanicidan sayi alip kac basamakliysa ona gore
        yildizlama yapacalim.

        *
        **
        ***
        ****
        *****
         */

        // yanyana 3 tane yildiz yap

        for (int i = 1; i <= 3; i++) {
            System.out.print("* ");

        }

        // yanyana 4 tane yildiz yap
        System.out.println("");
        for (int i = 1; i <= 4; i++) {
            System.out.print("* ");
        }
        System.out.println("");

        // bu tur durumlarda ic ice loop kullanmak gerekir. birisi satirlari sayacak, digeri de satir sayisi kadar
        // loop olusturacak

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
