package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe {
    protected int saatUcreti=9;
    protected int gunlukMesai=8;


    protected void maas(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void issizlikSigorta(){
        System.out.println("Yan hizlerliler %30 indirimli issizlik sigortasi yaptirabilir");
    }

    public static void main(String[] args) {
        /*
        Overriding child class'daki bir method'un parent class'daki
        ayni isimdeki methodu etkisiz hale getirerek kendisinin
        spesifik ozelligini ortaya cikarmasidir.

        Overriding'i nerede dikkare aliyoruz;
        bir obje olusturulurken data turu ve constructor farkli ise

        Eger bir obje olusturulurken data turu ve constructor farkli ise
        objenin ozelliklerini belirlerken 3 konuya dikkat etmeliyiz
        1. Obje constructor'un oldugu class'da olusur
        2. Objenin ozelliklerini aramaya data turunun oldugu class'dan baslariz
           bu class'da aranan ozellik bulunamazsa varsa parent class'lara bakilir
           orada da bulamazsa CTE verir

          Eger aranan ozellik variable ise buldugumuz ilk degeri yazdirir
        3. Aranan ozellik method ise;
           degeri yazdirmadan once child class'larda override edilmis mi diye bakar Java
           eger override edildiyse en guncel degeri yazdirir
         */


        BMuhasebe yh1=new EYanHizmetler();

        System.out.println(yh1.gunlukMesai); //
        System.out.println(yh1.saatUcreti); //
        yh1.maas(); //
        yh1.ozelSigorta(); //
        yh1.sigorta(); //
        System.out.println(yh1.isim); //
        System.out.println(yh1.soyisim); //
        System.out.println(yh1.departman); //

    }
}
