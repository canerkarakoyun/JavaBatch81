package day11_StringManipulations;

import java.util.Scanner;

public class C06_endsWith {
    public static void main(String[] args) {
         /*
        Kullanicidan mail adresi isteyin
        - mail adresi @gmail.com icermiyorsa "Lutfen gmail adresi giriniz"
        - @gmail.com ile bitiyorsa "email adresiniz kaydedildi"
        - @gmail.com ile bitmiyorsa "Lutfen yazimi kontrol ediniz" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String email= scan.nextLine();

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.endsWith("@gmail.com")){
            System.out.println("email adresiniz kaydedildi");
        } else {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }
    }
}
