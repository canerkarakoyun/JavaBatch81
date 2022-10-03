package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan 2 sayi alip, bu sayilarin carpimini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2= scan.nextDouble();
        System.out.println("Carpim: " + sayi1*sayi2);
    }
}
