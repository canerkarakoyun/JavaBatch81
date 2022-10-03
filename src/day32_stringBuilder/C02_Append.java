package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java daha ne yapsin");

        sb1.append("?");

        System.out.println(sb1); // Java daha ne yapsin?

        /*
        append eklemek istedigimiz String'i sona ekler. Araya ekleyemez.

        Araya ekleme yapmak icin insert kullanilir.
         */

        sb1.insert(4, " her seyi dusunmus,");
        System.out.println(sb1); // Java her seyi dusunmus, daha ne yapsin?

        System.out.println(sb1.reverse());

    }
}
