package day20_Arrays;

public class C01_LocalVariables {

    public static void main(String[] args) {

        int sayi=10;

        // System.out.println(sayiMethod'); say'Method variable'i method1'de olusturulmus local bir variable'dir.

        for (int i = 0; i <20 ; i++) {
            System.out.println(i);
        }

        // System.out.println(i); i variable'i loop icerisinde olusturulmus local bir variable'dir.
        // sadece loop icerisinde kullanilabilir


        // **static** int sayiStatic=20; static keyword sadece class level'de kullanilabilir
        // methodlarin icerisinde static variable olusturulamaz.

    }

    public static void method1(){

        // System.out.println(sayi); sayi, main method icerisinde olusturulmus bir variable oldugundan
        // sadece main method'da kullanilabilir, bu method'da Java bu veriable'i yok farz eder.

        int sayiMethod=20;



    }
}
