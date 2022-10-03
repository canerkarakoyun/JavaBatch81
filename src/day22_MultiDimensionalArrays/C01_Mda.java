package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        /*
        tek katli arraylerde array'i direk yazdiramiyoruz, cunku array nan-primitive data turudur
        ve her non-primitive data direkt yazdirilamayabilir.

        ancak arrayin icerisindeki elementleri direkt yazdirabiliriz.
        Cunku genelde primitive data turu ya da String elementler kullaniyoruz.

        Multi-dimensional arraylerde en cok dikkat etmemiz gereken konu;
        ulasmak istedigimiz element bir array mi yoksa primitive data turu mu?
         */

        int[][] sayilar={{1,2,4,5}, {3,4}};

        /*
        burada sayilar arrayini dusunursek icinde 2 tane inner array var
        sayilar[0] ==> [1,2,4,5]

        ancak en icerideki elementlere ulasabilirsek direkt yazdirabiliriz
         */

        System.out.println(sayilar[0]); // [I@58372a00, referans verdi, cunku outer arrayin 0. elementi de array
        System.out.println(Arrays.toString(sayilar[0])); // [1,2,4,5]

        System.out.println(sayilar[0][1]); // 2
        System.out.println(sayilar[1][0]); // 3

        System.out.println(Arrays.toString(sayilar)); // [[I@58372a00, [I@4dd8dc3]
        System.out.println(Arrays.deepToString(sayilar)); // [[1, 2, 4, 5], [3, 4]]

        /*
        Arrayi 2 sekilde deklere edebiliyorduk;
        1- Elemanlari direkt yazabiliriz, yukaridaki gibi
        2. Outer ve inner Array'lerin uzunluklarini belirtebiliriz

        int [][] sayilar=new int [3][4];

        ikinci yontemde outer Array'in 3 tane inner array'i vardir ve her bir inner arrayin de
        4 tane elementi vardir.
        Bu yontemde inner arrayin element sayilari ayni olmak zorunda.
        Farkli uzunluklarda inner arrayler olusturmak istiyorsak mecburen 1. yontemi kullanmaliyiz.
         */
    }
}
