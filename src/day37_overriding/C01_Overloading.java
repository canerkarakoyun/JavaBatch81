package day37_overriding;

public class C01_Overloading {
    public static void main(String[] args) {
    /*
    Bir class'da ayni isimde ve ayni signature'a sahip iki method olamaz
    Ayni class'da ayni isimde birden fazla method olusturmak istersek
    mutlaka signature'i degistirmeliyiz.

    Farkli class'larda ayni isim ve signature'a sahip 2 method olabilir mi? Evet, olabilir.
     */

    }

    void ekleme(){

    }

    void ekleme(int sayi){

    }

    void ekleme(String str){

    }

    void ekleme(String str, int sayi){

    }

    void ekleme(int sayi, String str){

    }

}
