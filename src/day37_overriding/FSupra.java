package day37_overriding;

public class FSupra extends EToyota{


    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private methodlar Override edilemez
        Eger child class'da parent class'daki private method ile
        ayni signature'da bir method olusturursanir
        bu overriding method OLMAZ
         */
    }

    @Override
    void motor() {
        System.out.println("Sirali 6 silindir 2JZ motor kullanir");

        /*
        @Override notasyonu Java'ya bir gorev verir.
        Java bu notasyonla birbiorine bagli olan 2 method'u surekli kontrol eder.
        Eger parent class'daki overriden method'u silerseniz CTE verir.

        @Override notasyonu kullanmak mecburi degildir. Her turlu calisir.
        Ancak Overriding method silinirse kodun CTE vermesini istersek
         @Override notasyonu kullanmaliyiz.
         */
    }
}
