package day19_scope;

public class C01_InstantVariables {

    /*
    class icerisinde her yerden kullanmak istedigimiz variable'ları class level'da
    (class'ın icinde ama method'ların disinda olusturmaliyiz.
    Genellikle de class level variable'lar class'in basinda, class isminin hemen altinda olusturulur.
    Bu sart degildir.

    Class Level'daki variable'lar icin 2 scope vardır.

   1. Static variables (Class variable'lari denir)
   2. Instance (static olmayan9 variables (oble variable'lari denir)
     */

    int instSayi=20; // static olmayip class levelda oldugu icin instance variable'dir.

    public static void main(String[] args) {
    int sayi=10;

        // System.out.println(instSayi);
        /*
        instance variables static olmadigi icin static kulup'e uye olmayan main method'dan direkt olarak cagiramayiz.
        instance variable'larin diger adi object variable'laridir
        dolayisiyle obje olusturursaniz instance variable'lari heryerden kullanabilirsiniz
        hadi yapalim :)
         */
        C01_InstantVariables obje1=new C01_InstantVariables();     //  artık bir objem var
        System.out.println("obje1 degismeden once : "+obje1.instSayi); // 20    (busekilde instSayi'yi cagirabiliriz)
        obje1.instSayi=30;
        System.out.println("obje1 degistikten sonra : "+obje1.instSayi);

        C01_InstantVariables obje2=new C01_InstantVariables();
        System.out.println("obje2 degismeden once : "+obje2.instSayi); // 20
        obje2.instSayi=25;
        System.out.println("obje2 degistikten sonra : "+obje2.instSayi);

        C01_InstantVariables obje3=new C01_InstantVariables();
        System.out.println("obje3 degismeden once : "+obje3.instSayi);

        /*
        her obje olusturuldugunda instance (obje) variable'inin ilk atanan degerini alir..
         */

    }

    public static void staticMethod(){
        // System.out.println(sayi);
        /*
        Bir method'un icerisinde olusturulan bir veriable
        sadece o method'un icerisinde kullanilabilir.
        (Local variable)
         */

        /*
        instSayi=30;
        instance variable'lara main method disindaki diger static method'lardan da ulasamayiz.
        ayni sekilde obje olusturmamiz gerekir.
         */

        C01_InstantVariables obje4=new C01_InstantVariables();
        System.out.println(obje4.instSayi);


    }

    public void staticOlmayanMethod(){

        System.out.println(instSayi);

        /*
        instance variable'lar class icerisindeki static olmayan methodlardan direkt kullanilabilir.
         */



    }
}
