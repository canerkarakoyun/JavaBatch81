package day08_IfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini yazmasini isteyin
        Girilen gun ismi gecerli bir gun ismi ise ilk 3 harfini, ilk harf buyuk, digerleri kucuk olarak yazdırın
        Geçersiz ise "Gecersiz bir gun ismi giriniz" seklinde uyarı yazdırınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutgen bir gun ismi giriniz");

        String gun=scan.nextLine().toLowerCase(Locale.ROOT);

        if (gun.equals("pazartesi")||(gun.equals("pazar"))){
            System.out.println("Paz");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");
        } else if (gun.equals("carsamba")) {
            System.out.println("Car");
        } else if (gun.equals("persembe")) {
            System.out.println("Per");
        } else if (gun.equals("cuma")||(gun.equals("cumartesi"))) {
            System.out.println("Cum");
        } else {
            System.out.println("Lutfen gecerli bir gun ismi giriniz");
        }
    }
}
