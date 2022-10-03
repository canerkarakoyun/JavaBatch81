package recap02;

import java.util.Scanner;

public class Q06_Scanner {
    public static void main(String[] args) {

        /*
        Bir iscinin isi bitirme suresini ve toplam isci sayisini alarak isin bitme suresini hesaplayan kodu yazin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Isi bir isci kac gunde yapabilir?");
        double gun= scan.nextDouble();
        System.out.println("Lutfen kac iscinin calisacagini belirtiniz");
        double isciSayisi= scan.nextDouble();

        double isinSuresi=gun/isciSayisi;

        System.out.println("isinSuresi = " + isinSuresi);
    }
}
