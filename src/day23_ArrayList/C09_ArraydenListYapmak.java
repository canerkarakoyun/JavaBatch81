package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydenListYapmak {
    public static void main(String[] args) {
        /*
        List ile calisirken en kotu ozelligi elemanlari tek tek eklemek.

         */

        Integer[] arr={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};
        /*
        Bu kadar cok elemanli bir listeyi tek tek eleman olarak girmek yerine
        Array olusturup for loop ile
        olusturdugumuz list'e tasiyabiliriz
         */

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        Bu islemi yapmasi icin Java'nin olusturdugu bir method da var
        Ancak bu yontemin cok yan etkisi var

        1. Bu sekilde olusturulan listede add, remove gibi size'i degistiren methodlar kullanilamaz.
        2. asList meyhodu ile olusturulan liste ve kaynak olan array birbiri ile iliskili olarak
        hayatlarina devam ederler.
        Birinde yapilan degisiklik digerini de etkiler
         */

        List<Integer> sayilar2= Arrays.asList(arr);
        System.out.println(sayilar2);

        sayilar.add(5);
        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

        /*
        sayilar2.add(5);
        System.out.println(sayilar2);
        exception hatasi verdiginden yoruma aldik
         */

        arr[0]=20;
        System.out.println(Arrays.toString(arr));
        System.out.println("arrayde degisiklik yapinca : "+sayilar2);

    }
}
