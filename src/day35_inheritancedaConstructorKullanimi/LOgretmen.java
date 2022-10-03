package day35_inheritancedaConstructorKullanimi;

public class LOgretmen {

    LOgretmen(){

        System.out.println("Logretmen parametresiz cons");
    }

    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen parametreli cons");
    }
}
