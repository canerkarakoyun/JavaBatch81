package day26_constructor;

public class Kamyon {

    public String marka="Marka belirtilmedi";
    public String model="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;

        /*
        Bizim temel amacimiz kamyonRunner'da argument olarak
        girilen degerinKamyon class'indaki veriable'a atanmasi.
        Ancak scope konusunda ogrendigimiz gibi;
        Kamyon constructor scope'unda marka oldugu icin
        instance markaya gitmiyor.

        Bu karisikligi gidermek icin instance veriable'lari
        belirli hale getirmemiz lazim.
        Java da bunun icin "this" keyword'u olusturmustur.

        her bir veriable'in basina this. yazarsak Java bunlarin
        instance variable'lerin karsiligi oldugunu anlar.

        Genel kullanim acisindan this keyword'u kodu herkesin
        anlamasini kolaylastirdigi icin tercih edilir.

        Fakli bir edlandirma da ise yarar ama anlasilmasi zordur,
        ancak java yazan herkes this keywordunu bilir ve sag tarafin argument
        sol tarafin ise instance variable olmasidir
         */

    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    Kamyon(){
        this("Man", "Model bilinmiyor"); // constructor call

    }

    @Override
    public String toString() {
        return
                "\nmarka=" + marka +
                "\nmodel=" + model +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat;
    }
}
