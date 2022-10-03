package day15_overLoading_forLoop;

public class C07_forLoop {
    public static void main(String[] args) {
        C06_ForLoop_StringTersCevirme.terstenYazdir("Zekeriya");

        // 100'den 1'e kadar (sinirlar dahil) 8 ile bolunebilen sayilari yazdirin

        for (int i = 100; i >01 ; i--) {

            if (i%8==0){
                System.out.print(i+" ");
            }

        }
    }
}
