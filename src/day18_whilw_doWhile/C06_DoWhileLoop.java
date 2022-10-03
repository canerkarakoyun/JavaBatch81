package day18_whilw_doWhile;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan toplamak uzere pozitif tam sayilar isteyin
        islemi bitirmek icin 0'a basmasini isteyin
        kullanici yanlislikla negatif sayi girerse sayiyi dikkate almayin ve "Negatif sayi giremezsiniz"
        yazdirip basa donun.
        Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negatif sayi girdigini ve
        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozitifSayiAdedi=0;
        int negatifSayiAdedi=0;
        int pozitifSayilarToplami=0;

        do {

            System.out.println("Lutfen toplamak uzere pozitif tam sayi giriniz");
            sayi= scan.nextInt();
            if (sayi>0){
                pozitifSayilarToplami+=sayi;
                pozitifSayiAdedi++;
            }else if (sayi<0){
                negatifSayiAdedi++;
                System.out.println("Negatif sayi giremezsiniz");
            }

        }while (sayi!=0);

        System.out.println(pozitifSayiAdedi + "adet pozitif sayi girdiniz ve toplamlari : "+pozitifSayilarToplami);
        System.out.println(negatifSayiAdedi + " adet negatif sayi girdiniz, ancak onlar toplama dahil edilmedi");
    }
}
