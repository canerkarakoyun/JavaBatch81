package day36_inheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{

    protected int saatUcreti=11;
    protected int gunlukMesai=7;


    protected void maasIsci(){
        System.out.println("Isciler : "+(30*saatUcreti*gunlukMesai)+" maas alir");
    }

    protected void ozelSigortaIsci(){
        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();

        /*
        Bir obje olusturulurken
        Data turu ve constructor ayni class'dan ise
        direkt o class'a gidiyoruz

        Eger data turu ve cons farkli ise
        Oncelikle Data turunun oldugu class'a gideriz
         */

        System.out.println(isc1.gunlukMesai); // M 8
        System.out.println(isc1.saatUcreti); // M 10
        isc1.maas(); // M
        isc1.ozelSigorta(); // M
        isc1.sigorta(); // P
        System.out.println(isc1.isim); // P
        System.out.println(isc1.soyisim); // P
        System.out.println(isc1.departman); // P

        APersonel isci2=new DIsci();

        //System.out.println(isci2.gunlukMesai); // M 8
        //System.out.println(isci2.saatUcreti); // M 10
        isci2.maas(); // M
        //isci2.ozelSigorta(); // M
        isci2.sigorta(); // P
        System.out.println(isci2.isim); // P
        System.out.println(isci2.soyisim); // P
        System.out.println(isci2.departman); // P

        /*
        Eger aradigimiz ozellik data turu olan class'da yoksa
        donup de child class'lara bakmaz, varsa parent class'a gider
        yoksa da CTE verir.
         */

        List<String> list1=new LinkedList<>();
        Deque<String> list2=new LinkedList<>();
        Queue<String> List=new LinkedList<>();

        /*
        Tum objeler LinkedList'de olusturulmus olsa da
        List1 List gibi davranir
        List2 Duque gibi davranir
        List3 Queue gibi davranir
         */

    }
}
