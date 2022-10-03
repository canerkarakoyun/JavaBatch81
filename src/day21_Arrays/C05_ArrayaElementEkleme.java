package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayaElementEkleme {
    public static void main(String[] args) {
        // Verilen bir Array'e yeni bir element ekleyen method olusturun

        String[] sinifList={"Ali Can", "Nida Yucedal", "Musa Yaman"};
        String eklenecekIsim="Murat Babayigit";

        sinifList=elemanEkle(sinifList,eklenecekIsim);
        System.out.println(Arrays.toString(sinifList));

    }

    public static String[] elemanEkle(String[] sinifList, String eklenecekIsim) {
        String [] yeniSinifListesi=new String[sinifList.length+1];
        // bu sekilde eski listeden 1 eleman fazla uzunlukta yeni bir array olusturdum

        for (int i = 0; i < sinifList.length; i++) {
            yeniSinifListesi[i]=sinifList[i];
        }
        // bu sekilde eski listedeki tum elemanlari yeni listeye tasidim

        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        // bu sekilde son indexe ise eklenecek ismi atadim



        return yeniSinifListesi;

    }
}
