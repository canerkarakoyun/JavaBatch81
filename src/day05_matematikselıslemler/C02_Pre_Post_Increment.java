package day05_matematikselıslemler;

import javax.sound.midi.Soundbank;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi=10;

        System.out.println("pre-increment : " + ++sayi); // 11

        System.out.println("post-increment : " + sayi++); // 11

        System.out.println("Son durumda : " + sayi);
    }
}
