package day35_inheritancedaConstructorKullanimi;

public class GToyota {

    GToyota(){

        System.out.println("GToyota parametresiz cons");
    }

    GToyota(String isim){

        // super(isim);   extend olmadigi icin Java super constructor call kabul etmez
        System.out.println("GToyota parametreli cons");
    }
}
