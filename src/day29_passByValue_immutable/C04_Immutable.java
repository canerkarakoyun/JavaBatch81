package day29_passByValue_immutable;

import java.util.Locale;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
        Immutable : degistirilemez
        Mutable : degistirilebilir

        En meshur Immutable class : String

         */
        String str="Yildiz Bank";

        System.out.println(str.toUpperCase());

        str.toLowerCase(); // yazdirirsak sadece bu satirda kucuk harf olur, orijinal deger degismez

        System.out.println(str); // Yildiz Bank

        str.substring(3,5); // Yazdirirsak di yazar, sonraki satira bu sekilde aktarmaz

        System.out.println(str); // Yildiz Bank

        // Java'da String gibi metin ifadelerde kullanabilecegimiz StringBuilder class'i da vardir

        StringBuilder sb=new StringBuilder("Java Bank");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb); // knaB avaJ , String olsaydi Java Bank yazdiracakti cunku Immutable

        sb.append(".");

        System.out.println(sb);

    }
}
