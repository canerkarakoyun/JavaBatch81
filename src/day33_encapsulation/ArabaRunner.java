package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        // arb1 objesi uzerinden marka variable'ina ulasabildim,
        // degistirebildim(set), yazdirabildim(get)

        Araba arb1=new Araba();
        arb1.marka="Toyota";
        System.out.println(arb1.marka); // Toyota

        // access modifier kullanarak marka variable'ina ulasimini tamamen serbest yapabilir
        // ya da tamamen engelleyebilirim
        // private yaptigimiz modele hic ulasamayiz
        // yani access modifier ya hep ya hic der

        // marka'yi degistirelim ama goremeyelim
        // yakiti da gorelim ama degistiremeyelim

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1. adim : ozel yetki tanimlayacagimiz variable'lari private yapin
        //           private bir dataya baska class'lardan ulasim mumkun olmadigindan
        // 2. adim : set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim

        arb1.setModel("Corolla"); // model olarak suprayi atadik
        // modeli yazdirma imkanimiz yok cunku getter method'u yok
        System.out.println(arb1.getYakit()); // Elektrikli bilgisini yazdirabildik
        // yakiti degistiremeyiz, cunku setter method'u yok
    }
}
