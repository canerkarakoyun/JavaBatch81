package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        /*
        Bir sorunla karsilasmayi bekledigimiz noktalarda if-else ile sorunu yakalayip
        onunla ilgili cozum uretebiliriz

        Ama Java sorunu her zaman if-else ile cozemeyecegimizden Java try-catch block'lari olusturmustur
         */

        int a=1000;
        int b=50;
        int sayac=1;

        while (sayac<100){

            if (b==0){
                System.out.println("Lutfen 0 disinda bir deger giriniz");
            } else{
                System.out.println(a/b);
            }

            b--;
            sayac++;
        }

    }
}
