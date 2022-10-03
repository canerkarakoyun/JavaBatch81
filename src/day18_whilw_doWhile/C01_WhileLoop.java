package day18_whilw_doWhile;

import java.util.Locale;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis harfleri alin ve baslangic harfinden baslayip bitis harfinde biten tum
        harfleri BUYUK harf olarak ekrana yazdirin
         */

        char ilkHarf='f';
        char sonHarf='t';

        char temp=ilkHarf; // ilk harfi muhafaza etmek icin
        String buyult="";

        while (temp<=sonHarf){

            buyult=(temp+"").toUpperCase(); // +"" eklememizin sebebi sol taraf String, sag taraf char, Java kabul etmez. Sag tarafi string yapmak icin
            System.out.print(buyult+" ");
            temp+=1;
        }
    }
}
