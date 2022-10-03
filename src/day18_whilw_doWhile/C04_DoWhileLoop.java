package day18_whilw_doWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan tam sayilar alin, kullanici cift sayi girdigi muddetce sayilari yazdirin,
        tek sayi girerse islemi bitirin
         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;

        // while ile
        /*
        Loop'larda kullanacagimiz variable'lari loop'dan once olusturmaliyiz
        While Loop'da loop'dan once olusturdugumuz bu variable'a atayacagimiz deger cok onemli
        cok iyi dusunerek deger atamaliyiz. Aksi halde kodumuz calismayabilir.
         */

        while (sayi%2==0){
            System.out.println("Lutfen bir tam sayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
            } else{
                System.out.println("Girilen sayi tek, benden bu kadar");
            }
        }

        // Do While Loop ile

        // do whihle loop'da onceden olusturulan variable'a hangi deger atandiginin hicbir onemi yok
        // kodumuz her turlu calisir.

        /*
        do-while'in DEZAVANTAJI: ilk calistirma kontrol yapilmadan gercekleseceginden loop'un
        body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir.
         */

        do {

            System.out.println("Lutfen bir tam sayi giriniz");
            sayi= scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : "+sayi);
            } else{
                System.out.println("Girilen sayi tek, benden bu kadar");
            }

        }while (sayi%2==0);
    }
}
