package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        binary search Java'da eleman aramanin kisa yoludur
        ancak binary search'un calismasi icin once array'in sirali hale getirilmelidir
        eger sirali hale getirmeden binary search yaparsak sonucu bulamayabilir ya da yanlis sonuc bulabilir
         */

        String [] harfler={"Y", "B", "D", "G", "O", "A"};

        String arananHarf="Y";
        System.out.println(Arrays.binarySearch(harfler, arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler, arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));

        // binary search bize aradigimiz elemanin indexini dondurur (int)
    }
}
