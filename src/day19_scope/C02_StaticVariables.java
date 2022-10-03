package day19_scope;

public class C02_StaticVariables {

    static int staticSayi=10;
    String isim="Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVar;
    /*
    class level'daki variable'lara deger atamasak da Java kabul eder, itiraz etmez.
     */

    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa objeler icin degil class icin gecerlidir.
         */

        // ONEMLI NOT: Class'in hangi satirinda kodun ne yazdiracagini anlamak istiyorsak
        // class'in basindan (main method'dan) asagi kadar tum kodlari takip etmemiz gerekir

        System.out.println(staticSayi); //10
        staticMethod();
        staticSayi=12;
        System.out.println(staticSayi); //12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi); //

        /*
        instance bir variable'ın degerini bulmak icin objenin olusturulmasindan itibaren istenen
        satira kadar kodu takip etmeliyiz.

        Static variable icin ise class'in en basindan baslayarak istenen satira kadar kodu takip edip
        static veriable'in son degerini bulmak gerekir.
         */
    }

    public static void staticMethod(){

        System.out.println(staticSayi); // 10 yazdirir cunku staticMethod()'u deger degismeden once cagirdik.
                                        // direkt cekti cunku static klube uye


    }

    public void staticOlmayanMethod(){
        /*
        static variable'lar class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum method'lar static variablle'lari gorebilir ve degistirebilirler.

        farklı method'larda static variable'ın hangi degeri alacagini bilmek istiyorsak
        class'in basindan itibaren kodun calismasni takip etmemiz gerekir.
        method ne zaman cagrilirsa o anki static variable degerini method'da kullanabiliriz
         */

        System.out.println(staticSayi); // 17. satirda staticOlmayanMethod'u obje kullanarak
                                         // cagirdik, yoksa bu method'a geçerek yazdirmaz.
                                        // direkt cekti cunku static klube uye

        staticSayi=20;



    }
}
