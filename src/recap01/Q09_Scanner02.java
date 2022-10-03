package recap01;

import java.util.Scanner;

public class Q09_Scanner02 {
    public static void main(String[] args) {
        /*
        Kullaniciya ad, memleket, su anki konum, yas, boy soran bir program olusturun
        Ayrica yasadiklari yeri seviyorlarsa bu bilgiyi yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String soyIsim= scan.nextLine();
        System.out.println("Lutfen memleketinizi giriniz");
        String memleket= scan.nextLine();
        System.out.println("Lutfen yasadiginiz konumu giriniz");
        String konum= scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy= scan.nextDouble();
        System.out.println("Yasadiginiz "+konum+" 'u seviyor musunuz? True/False");
        boolean seviyorMu= scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("soyIsim = " + soyIsim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);
    }
}
