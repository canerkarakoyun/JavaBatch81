package day38_exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {

        /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
        Kullaniciya index sorup, o index'de bulunan urunu yazdiran bir program yazalim
        Kullanici urun sayisindan buyuk bir index girerse
        exception hatasi vermesinin onune gecelim
         */

        String[] urunler={"Nutella","Cokokrem","Sut","Cay","Findik"};

        Scanner scan=new Scanner(System.in);
        System.out.println("Istediginiz urunun sira numarasini giriniz");

        int istenenSira=0;

        try {
            istenenSira= scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Urun index'i icin bir tam sayi girmeniz gerekir");
        }
        /*
        Catc blogunun onundeki parantez'de exception class'inin ismi ve
        yaninda yakalanan exception'i atadigimiz variable'in ismi olur.
        Otomatik olusturursak e olur.

        Eger yakalanan exception ile ilgili bilgileri kullaniciya vermek istersek
        bu objeyi kullanabiliriz.

        Eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa e'yi kullanmayabiliriz
        Kod blogu calisir.
         */

        try {
            System.out.println("Aradiginiz urun : "+ urunler[istenenSira-1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira numarasi listemizde buluhmuyor"+
                    "\nSira numarasi en fazla "+urunler.length+" olabilir.");
        }
    }
}
