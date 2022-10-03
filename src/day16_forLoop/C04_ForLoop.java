package day16_forLoop;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {
        /*
        Interview Question
        Kullanicidan 100'den kucuk bir tamsayi isteyin
        1'den baslayarak girilen sayiya kadar tum sayilari yazdirin.
        Ancak;
        - Sayi 3'un kati ise sayi yerine "Java" yazdirin
        - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin
        - Sayi hem 3'ün hem 5'in kati ise sayi yerine "Java Guzeldir" yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 0-100 arasinda bir tam sayi giriniz");
        int sayi= scan.nextInt();

        if (sayi<0 || sayi>=100){
            System.out.println("Lutfen gecerli bir deger giriniz");
        } else {

            for (int i = 1; i <sayi ; i++) {
                if (i%3==0 && i%5==0){
                    System.out.println("Java Guzeldir");
                } else if (i%3==0){
                    System.out.println("Java");
                } else if (i%5==0){
                    System.out.println("Guzeldir");
                } else {
                    System.out.println(i);
                }

            }
        }
    }
}
