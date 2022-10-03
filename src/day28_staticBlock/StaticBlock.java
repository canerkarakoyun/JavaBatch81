package day28_staticBlock;

public class StaticBlock {

    static int sayi;
    static {
        /*
        Static block class uyelerinin tamamindan once calisir
        (main method'dan dahi once)

        Static block class olusturuldugunda calisir ve genellikle class ile ilgili
        on ayarlamalar veya static variable'lara deger atamak icin kullanilir.

        Static block'larin class icerisinde nerede oldugu onemli degildir
        once static block'lar calisir

        birden fazla static block varsa yukaridan asagi dogru calisir.


         */
        System.out.println("static block calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);
    }

    static {
        System.out.println("Main method altindaki static block calisti");
    }
}
