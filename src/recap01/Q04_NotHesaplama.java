package recap01;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {
        /*
        Kullanıcıdan Vize1, Vize2 ve Final notlarını girmesini isteyin ve geçme notunu hesaplayın
        Vizelerin ortalamasının etkisi %30, finalin etkisi %70
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1. Vize notunu giriniz");
        double vize1= scan.nextDouble();

        System.out.println("Lutfen 2. Vize notunu giriniz");
        double vize2= scan.nextDouble();

        System.out.println("Lutfen final notunu giriniz");
        double sonNot= scan.nextDouble();

        double gecmeNotu=(vize1*3/10)+(vize2*3/10)+(sonNot*7/10);
        System.out.println("Notunuz : "+gecmeNotu);
        }
    }

