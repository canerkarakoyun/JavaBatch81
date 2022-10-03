package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_Lists {
    public static void main(String[] args) {

        // List <int> sayilar=new ArrayList<>();
        /*
        List primitive data turlerini kabul etmez, o yuzden altini cizdi.
        Type argument cannot be of primitive type

        Bu yuzden sayi listesi yapmak istiyorsak wrapper class kullanabiliriz
        Asagidaki gibi olmali
         */

        List <Integer> sayilar=new ArrayList<>();

        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(7);
        System.out.println(sayilar); // [5, 3, 7]
        // sadece add methodu kullanirsak java yeni elemani sona ekler

        sayilar.add(2, 10); // indexi 2 olan yere 10 elementini ekleyelim

        System.out.println(sayilar); // [5, 3, 10, 7]
        // add(index, element) istedigimiz elementi istedigimiz yere yerlestirir
        // add methodu eski elementleri silmez veya update etmez, yeni elementi ekler
    }
}
