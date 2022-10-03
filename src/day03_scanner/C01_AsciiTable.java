package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        // bir tamsayi ve bir char deger olusturup yazdiralim

        int sayi=10;
        char harf='a';
        String str="banan";

        System.out.println(sayi+harf); // 10a olmasını beklerken 107 oldu. a'nin ASCII kodunu aldı
        System.out.println(str+harf); // banana

        // char data türü birlikte isleme girdigi degiskenin turune gore davranır.
        // sayısal bir degerle matematiksel isleme girdiginde ASCII değeri ile isleme girer
        // string bir deger ile isleme girdiginde uzerine ekleme yapar
    }
}
