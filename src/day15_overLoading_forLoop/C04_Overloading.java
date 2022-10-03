package day15_overLoading_forLoop;

public class C04_Overloading {
    public static void main(String[] args) {
        topla(5, 7);
        topla(5.2, 3);
        topla(3.4, 6.1);
        topla(5,6.2);

    }
    /*
    ONEMLI!!!
    Java hangi method'un calisacagina karar verirken optimizasyon yapar
    Eger hic casting yapmadan kullanabilecegi bir method varsa onu kullanır
    Eger hic casting yapmadan kullanabilecegi method yoksa en az casting yapacagi method'u kullanir.
     */

    public static void topla (int sayi1, int sayi2){
        System.out.println("Ikı integer'in toplami : "+(sayi1+sayi2));
    }

    public static void topla (double sayi1, int sayi2) {
        System.out.println("Bir double ve bir integer'in toplami : " + (sayi1 + sayi2));
    }

    public static void topla (double sayi1, double sayi2) {
        System.out.println("Ikı double'in toplami : " + (sayi1 + sayi2));
    }
    public static void topla (int sayi1, int sayi2, int sayi3) {
        System.out.println("Uc integer'in toplami : " + (sayi1 + sayi2+sayi3));
    }
}

