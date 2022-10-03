package day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

        int sayi1=23;
        int sayi2=5;
        System.out.println(sayi1/sayi2); // iki deger de int oldugundan 4.6 degil 4 olarak verir sonucu.

        System.out.println(25*7/3); // 58.6666 degil 58 verir.

        double sayi3=5;
        System.out.println(sayi1/sayi3); //iki farklı data tipi ile islem yaptiginde
                                          // kapsamı genis olanı baz alir

    }
}
