package day34_inheritance;

public class Isci extends Personel{

    /*
    Mormal hayatimizda parent cocuk sahibi olmaya karar verir
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.

    Mesela isci class'ini olusturunca nelere ihtiyaci var diye dusunsek
    Personel class'indaki tum variable ve method'lara ihtiyaci oldugunu gorebiliriz

    Bu durumda yeniden o variable ve methodlari olusturmak yerine Personel class'ini
    kendimize parent ediniriz.

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz.
    Class isminin yanina extends yazip hangi class'i parent edinmek istiyorsak ismini yazariz.

     Bir class baska bir class'i parent edindiginde;
     1. parent class'daki tum variable ve methods otomatik olarak sahip olur/
     2. parent class'daki variable ve methodlardan bazilarini kendine uyarlayabilir
     3. parent class'da olmayan bazi yeni variable ve methods olusturabilir

     Not: Parent class'daki variable ve methodlari reddedemez fakat gormezden gelebilir
     ya da degistirebilir.
     */

    int persNo=1001;
    public static void main(String[] args) {
        // an itibariyle isci class'inda ne bir variable ne de bir method var
        // Isci class'indan isci objeleri olusturalim

        Isci isci1=new Isci();
        System.out.println(isci1.isim); // Isim belirtilmedi
        // kendi class'imizda isim variable'i yok, babamin evinden aldim

        isci1.isim="Selim";
        System.out.println(isci1.persNo); // 1001
        // Kendi evimde persNo variable'i var once kendi evinde olani kullanir

        isci1.maas(); //
    }

    public void maas(){
        System.out.println("Isciler min 15 EUR saat ucreti alir");
    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
    }
}
