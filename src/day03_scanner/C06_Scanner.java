package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // kullanicidan ismini, soyismini, yasini isteyin. Isim Soyisim Yas seklinde yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen Soyadinizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println(isim+' '+soyisim+' '+ yas);

    }
}
