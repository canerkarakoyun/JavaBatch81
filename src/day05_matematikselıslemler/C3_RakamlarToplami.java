package day05_matematikselıslemler;

import java.util.Scanner;

public class C3_RakamlarToplami {
    public static void main(String[] args) {

        // kullanıcıdan 4 basamaklı bir sayi isteyin ve rakamların sayı degerlerini toplatın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi= scan.nextInt(); // 5267

        int birlerBasamagi=sayi%10;
        int sayi1=sayi/10;

        int onlarBasamagi=sayi1%10;
        int sayi2=sayi1/10;

        int yuzlerBasamagi=sayi2%10;
        int sayi3=sayi2/10;

        int binlerBasamagi=sayi3%10;

        int rakamlarToplami=birlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi;

        System.out.println(sayi + " sayisinin rakalari toplami: " + rakamlarToplami);

    }
}
