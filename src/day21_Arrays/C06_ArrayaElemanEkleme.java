package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayaElemanEkleme {
    public static void main(String[] args) {
        // C05'deki methodu kullanarak Array'e eleman ekleyelim

        String[] takimListesi={"Suleyman", "Osman"};
        String eklenecekIsim="Talha";

        takimListesi=C05_ArrayaElementEkleme.elemanEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));
    }
}
