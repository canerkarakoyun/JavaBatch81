package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe{

    protected int saatUcreti=12;
    protected int gunlukMesai=9;


    protected void maas(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai); // 9
        System.out.println(mmr1.saatUcreti); // 12
        mmr1.maas(); // Memurlar : 3240 maas alir
        mmr1.ozelSigorta(); // Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta(); // APersonel'den alacak
        System.out.println(mmr1.isim); // APersonel'den alacak
        System.out.println(mmr1.soyisim); // APersonel'den alir
        System.out.println(mmr1.departman); // APersonel'den alir


        BMuhasebe mhsb1=new BMuhasebe();
        /*
        Her ne kadar CMemur class'inin icinde olsam da
        olusturdugum obje BMuhasebe class'indan
        Cunku data turu ve constructor BMuhasebe

        String str="Murat":
        ArrayList<Integer> list==new ArrayList<>();
        Integer sayi=20;

        BMuhasebe class'i da obje olusturulabilen bir class'dir
        yani ayni zamanda bir data turudur.

        Obje olusturdugumuz her class ayni zamanda bir data turudur.
         */

        System.out.println(mhsb1.gunlukMesai); // 8 Muhasebe
        System.out.println(mhsb1.saatUcreti); // 10 Muhasebe
        mhsb1.maas(); // Muhasebe
        mhsb1.ozelSigorta(); // Muhasebe
        mhsb1.sigorta(); // APersonel'den alacak
        System.out.println(mhsb1.isim); // APersonel'den alacak
        System.out.println(mhsb1.soyisim); // APersonel'den alir
        System.out.println(mhsb1.departman); // APersonel'den alir
    }
}
