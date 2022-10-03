package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar []=new int[3];

        System.out.println(sayilar); // [I@58372a00
        // non-primitive data turundeki datalari
        // her zaman direkt yazdiramayabiliriz
        // Array'i yazdirmak istersek Java'dak' Arrays classindan yardim isteriz

        System.out.println(Arrays.toString(sayilar));

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(Arrays.toString(sayilar));

        String sinifList[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList));

        sinifList[1]="Hasan";
        System.out.println(Arrays.toString(sinifList));

        // NOT: Array listesi icerisindeki icerikleri degistirebilirim
        // Ancak lenght degistirilmez.

        // Sadece Hasan'i yazdirmak icin

        System.out.println(sinifList[1]);

        // Sadece Ali'i yazdirmak icin

        System.out.println(sinifList[0]);
    }
}
