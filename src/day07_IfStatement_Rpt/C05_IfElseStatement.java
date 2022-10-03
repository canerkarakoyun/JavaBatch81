package day07_IfStatement_Rpt;

import java.util.Scanner;

public class C05_IfElseStatement {
    public static void main(String[] args) {
        // Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if ((karakter>='a' && karakter<='z') || (karakter >='A' && karakter>='Z')) {
            System.out.println("Karakter bir harftir");
        } else {
            System.out.println("Karakter harf degildir");
        }

    }
}
