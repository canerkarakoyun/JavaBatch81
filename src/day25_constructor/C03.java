package day25_constructor;

public class C03 {

    /*
    Proje yaparken bazi classlar run etmek icin degil verable ve method
    olusturup bunlari baska class'lardan kullanmak icin olusturulur.

    KALIPHANE
     */

    /*
    Default constructor parametresizdir, goremesek bile
    ihtiyac oldugunda calisir

    Ancak class icerisinde parametreli ya da parametresiz herhangi bir
    constructor olusturursak Java default constructor'i siler.
     */

    C03(){

    }

    /*
    Olusturdugumuz parametresiz bu constructor default constructor ile
    birebir aynidir ama artik bu default constructor degildir.

    Parametresiz constructor diyebiliriz.
     */

    String isim="Etka";

    public void method01() {
        System.out.println("C03 method calisti");
    }
}
