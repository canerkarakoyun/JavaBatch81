package day29_passByValue_immutable;

import java.util.Locale;

public class C05_Immutable {
    public static void main(String[] args) {

        String isim="Mine";

        isim=isim.toUpperCase(Locale.ROOT); // Atama yaparak kalici olarak degeri degistirebiliriz

        System.out.println(isim); // MINE

        isim="Mevlut";

        System.out.println(isim);

        /*
        Immutable objeler degistirlemezler, kesinlikle degistirilemezler.
        Peki yukarida ne oldu??

        isim variable'ina yeni deger atadigimizda stuck memory'deki referans deger degismemekle birlikte
        heap memory'de yeni bir obje olusturur ve eski obje cope gitmek uzere bosa cikar. Artik yeni
        objeyi kullanir Java.

        Onu da degistirince yeni obje, onu da degistirince yeni obje vs vs gider. For Loop olusturdugumuzda
        100 yeni obje olustursa 99 cop obje olusur ve bunlar hafizada gereksiz yer turar.
         */



        //
    }
}
