package day08_IfStatements;

import java.util.Scanner;

public class C05_NestedIfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre isteyin.
        Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.
        A ise gecerli sifre, degilse Gecersiz Sifre yazdirin.
        İlk harf kucuk harf ise "z" olup olmadigini kontrol edelim. z ise "Gecerli Sifre", degilse "Gecersiz Sifre"
        yazdiralim.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz.");

        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf >= 'a' && ilkHarf <= 'z') {
            if (ilkHarf == 'z') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }

        } else if (ilkHarf >= 'A' && ilkHarf <= 'Z') {
            if (ilkHarf == 'A') {
                System.out.println("Gecerli Sifre");
            } else {
                System.out.println("Gecersiz Sifre");
            }

        } else {
            System.out.println("Ilk karakter bir harf olmalidir");
        }
    }
}
