package day07_IfStatement_Rpt;

public class C03_IfStatementsCurlyBraseOlmazsa {
    public static void main(String[] args) {

        int sayi=20;

        if (sayi>0)
            System.out.println("Sayi Pozitif"); // { olmadiginden bu satir sarta bagli olacak ve sarta bagli calisacak
            System.out.println("Pozitif kalacaktir"); // { olmadiginda bu satir sarta bagli olmayacak ve her zaman calisacak
            System.out.println("ucuncu satir"); // her zaman calisacaktir

        if (sayi %2==0)
            System.out.println("Sayi cift"); // sarta bagli calisir
            System.out.println("Cift kalacaktir"); // her zaman calisir


        if (sayi%5==0)
            System.out.println("Sayi 5'in tam kati"); // sarta bagli calisacak


        /*
        If statements'da {} kullanilmazsa ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur
        Eger birden fazla satir ayni if sartina baglanmissa mutlaka {} kullanarak bodyi belirlemeliyiz
         */

    }
}
