package day08_IfStatements;

import java.util.Scanner;

public class C2_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan 100 uzerinden bir not girmesini isteyiniz.
        Notu harf sistemine cevirip yazdirin.
        0-50 "D"
        51-60 "C"
        61-80 "B"
        81-100 "A"
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100 uzerinden notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>=0 && not<=50){
            System.out.println("Sonucunuz: D");
        } else if (not>=51 && not<=60){
            System.out.println("Sonucunuz: C");
        } else if (not>=61 && not<=80) {
            System.out.println("Sonucunuz: B");
        } else if (not>=81 && not<=100) {
            System.out.println("Sonucunuz: A");
        } else {
            System.out.println("Lutfen gecerli bir not giriniz");
        }
    }
}
