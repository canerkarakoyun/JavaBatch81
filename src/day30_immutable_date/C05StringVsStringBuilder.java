package day30_immutable_date;

import java.time.LocalTime;

public class C05StringVsStringBuilder {
    public static void main(String[] args) {
        // String mi yoksa StringBuilder mi daha hizlidir???
        // bunun icin bir String olusturup 1000 kere sonuna . ekleyelim, oncesinde
        // ve sonrasinda zamani alip arasindaki farki bulalim.
        // Ayni islemi StringBuilding icin de yapalim

        LocalTime baslangic=LocalTime.now();
        String str="Ahhhh Java";

        for (int i = 0; i < 10000; i++) {
            str+=".";

        }
        LocalTime bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("StringZaman : "+ (bitis.getNano()- baslangic.getNano()));


        baslangic=LocalTime.now();
        StringBuilder sb=new StringBuilder("Ahhhh Java");

        for (int i = 0; i < 10000; i++) {
            sb.append(".");

        }
        bitis=LocalTime.now();

        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("StringBuilderZaman : "+ (bitis.getNano()- baslangic.getNano()));


    }
}
