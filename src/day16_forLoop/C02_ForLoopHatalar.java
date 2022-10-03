package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        // Eger ENDING CONDITION hep TRUE verirse loop sonsuz donguye girer
        // Asagidaki loop'u calistirdigimizda belirledigimiz sinira yaklasmaz, uzaklasir.
        // bu durumda sonsuz loop olusur, bilgisayara yazik edersiniz!!!

        // bu yapilan hatalardan birisi.. siniri belirlerken yaklasacak sekilde belirlemeliyiz..

        /*
        for (int i = 0; i > -10 ; i++) {
            System.out.println(i);

        }

         */

        // Eger Loop'da ENDING CONDITION hic TRUE olmazsa loop body hic devreye girmez
        // Eger ilk deger icin bile bitis sarti saglamiyorsa
        // for loop calisir
        // ama loop body'si calismaz
        // ornegin i==0 icin 0>5 False olur ve Loop is broken olur, for body'si devreye girmez

        for (int i = 0; i >5 ; i++) {
            System.out.println(i);

        }
    }
}
