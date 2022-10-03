package day14_MethodCreation;

public class C04_MethodCreationReturn {
    public static void main(String[] args) {
        // verilen isim ve soy ismi ilk harfi buyuk, geriye kalanları * olacak sekilde degistirip bize bu halini
        // donduren bir method olusturun
        // Not: Programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmayi dusunuyoruz

        String isim="Enes";
        String soyisim="Bozkurt";

        String gizliIsım=isimGizle(isim, soyisim);
        System.out.println(isim+" "+soyisim);
        System.out.println(gizliIsım);
    }

    public static String isimGizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");

        return isim+" "+soyisim;
    }
}
