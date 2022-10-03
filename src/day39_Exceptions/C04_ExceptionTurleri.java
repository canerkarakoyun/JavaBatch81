package day39_Exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {

        String str;
        /*
        System.out.println(str);
        deger atamasi yapmadan bir variable'i kullanmaya calistigimizda
        Java Compile Time'da bunu fark eder ve size izin vermez.
        Bu durumda diger tum kodlarimiz da calismaz.

        Bu durumda deger atanmadigini belirtmek icin str=null; pointeri kullanabiliriz.
        Compile Time Error vermez.
         */
        str=null;

        System.out.println(str);
        // System.out.println(str.length()); // NullPointerException verir

        Object obj="Java Java Java";
       // Integer sayi=(Integer) obj;

        /*
        Java bazi casting islemlerine Compile Time'da izin vermez.
        BAzen syntex uygun olabilir, bu durumda Java kodun calismasina engel olmaz.
        Ancak calisinca Run Time Exception verir.
         */
    }
}
