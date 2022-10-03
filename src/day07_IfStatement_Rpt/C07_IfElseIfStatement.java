package day07_IfStatement_Rpt;

import java.util.Scanner;

public class C07_IfElseIfStatement {
    public static void main(String[] args) {
        /*
        Bir onceki soruda kullanici negatif deger girerse uyaralim

        NOT: Birden fazla if - else - if birbirine baglanmissa son durum onemlidir.
             Eger else ile bitiyorsa butun ihtimaller kapsanıyor demektir.
             Ama else if ile bitiyorsa halen kapsanmayan durumlar (baska ihtimaller) olabilir.
             else geri kalan tüm olasiliklari toparlar.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas= scan.nextInt();

        if (yas<0) {
            System.out.println("Lutfen gecerli bir yas giriniz");
        } else if (yas<=65){
            System.out.println("EMEKLI OLAMAZSIN, "+(65-yas)+" YIL DAHA CALISMALISIN");
        } else {
            System.out.println("EMEKLI OLABILIRSIN");
        }
    }
}
