package day21_Arrays;

public class C02_Array_EnUzunVeKisaKelime {
    public static void main(String[] args) {
        // Ver'len b'r str'ng Array'de en uzun ve en kisa Stringleri yazdiran bir method olusturun

        String[] isimler={"Erdal", "Mehmet", "Onur", "Hayrullah", "Mihrican"};

        enUzunVeKisayiYazdir(isimler);

    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {
        String enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];

        for (int i = 1; i < isimler.length; i++) {
            if (isimler[i].length()>enUzunKelime.length()){
                enUzunKelime=isimler[i];
            }
            if (isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];
            }

        }
        System.out.println("Arraydeki En Uzun Kelime : "+enUzunKelime);
        System.out.println("Arraydeki En Kisa Kelime : "+enKisaKelime);

    }
}
