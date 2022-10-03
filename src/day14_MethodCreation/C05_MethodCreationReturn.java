package day14_MethodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        // Eger bir class'ın icerisinde herhangi bir hesaplama yapip bunu da saklamak istersek
        // Kodumuzu sade ve anlasilir tutmak icin islemi bir method'da yapip
        // Sonucunu main methoda dondurebiliriz.
        // Bu durumda return typ'ı void olmayan bir method'un sonucunu main method'da bir veriable'a atama yaparsak
        // programin geri kalanında bu yeni degeri kullanma sansimiz olur.

        // kullanicidan sehir ismini ve dogum tarihini alin.
        // Sehir ismini programımızda buyuk harf olarak, tarihi ise 2022-06-30 formatında kullanmak istiyoruz.
        // Bunları programda istedigimiz formata ceviren bir method yazın.

        String sehir=sehirAl();
        String tarih=tarihAl();

        System.out.println("Girdiginiz sehir : "+sehir);
        System.out.println("Girdiginiz tarih : "+tarih);

    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("Yil giriniz");
        int yil= scan.nextInt();
        if (yil>1900 && yil<2100){
            tarih=yil+"-";
        } else {
            System.out.println("yil icin gecerli bir deger girmelisiniz (1900-2100)");
        }
        System.out.println("Kacinci ay oldugunu tam sayi olarak yaziniz");
        int ay= scan.nextInt();

        if (ay<0||ay>12){
            System.out.println("Ay numarası 1-12 araligi olmalidir");
        } else if (ay<10){
            tarih=tarih+"0"+ay+"-";
        } else {
            tarih=tarih+ay+"-";
        }

        System.out.println("Lutfen ayin kacinci gunu oldugunu tam sayi olarak giriniz");
        int gun= scan.nextInt();
        if (gun<=0 || gun>31){
            System.out.println("Gun olarak 1-31 arasında bir sayi girilmelidir");
        } else if (gun<10){
            tarih=tarih+"0"+gun;
        } else {
            tarih=tarih+gun;
        }
        return tarih;
    }

        public static String sehirAl() {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen sehir ismi giriniz");
        String sehirAdi=scan.nextLine().toUpperCase();

        return sehirAdi;

    }
}
