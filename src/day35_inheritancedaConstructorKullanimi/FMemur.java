package day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{
    /*
    Extends keyword kullanilan class'larda ister default cons. bulunsun
    istersek de biz yeni cons.lar olusturalim, Java Constructor'in ilk satirina
    super(); constructor call yazar.

    super(); constructor call default constructor'a benzer
    gorulmese de orada vardir ve calisir.
    Ancak biz ilk satira farkli bir constructor call yazarsak
    Java super();'i siler.

    Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak Java'nin
    default olarak olusturdugu constructor call her zaman parametresizdir, yani
    super(); seklindedir.
    Istersek parametreli constructor call olusturabiliriz.
     */

    FMemur(){
        System.out.println("Memur parametresiz constructor calisti");
    }

    FMemur (String isim){
        System.out.println("Memur parametreli constructor calisti");
    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur();
    }
}
