package recap02;

import java.util.Locale;
import java.util.Scanner;

public class Q10_NestedTernary {
    public static void main(String[] args) {
        /*
        Final notu tanimlayiniz' Nested Ternary ile cozunu
        'A' -> "Gayet Basarili"
        'B' -> "Basarili"
        'C' -> "Ha gayret"
        Bu notlar disindakilere de "Digerleri.." yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sinav sonucunu (A,B ya da C) giriniz");
        char finalNotu=scan.next().toUpperCase(Locale.ROOT).charAt(0);

        String sonuc=  finalNotu=='A'?"Gayet Basarili"
                        : finalNotu=='B'? "Basarili"
                        : finalNotu=='C'? "Ha Gayret"
                        : "Digerleri..";
        System.out.println("sonuc = " + sonuc);


    }
}
