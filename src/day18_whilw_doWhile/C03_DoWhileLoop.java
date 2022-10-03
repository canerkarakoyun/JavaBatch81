package day18_whilw_doWhile;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
        whilw loopda once kontrol edip sonra islem yaotigimizdan islem bittikten sonra loopun kirilmasi icin bir kez
        daha basa donmemiz gerekiyor ve fazladan 1 islem yapiliyor. DO WHILE LOOP ile yaptigimizda bu durum olmaz
         */

        int sayi=7;

        while (sayi<10){
            System.out.print(sayi+" ");
            sayi++; // bunu yazmazsak sonsuz loop olusur
        }
        System.out.println("");

        // DO WHILE LOOP ile cozum

        sayi=7;

        do {
            System.out.print(sayi+" ");
            sayi++;
        }while (sayi<10);

    }
}
