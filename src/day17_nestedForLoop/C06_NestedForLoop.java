package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen String'i asagidaki gibi yazdiran bir program yaziniz

        input=Deniz

        D
        De
        Den
        Deni
        Deniz

         */

        String input="kahramanmaraş";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));   // ilk harf icin substring(0,1) olmali, 0'i elde etmek icin
                                                            // (j-1,j) seklinde yaptik.

            }
            System.out.println("");
        }
        for (int i = input.length()-1; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");
        }
    }
}
