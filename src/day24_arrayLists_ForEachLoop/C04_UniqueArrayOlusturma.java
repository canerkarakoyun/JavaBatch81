package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_UniqueArrayOlusturma {
    public static void main(String[] args) {
        // Verilen bir array'deki unique elementleri
        // yeni bir array olarak donduren bir method olusturun

        int[] arr={2,3,5,6,3,5,4,1,9,6,3,5,5};

        // donen arrayi almak icin asagidaki sekilde array bir veriable olusturuyoruz,
        // gonderecegimiz parametre olarak da arr belirtiyoruz

        int[] uniqueArray=uniqueArrayOlustur(arr);
        System.out.println(Arrays.toString(uniqueArray));
    }

    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> benzersizList = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                benzersizList.add(arr[i]);
            }
        }
        // yukaridaki for loop son elementi kontrol etmiyor. son elementi kontrol etmek icin
        // bir kontrol sarti ekliyoruz, son elementi kontrol ediyoruz, listede yoksa ekliyoruz

        if (!benzersizList.contains(arr[arr.length-1])){
            benzersizList.add(arr[arr.length-1]);
        }

        // benzersiz List==> 1, 2, 3, 4, 5, 6, 9
        // benzersiz listenin size bilgizini kullanarak bi array olusturalim
        int[] tekrarsizArr=new int[benzersizList.size()];

        // benzersiz listedeki tum elemanlari yeni array'e atayalim
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i]= benzersizList.get(i);

        }
        // olusturdugumuz yeni array'i main methoda donduruyoruz
        return tekrarsizArr;

    }
}

