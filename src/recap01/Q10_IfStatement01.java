package recap01;

import java.util.Locale;
import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {

        /*
        Kullanicidan Y\N ikilisinden birisini girmesini isteyin
        Girdigi degeri Yes or No seklinde ekrana yazdiriniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Y ya da N giriniz");
        char input=scan.next().toLowerCase(Locale.ROOT).charAt(0);

        if (input==('y')){
            System.out.println("Yes");
        } else if (input==('n')){
            System.out.println("No");
        } else System.out.println("Lutfen gecerli bir deger giriniz"); //

    }
}
