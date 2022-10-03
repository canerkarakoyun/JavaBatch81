package recap01;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 basamakli bir sayi alin, ilk 2 rakamini ve son 2 rakamini toplatin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        int ilkIki=sayi/1000;
        int sonIki=sayi%100;

        int ilkIkiToplam=(ilkIki/10)+(ilkIki%10);
        int sonIkiToplam=(sonIki/10)+(sonIki%10);

        System.out.println(ilkIkiToplam+sonIkiToplam);


    }
}
