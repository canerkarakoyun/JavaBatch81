package day27_staticKeyword;

public class C01 {

    static int sayi=10;
    int rakam=5;

    public static void main(String[] args) {

        /*
        Static variable'larin diger adi class variable'i.
        Instance variable'larin diger adi ise obje variable'lardir.

        Static variable'lar tum class'dan kullanilabilirken,
        instance olanlar static olmayan methodlarda direkt kullanilabilir.

        Instance variable'lara static method'dan ulasabilmek icin obje olusturmak gerekir.

        Instance variable'lar obje variable'i oldugu icin herhangi bir satirda
        instance variable'in degerinin ne oldugunu bulmak icin OBJE OLUSTURULAN SATIRDAN ITIBAREN
        kod incelenmelidir.

        Static variable'lar class variable'i oldugu icin herhangi bir satirda static variable'in
        degerini bulmak icin CLASS'IN BASINDAN ITIBAREN kod incelenmelidir.

         */

        C01 obj1=new C01();
        System.out.println("obj1'in rakam degeri : "+obj1.rakam); //5
        System.out.println("obj1'in sayi degeri : "+sayi); // 10

        obj1.rakam+=1; // 5+1=6
        sayi+=1; // 10+1=11

        System.out.println("1 artirdiktan sonra obj1'in rakam degeri : "+obj1.rakam); // 6
        System.out.println("1 artirdiktan sonra obj1'in sayi degeri : "+sayi); // 11

        C01 obj2=new C01();

        System.out.println("obj2'in rakam degeri : "+obj2.rakam); //5
        System.out.println("obj2'in sayi degeri : "+sayi); // 11

        obj2.rakam++; // 5+1=6
        obj2.sayi++; // 11+1=12

        System.out.println("1 artirildiktan sonra obj2'in rakam degeri : "+obj2.rakam); // 6
        System.out.println("1 artirildiktan sonra obj2'in sayi degeri : "+sayi); // 12



    }
}
