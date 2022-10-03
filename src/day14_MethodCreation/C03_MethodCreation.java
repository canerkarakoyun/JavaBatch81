package day14_MethodCreation;

import java.util.Locale;

public class C03_MethodCreation {
    public static void main(String[] args) {
        // Input olarak verilen isim ve soyismi ilk harfi BUYUK geriye kalan harfler * olacak sekilde
        // C**** K******** gibi yazdiralim

        String isim="Enes";
        String soyisim="Bozkurt";

        ismiGizle(isim, soyisim);
        C02_MethodCreation.rakamlariTopla(654);
    }

    private static void ismiGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
        System.out.println(isim+" "+soyisim);


    }
}
