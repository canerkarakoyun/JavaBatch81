package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir harf isteyin
        kucuk harf ise konsola "Kucuk Harf" yazdirin
        buyuk harf ise konsola "Buyuk Harf" yazdirin
        yoksa "Girdiginiz karakter harf degil" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        String sonuc= (harf>='a' && harf<='z') ? ("Kucuk Harf") :
                ((harf>='A' && harf<='Z') ? "Buyuk Harf" : "Gecersiz karakter"); // parantezler kodun anlasilmasini saglar

        String sonuc2= harf>='a' && harf<='z' ? "Kucuk Harf":
                harf>='A' && harf<='Z' ? "Buyuk Harf": "Gecersiz karakter"; // parantezler olmadiginda kod calisir ama anlamak zordur

        System.out.println(sonuc);
        System.out.println(sonuc2);
    }
}
