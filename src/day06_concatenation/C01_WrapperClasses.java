package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*
        Wrapper class javanin hazir methodlari kullanabilmemiz icin
        primitive data türleri
         */

        String str="Java ile hayat guzeldir";

        System.out.println(str.toUpperCase()); // JAVA ILE HAYAT GUZELDIR

        boolean guzelMi=true;
        // guzelMi. yazdigimizda method cikmaz cunlu boolean primitive data tipi

        Boolean buGuzelMi=true;
        buGuzelMi.toString();
        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32767

        String ogrNo="123456";

        // Kullanicidan sifre isteyin
        // Eger sifre sadece rakamlardan olusuyorsa sifreyi kabul etmeyelim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre girin");

        String sifre= scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("Girilen sifre: " + sifre);
        System.out.println("Integer Sifre: " + sifreSayi);

        System.out.println("Girilen sifre: " + (sifre+3));
        System.out.println("Integer Sifre: " + (sifreSayi+3));

        /*
        !!! Wrapper classlar ileride cok isimize yarayacak cok sayida hazir method icerir!!!
         */
    }
}
