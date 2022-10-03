package day11_StringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C04_contains {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle isteyin
        - Cumle buyuk kelimesi iceriyorsa tum cumleyi buyuk harf olarak
        - "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin
        - iki kelimyi de icermiyorsa "Cumle buyuk ya da kucuk kelimesi icermiyor" yazdirin
        - Case hassasiyeti olmasin
        - her iki kelime de geciyorsa "Karar ver buyuk mu yazdirayim kucuk mu?" yazdiralim
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine().toLowerCase(Locale.ROOT);

        if (cumle.contains("buyuk") && cumle.contains("kucuk")){
            System.out.println("Karar ver buyuk mu yazdirayim kucuk mu?");
        } else if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase(Locale.ROOT));
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase(Locale.ROOT));
        } else{
            System.out.println("Cumle buyuk ya da kucuk kelimesi icermiyor");
        }
    }
}
