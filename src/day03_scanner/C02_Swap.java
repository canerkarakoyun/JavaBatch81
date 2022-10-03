package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
        // sayi1:10 sayi2:20 variable'larının degerlerini degistiren program yazınız.
        /* Once: sayi1=10
                 sayi2=20
           Sonra: sayi1=20
                  sayi2=10
         */

        int sayi1=10;
        int sayi2=20;
        int sayi3=0; // gecici kovamiz

        sayi3=sayi2;
        sayi2=sayi1;
        sayi1=sayi3;

        System.out.println("Sayi1= " + sayi1);
        System.out.println("Sayi2= " + sayi2);

    }
}
