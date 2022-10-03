package day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydir {
    public static void main(String[] args) {
        // Verilen 3 elemanli bir Aray'in tum elemanlarini bir sola kaydiracak bir program yazin
        // Or. array [1,2,3] --> [2,3,1]

        int arr[]={1,2,3,4,5 };
        int temp=arr[0]; // 2'yi sola kaydirdigimizda 1'in kaybolmamasi icin gecici olarak buraya koyalim

        for (int i = 0; i <arr.length-1 ; i++) {

            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=temp; // gecici olarak ayirmistik, son elemente atama yapmaliyiz.

        System.out.println(Arrays.toString(arr));

        // yukarida degistirdigimiz Array'i ilk durumuna getirmek icin saga kaydiralim

        temp=arr[arr.length-1];             // son elementi korumaya aldik

        for (int i = arr.length-1; i > 0 ; i--) {

            arr[i]=arr[i-1];

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));

    }
}
