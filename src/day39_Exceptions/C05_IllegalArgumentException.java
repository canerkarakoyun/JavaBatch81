package day39_Exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        // Kullanicidan yasini girmesini isteyin  
        // Kullanici sifirdan kucuk bir sayi girerse
        // Exception verecek sekilde kodunuzu olusturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas < 0) {
            throw new IllegalArgumentException();
        } else {
            System.out.println("Yasiniz :" + yas);
        }
    }
}
