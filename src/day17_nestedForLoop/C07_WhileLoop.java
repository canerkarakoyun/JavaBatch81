package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        // 20'den 50'ye kadar cift sayilari yazdiralim (sinirlar dahil)

        // for loop ile

        int baslangic=20;
        int bitis=50;

        for (int i = 20; i <=50 ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }

        // while ile
        System.out.println("");

        int temp=baslangic;
        while (temp<=bitis){
            if (temp%2==0){
                System.out.print(temp+" ");
            }
            temp++;
        }
    }
}
