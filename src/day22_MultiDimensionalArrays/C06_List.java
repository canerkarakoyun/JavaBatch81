package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {
        /*
        array'i array yapan [] idi
        arrayList'de ise <> diamond (elmas) kullaniriz
         */

        List<String> isimler=new ArrayList<>();
        System.out.println(isimler); // []

        // bir liste eleman eklemek istersek

        isimler.add("Basak");

        System.out.println(isimler.add("Ayse")); // true doner


        /*
        String'de bir method calistirdigimizda assign yapmazsak String degismiyordu

        String isim="Suleyman";
        isim.toUpperCase(); // SAdece bu satir icin SULEYMAN olur, cunku atama yok

        Ancak List'lerde atama olmasa da methodlar calisir ve kalici degisim olur
         */

        System.out.println(isimler); // [Basak, Ayse]

        /*
        List'in tek kotu tarafi, array alt yapisini kullandigi icin
        elemanlari birer birer eklemek zorunda olmamizdir.
        Ayni anda birden fazla eleman ekleyemeyiz
         */
    }
}
