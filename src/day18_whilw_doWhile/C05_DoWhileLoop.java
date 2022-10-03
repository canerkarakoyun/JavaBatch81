package day18_whilw_doWhile;

public class C05_DoWhileLoop {
    public static void main(String[] args) {

        /*
        9'dan 190'a kadar 7'nin kati olan tum tamsilari ekrana yazdirin
         */

        int bas=9;
        int bitis=190;
        int temp=bas;

        // while loop ile

        while (temp<bitis){
            if (temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;
        }

        System.out.println("");

        // do while loop ile

        do {

            if (temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;

        }while (temp<bitis);
    }
}
