package day07_IfStatement_Rpt;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfStatement {
    public static void main(String[] args) {
        // kullanicidan gun ismi isteyelim, hafta ici ya da hafta sonu yazdiralim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun= scan.next().toLowerCase(Locale.ROOT);
        // kullanici ne sekilde girerse girsin (pazar, Pazar, PAZAR, paZAr) tamamini kucuk harfe cevirmek icin toLowerCase

        if (gun.equals("pazar") || gun.equals("cumartesi")){
            System.out.println("Girilen gun HAFTASONU");
        }

        if (gun.equals("pazartesi")|| gun.equals("sali")|| gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma")){
            System.out.println("Girilen gun HAFTAICI");
        }

        if (!(gun.equals("pazar") || gun.equals("cumartesi") || gun.equals("pazartesi")|| gun.equals("sali")
                || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma"))){

            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
    }
}
