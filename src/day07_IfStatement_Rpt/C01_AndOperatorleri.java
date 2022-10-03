package day07_IfStatement_Rpt;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println(a>0 && b<20 && c>b); // && (And) Operatoru nedeniyle True, True, True.. Sonuç True yazdırır
        System.out.println(a<0 && b<20 && c>b); // && (And) operatoru nedeniyle False, True, True.. Sonuç False yazdırır.

        /*
        Java and operatoru konusunda bize 2 secenek sunar.. Eger && kullanırsak ilk FALSE buldugunda artık sonucun
        false olacagini bilir ve geri kalan sartlari incelemez

        Ama & kullanirsak tum sartlari kontrol eder ve sonra sonucu belirler.

        Bu nedenle & operatoru, && operatorune gore daha yavas calisir.
         */

        System.out.println(a<0 & b<20 & c>=b); // False... tek & isareti kullanildiginda tum parametreleri inceler
    }
}
