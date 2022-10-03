package day19_scope;

public class C03_ClassVariables {

    public static void main(String[] args) {
        /*
        Farklı bir class'da calisirken herhang bir class adini yazip "." (nokta)'ya basarsak
        adini yazdigimiz class'daki tum static class uyelerini gorebilir ve kullanabiliriz.
         */

        C02_StaticVariables.staticMethod(); // 10   Bu satir calistiginda Java direkt C02'de bulunan staticMethod()'a
                                                    // gider ve oncesi yokmus gibi direkt o methodu calistirir.
                                                    // onceki methodlari calistirmadigi icin de variable'a ilk atanan
                                                    // degeri gorur, sonraki degisiklikleri gormez.
        System.out.println(C02_StaticVariables.staticSayi); // 10
        System.out.println(C02_StaticVariables.degersizStaticVar); // 0 (deger atanmamis, asagidaki notu oku)

        /*
        Class level variable'lara deger atayip atamamak bize kalmistir, istersek deger atamasi yapariz
        istemezsek deger atamayiz.
        Eger deger atamissak Java atadigimiz o degeri kabul eder.
        Deger atamamissak Java bu variable'lara default bir deger atamasi yapar.
        Bu default degerler de;
        int --> 0
        String --> null
        boolean --> false
        char --> '' (hiclik)
         */

        /*
        Baska class'lardaki intance variable'lara obje olusturarak ulasabiliriz
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod(); // 10
        // olarak yazdirir ve ardindan statik sayiya 20 atar.
        System.out.println(obje1.isim); // Mehmet
        System.out.println(obje1.degersizInstanceVar); // 0 (deger atanmadigi icin default deger yazdirir)


        System.out.println(C02_StaticVariables.staticSayi); // 20 (asagidaki notu oku)

        /*
        35. satirda calisan method staticSayi'yi 10 olarak yazdirdi ve sonra degerini 20 yapti.
        bu satirdan sonraki kullanimlarda artik staticSayi degeri 20'dir.
        Yazdirdigimizda bunu gorduk.
         */

        /*
        Farkli bir class'dan C02 clasindan method ve variable'lari kullandigimda
        C02 class'inin tamami edgil, sadece benim cagirdigim class uyeleri calisir.
         */




    }
}
