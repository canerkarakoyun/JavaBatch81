package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {

        // Iki sekilde Array olusturabiliriz

        int sayilar[]={1,2,3};

        String harfler[]=new String[4];

      // harfler[0]="a";
      // harfler[1]="b";
      // harfler[2]="c";
      // harfler[3]="d";

        System.out.println("Sayilar Array'inin uzunlugu : "+ sayilar.length);
        // String.length() methodunda parantez var, Array oldugunda parantez olmaz

        System.out.println("Harfler Array'inin uzunlugu : "+ harfler.length);
        System.out.println(Arrays.toString(harfler)); // [null, null, null, null]

        // harfler Array'inin son elementini yazdiralim;

        System.out.println(harfler[harfler.length-1]);

        System.out.println(harfler[5]); // ArrayIndexOutOfBoundsException


    }
}
