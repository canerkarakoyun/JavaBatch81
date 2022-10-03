package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3=new String("Ali Can");
        String hiclik="";
        String str4=str1.concat(hiclik);

        System.out.println(str1==str2); // false
        System.out.println(str1.equals(str2)); // true (icerige odaklanir)

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1==str3); // false

        System.out.println("str2-str4 : "+str2.equals(str4)); // true
        System.out.println("str2-str4 : "+(str2==str4)); // false

        System.out.println("str1-str4 : "+str1.equals(str4)); // true
        System.out.println("str1-str4 : "+(str1==str4)); // true

        /*
        Yeni bir String olustururken
        1. esitligin sag tarafinda new keywordu gorurse Java yeni bir obje ve referans olusturur

        2. Eger esitligin saginda bir method calisiyor veya + gibi bir islem calisiyorsa
            String immutable oldugundan degisikligi kaydetmek uzere hemen bir kopya String
            ve referans degeri olusturur ve sonra degeri hesaplayip bu yeni kopya objenin
            icine koyar.
         */

        String str5="Ali Can";
        String str6=str1;

        System.out.println(str1.equals(str5)); // true
        System.out.println(str5==str1); // true

        System.out.println(str1.equals(str6)); // true
        System.out.println(str1==str6); // true

        /*
        Eger yeni bir String objesi olusturulurken
        new keyword'u kullanilmaz veya esitligin sag tarafinda bir islem olmazsa Java bakar;

        Daha once olusturdugu String'lerde (STRING HAVUZU) ayni degerde bir String varsa yeni bir obje olusturur
        fakat onceki objenin ref degerini atar.

        == islemi hem icerige hem de ref degere baktigindan aksi durumlarda false doner
        ancak bu durumda true doner

        .equals() methodu ise sadece icerige baktigindan ref degeri farkli olsa dahi
        icerik ayniysa true doner.

        Bu nedenle Stringlerde .eguals() methodu kullanmak daha sagliklidir.
         */

    }
}
