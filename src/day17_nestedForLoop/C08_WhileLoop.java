package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplanmak uzere sayilar alin. Sayilarin toplami 500'u gecınce sayiların toplamini ve
        // kac sayinin girildigini yazdirin.
        // Or. 13 sayi girdiniz ve toplamlari 567
        // NOT: forLoop ile cozmek mumkun degil bu soruyu, cunku kac sayi girilecegi belli degil
        //      whileLoop ile cozulebilir

        int toplam=0;
        int sayi=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);

        while (toplam<500) {
            System.out.println("Lutfen toplamak icin sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println(sayac+" sayi girdiniz ve toplamlari "+toplam);
    }
}
