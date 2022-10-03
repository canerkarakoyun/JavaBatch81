package day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim="Grandpa ismi belirtilmedi";
    /*
    Her class'da gorunmese bile bir constructor vardir, bu classdan obje olusturmak istedigimizde
    default constructor devreye girecektir.

    Default constructor'u gozlemleyemecegimiz icin onun yerine parametresiz constructor olusturalim
     */
    protected String grandpaKlupAdi="Grandpa klubu";

    AGrandParent (){
        System.out.println("Grandpa constructor calisti");
    }
}
