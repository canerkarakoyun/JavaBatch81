package day09_ternary;

import java.util.Locale;
import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        /*
        Kullanicidan gun ismini alin ve hafta ici veya hafta sonu oldugunu yazdirin
         */

        String input="mumartesi";
        input=input.toLowerCase(Locale.ROOT);

        switch (input){
            case "pazartesi":
                System.out.println("Hafta ici");
                break;
            case "sali":
                System.out.println("Hafta ici");
                break;
            case "carsamba":
                System.out.println("Hafta ici");
                break;
            case "persembe":
                System.out.println("Hafta ici");
                break;
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }

        /*
        Sonucu ayni olan caselerde son satira istedigimiz sonucu yazmamiz yeterlidir. Gider kodu bulunca yazdirir.
         */

        switch (input){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }
    }
}
