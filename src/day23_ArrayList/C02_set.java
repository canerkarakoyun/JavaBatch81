package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        Elimizde urunlerin bulundugu bir liste var
        Urun listesindeki istenen siradaki urunu yeni urunle degistirip
        eski urunu, var olan eski urunler listesine ekleyelim
         */

        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]

         // Listedeki ikram yerine biskrem koyalim
        // Ikrami da eski urunler listesine ekleyelim.

        List<String> eskiUrunler=new ArrayList<>();

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Liste : "+urunler);
        System.out.println("Eski Urunler Listesi : "+eskiUrunler);

        yeniUrun="Kahve";
        silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Liste : "+urunler);
        System.out.println("Eski Urunler Listesi : "+eskiUrunler);

        yeniUrun="Findik";
        silinecekUrun="Cekirdek";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp, yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Liste : "+urunler);
        System.out.println("Eski Urunler Listesi : "+eskiUrunler);




    }
}
