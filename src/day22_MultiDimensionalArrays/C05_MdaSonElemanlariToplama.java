package day22_MultiDimensionalArrays;

public class C05_MdaSonElemanlariToplama {
    public static void main(String[] args) {
        /*
        Asagidaki multi dimensional arrayin
        ic arraylerinin son elemanlarini carptiran bir program yazin
        {{1,2,3},{4,5},{6}}
         */

        int[][] sayilar={{1,2,3},{4,5},{6,3,5,4,9,20}};
        int carpim=1;

        for (int i = 0; i < sayilar.length; i++) {
            for (int j = 0; j < sayilar[i].length; j++) {
                if (j == sayilar[i].length-1){
                    carpim*=sayilar[i][j];
                }

            }

        }
        System.out.println("Son elemanlarin carpimi : "+carpim);
    }
}
