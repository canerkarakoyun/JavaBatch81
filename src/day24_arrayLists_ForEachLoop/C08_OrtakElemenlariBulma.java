package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_OrtakElemenlariBulma {
    public static void main(String[] args) {

        // Iki string array olusturunuz ve bu arraylari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz.
        // Ortak eleman yoksa "Ortak eleman yok" yazdirin.

        String[] arr1={"Ali", "Veli", "Can", "Ayse"};
        String[] arr2={"Ali", "Hasan", "Ayse", "Enes"};

        // Bir list olusturalim, iki arrayden cektigimiz verilerden ortak olanlari bu list'e atalim
        List<String> ortakIsimler=new ArrayList<>();

        for (String each1: arr1
             ) {

            for (String each2: arr2
                 ) {

                if (each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1);
                }

            }

        }
        if (ortakIsimler.isEmpty()){
            System.out.print("Hic ortak eleman yok");
        } else{
            System.out.print("Her iki arraydeki ortak isimler : " + ortakIsimler);
        }


    }
}
