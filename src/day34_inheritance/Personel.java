package day34_inheritance;

public class Personel {
    /*
    Eger parent class olacak sekilde tasarladiginiz bir classiniz varsa veya
    ileride bu class'i parent olarak kullanmak isteyen olabilir diyorsaniz
    variable ve method'larin access modifier'ini PROTECTED yapmamiz gerekir
    Hem herkes kullanamaz hem de parent yapanlar kullanabilir.
    PROTECTED inheritance icin uretilmistir.
     */
    protected int persNo;
    protected String isim="Isim belirtilmedi";
    protected String departman="Departman belirtilmedi";

    protected void maas(){
        System.out.println("Tum personelin maasi vardir");
    }

    protected void mesai(){
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    protected void fazlaMesaiUcreti(){
        System.out.println("Personel fazla mesaisini statusune gore alir");
    }


}
