package day21_Arrays;

public class C01_Array_MaxSayiyiBulma {
    public static void main(String[] args) {

        // Verilen bir int Array'deki en buyuk sayiyi yazdiran bir method olusturun

        int[] sayilar ={3,5,7,1,4,9,5,2};

        maxSayiyiYazdir(sayilar);

    }

    public static void maxSayiyiYazdir(int[] sayilar) {

        int maxSayi=sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }

        }


        System.out.println("Array'deki en buyuk sayi : "+maxSayi);
    }
}
