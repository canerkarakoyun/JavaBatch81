package day09_ternary;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        // kullanicidan bir sayi alin ve mutlak degerini yazdirin;

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        Double sayi= scan.nextDouble();

        System.out.println(sayi>=0?sayi:-(sayi));
    }
}
