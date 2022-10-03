package day25_constructor;

public class C01 {

    /*
    Java OOP konsept kullandigindan olusturulan her bir class'in ihtiyac oldugunda
    obje uretilebilmesine uygun dizayn edilmistir.
    Ama her class'dan obje uretilmeyebilir.

    Bunun icin Java ihtiyac halinde kullanilmasi icin her class'da default bir contructor koymustur.
    (Yedek lastik gibi, var ama gormeyiz.

    Bu default constructor class'dan obje olusturuldugunda otomatik olarak calisir

    Ornegin, bu Class'da constructor gorunmemesine ragmen C02 class'inda icinde oldugumuz
    C01 class'indan bir obje uretebildik.
     */

    int sayi;

    public void denem(){
        System.out.println("C01'den deneme methodu calisir");
    }
}
