package day10_stringManipulation;

public class C05_Lenght {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";

        System.out.println(str.length()); // str'in karakter sayisini dondurur

        System.out.println(str.charAt(str.length()-1)); // str'in son karakterini verir

        System.out.println(str.charAt(str.length()-3)); // str'in sondan 3. karakteini verir

        /*
        Java'da null pointer (pointer=isaretleyici) bir deger degil, karsisina yazildigi variable'in
        hicbir deger almadiginin bir isaretidir.
        */

        String str2="";
        // str2'ye bir deger atanmis midir? Evet. Deger=hiclik

        String str3=null;
        // str3'e bir deger atanmis midir? HAYIR.. null bir deger atamamayi isaret eder

        System.out.println(str2.length());
        System.out.println(str3.length());

        // null bir esitligin karsisinda olsa dahi bu bir atama degildir.
    }
}
