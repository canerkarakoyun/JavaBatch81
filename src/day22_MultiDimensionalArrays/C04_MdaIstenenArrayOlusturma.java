package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class C04_MdaIstenenArrayOlusturma {
    public static void main(String[] args) {

        /*
        Asagidaki multi dimensional arrayin ic arraylerinin tum elemanlarinin toplamlarini
        birer birer bulan ve her bir sonucu yeni bir array'in elemani yapan ve yeni arrayi
        ekrana yazdiran bir program yazin
        {{1,2,3},{4,5},{6,7}} ==> 1+2+3+4=6 4+5=9 6+7=13 ==> output: {6,9,13}
         */

        int[][] input={{1,2,3},{4,5},{6,7}};
        int[] yeniArray=new int[input.length];
        int sum=0;

        for (int i = 0; i < input.length; i++) { // dis loop outer array'i gezer
            for (int j = 0; j < input[i].length; j++) { // ic loop inner arrayleri gezer

                sum+=input[i][j];

            }
            yeniArray[i]=sum;
            sum=0;
        }
        System.out.println("Istenen yeni array : "+ Arrays.toString(yeniArray));
    }
}
