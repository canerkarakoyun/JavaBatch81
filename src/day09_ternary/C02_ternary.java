package day09_ternary;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alalim, pozitif ise "Sayi Pozitif" yazdirin
        // negatif ise sayinin karesini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();

        // Eger ternary icindeki sonuclar farkli data turlerindeyse atama yapamayiz, sadece yazdirabiliriz.

        // double sonuc= sayi>=0 ? "Sayi Pozitif" : (sayi*sayi); // kod calismaz

        System.out.println(sayi>=0 ? "Sayi Pozitif" : (sayi*sayi));
    }
}
