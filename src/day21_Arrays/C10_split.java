package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        Split() methodu bir array methodu degil String methodudur, Array dondurur

        split() ile herhangi bir stringi parcalara bolup bir array haline getiriyoruz
         */

        String str="Java, ne kadar guzel.";
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, ne, kadar, guzel]

        String[] kelimelerNe=str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe)); // [Java ,  kadar guzel]

        String[] kelimelerE=str.split("e");
        System.out.println(Arrays.toString(kelimelerE)); // [Java n,  kadar guz, l]

        String[] karakterler=str.split(""); // hiclikten bolmek
        System.out.println(Arrays.toString(karakterler));
        // [J, a, v, a, ,,  , n, e,  , k, a, d, a, r,  , g, u, z, e, l, .]
    }
}
