package day15_overLoading_forLoop;

public class C08_Factoyel {
    public static void main(String[] args) {
        // input olarak verilen bir tam sayi icin faktoryel hesaplayip yazdiran bir method olusturun
        // Verilen sayi negatif ya da 20'den buyuk olursa "Girilen sayinin faktoryeli hesaplanamaz" yazdirin

        int input=6;

        faktoryelHesapla(input);

    }

    public static void faktoryelHesapla(int input) {
        int faktoryel=1;

        if (input<0 || input>20){
            System.out.println("Verilen sayi icin faktoryel hesaplanamaz");
        } else if (input==0){
            System.out.println("0! = 1'dir");
        } else {
            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;

            }
            System.out.println("Faktoryel degeri : "+faktoryel);
        }
    }

}
