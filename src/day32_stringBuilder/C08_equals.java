package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.equals(sb1)); // true
        // StringBuilder'da .equals() methodu ancak ayni obje olursa true doner
        // String'deki gibi dusunmemek lazim

        System.out.println(sb1.equals(str)); // false
        // normal sartlar altinda iki farkli data turu karsilastirilamaz

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3=new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3)); // -4

        /*
        compareTo() methodu iki StringBuilder'i harf harf sirasi ile karsilastirir
        ilk harfler ayni ise ikincilere gecer
        ikinciler ayniysa ucunculere gecer
        .
        .
        farkli olanlarini buldugunda ASCII kodlari arasindaki farki dondurur.

        Eger hic fark yoksa sonuc 0 olarak doner.
         */

    }
}
