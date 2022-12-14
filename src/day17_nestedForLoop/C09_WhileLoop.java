package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa "Sifre Basarili"'
        sartlari saglamiyorsa "Islem basarisiz' lutfen yeni bir sifre belirleyin" yazdirin ve basarili sifre
        girinceye kadar tekrar sifre girmesini isteyin.

        - Ilk harf buyuk harf olmali
        -Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en 8 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;

        while (!sifreBasariliMi) {
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();

            // 4 parametremiz var, bunları tek tek kontrol edelim, her birinde +1 kontrol veriable'a atayalim
            // kontrol==4 ise sifre basarili olmus sayilir, tum kontrollerden gecmis demektir.
            // ilk harf kontrolu
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("Ilk harf buyuk harf olmali");
            }

            // son harf kontrolu
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf kucuk harf olmali");
            }

            // bosluk kontrolu
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk icermemeli");
            } else {
                kontrol++;
            }

            // sifre uzunlugu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakter olmali");
            }

            if (kontrol == 4) {
                System.out.println("Sifre Basarili");
                sifreBasariliMi = true;
            } else {
                kontrol = 0;

            }

        }

    }
}
