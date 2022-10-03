package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    public static void main(String[] args) {
        // Kullanicidan bir Array'in boyutunu ve tum elementlerini alarak Array olusturup
        // bize bir Array donduren bir method olusturun

        int[] sayilar=arrayOlustur();

        System.out.println(Arrays.toString(sayilar)); // istersek yazdirabiliriz

    }

    public static int[] arrayOlustur() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen array icin bir uzunluk degeri giriniz");
        int uzunluk= scan.nextInt();
        int[] olusturulan=new int[uzunluk];

        int sayi=0;

        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i+". index icin bir sayi giriniz");
            olusturulan[i]= scan.nextInt();

        }

        return olusturulan;
    }
}
