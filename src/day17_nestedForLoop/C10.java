package day17_nestedForLoop;

public class C10 {
    public static void main(String[] args) {

        boolean dogruMu=true;
        int sayi=10;

        while (dogruMu){
            if (sayi>20){ // sart saglandiginda while loop'un conditionu FALSE olmali
                System.out.println("Bu islem tamam");
                dogruMu=false;
            } else { // sart saglanmadigi muddetce while loop'un kontrol ettigi degisken degismeli
                System.out.println("istenen sart saglanamadi"+sayi);
                sayi++;
            }
        }
    }
}
