package day10_stringManipulation;

import java.util.Locale;

public class C01_charAt {
    public static void main(String[] args) {

        String str="Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harfi yazdirir J

        System.out.println(str.toUpperCase(Locale.ROOT).charAt(7)); // 7. harfi büyük olarak yazdirir R

        System.out.println(str.charAt(21)); // son harfi verir L

        System.out.println(str.charAt(22)); // StringIndexOutOfBoundsException

        // son harfi bulmak icin str'ın uzunlugunun bir eksigini index olarak gireriz
        // eger index olarak uzunlugu  veya daha bir sayiyi girersek Java exception verir

        // charAt() kullandgimizda sonuc char olacagi icin artik manipulation yapamayiz
        // String method'larda kullanmamuz gereken bir method varsa charAt()'den once kullanmaliyiz
    }
}
