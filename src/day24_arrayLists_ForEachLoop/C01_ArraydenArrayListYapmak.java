package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {
        // Uzun listelerimiz varsa tek tek listeye eklemek zor olur.

        String[] arr={"Ismail", "Nurullah", "Fatih"};
        /*
        Uzun listeler olusturmamiz gerektiginde tek tek eklemek yerine
        array olusturup bunlari list'e cevirmek daha pratik olabilir.

        1. Loop ile array'deki tum elementleri List'e atabiliriz
        2. Arrays.asList() kullanabiliriz
            Ancak bu methodun 2 tane olumsuz yonu var
            - Arrays classi kullanildigi icin array ozellikleri gecerli olur ve dolayisiyla
            List'de olan add, remove gibi size degistiren methodlar bu sekilde olusturulan
            List'lerde kullanilamaz

            - Kaynak olan array ile urun olan list birbirine ozdes olarak calisir.
            Bundan dolayi birinde yapilan degisiklik digerini de etkiler.
        */

        List<String> sinifList= Arrays.asList(arr);
        System.out.println(sinifList); // [Ismail, Nurullah, Fatih]

       // 1. olumsuzluk;
           // sinifList.add("erdi"); // Java itiraz etmez ama calistirdigimizda hata verir (UnsupportedOperationException)

           //sinifList.remove(1); // Java itiraz etmez ama calistirinca hata veriri (UnsupportedOperationException)

        // 2. yan etki;

        arr[1]="Emre";
        System.out.println("Degisim sonrasi array : "+Arrays.toString(arr)); // Degisim sonrasi array : [Ismail, Emre, Fatih]
        System.out.println("Degisim sonrasi list : "+sinifList); // Degisim sonrasi list : [Ismail, Emre, Fatih]

        // array degisince list de degisti

        sinifList.set(0,"Utku");
        System.out.println("List'i degistirince list : "+sinifList);
        System.out.println("List'i degistirince Array : "+Arrays.toString(arr));

        // list'de degisiklik yapinca array de degisti

        // sayisi degismeyecek bir arrayimizi list yapabiliriz, bunun disinda anlamli degil.
        // ancak bu da anlamli degil :)))


    }
}
