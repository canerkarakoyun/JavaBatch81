package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {
        /*
        Icinde 200 tane 1000'den kucuk pozitif tam sayi olan liste olusturun
        Kullanicidan pozitif tam sayi isteyerek listede var olup olmadigini
        kullanicaya yazdirarak donun
         */

        Random rnd=new Random();
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();
        while(sayiListesi.size()<200){
            sayi= rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);

        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner scan=new Scanner(System.in);

        while(!bildiMi){ // bildiMi==false
            System.out.println("Lutfen bir sayi tahmininde bulunun");
            sayi=scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz");
                bildiMi=true;
            }else{
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hic biri listede yok");
                tahminSayisi++;
            }
        }
    }
}
