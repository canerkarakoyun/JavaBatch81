package day07_IfStatement_Rpt;

import java.util.Scanner;

public class C06_IfElseStatement {
    public static void main(String[] args) {
        //kullanicidan yasini isteyelim, eger yasi 65'den buyukse "EMEKLI OLABILIRSIN" degilse "EMEKLI OLAMAZSIN" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int yas= scan.nextInt();

        if (yas<=65) {
            System.out.println("EMEKLI OLAMAZSINIZ, "+(65-yas) + " YIL DAHA CALISMALISINIZ");
        } else {
            System.out.println("EMEKLI OLABILIRSINIZ");
        }
    }
}
