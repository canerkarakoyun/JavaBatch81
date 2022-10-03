package day22_MultiDimensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {
        /*
        Verilen iki katli bir multi dimensional array'de outer indexi ve inner indexi ayni olan
        sayilarin toplamini bulunuz
        Or. [0][0]+[1][1]+[2][2] ..... (dinamik olsun)

        Ayri bir class'da bunun 3 katlisini da cozun sonra
         */

        int[][] sayilar= {{1,5,6,9,4},{2,5,5,8},{3,1,6}};
        int sum=0;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (i==j){
                    sum+=sayilar[i][j];

                }

            }

        }
        System.out.print(sum);
    }
}
