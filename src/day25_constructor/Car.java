package day25_constructor;

public class Car {
    /*
    Bu class b'z'm kaliphanemiz
    Bir araba olusturmak icin ihtiyacimiz olan veriable ve methodlari bu classda belirleriz.
    Sonra farkli class'larda araba olusturmamiz gerekirse bu class'dan bir obje olusturup
    burada belirlenen veriable ve methodlara gore araba olusturulur/

     */

    public String marka="Marka belirtilmedi";  // default deger olarak "Marka belirtilmedi" atamis olduk
    public String model="Model belirtilmedi";  // default deger olarak "Model belirtilmedi" atamis olduk
    public int yil;                           // deger atamadik
    public int fiyat;                          // deger atamadik

    public void benzinliArac(){
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+" km hiz yapar");
    }
}
