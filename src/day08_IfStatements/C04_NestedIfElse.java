package day08_IfStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan 4 basamakli bir sayi isteyin, sayi 5'e bolunuyorsa son rakamina bakin, "0" ise
        ekrana "Sayi 5'e bolunebilen cift sayi" yazdirin.
        Son rakam 5 ise ekrana "sayi 5'e bolunebilen tek sayidir" yazdirin

       Sayi 5'e bolunmuyorsa ekrana "Lutfen tekrar deneyiniz" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Lutfen 4 basamakli bir sayi giriniz");

        } else if (sayi % 5 == 0) { // sayi 4 basamakli ve 5'e bounebiliyor.
            if (sayi % 10 == 5) {
                System.out.println("Sayi 5 ile bolunebilen tek sayi");
            } else if (sayi % 10 == 0) {
                System.out.println("Sayi 5 ile bolunebilen cift sayi");
            }

        } else { // sayi 4 basamakli fakat 5'e bolunemiyor
            System.out.println("Tekrar deneyin");
        }
    }
}
