package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        // input olarak verilen 2 integer'i toplayip sonucunu yazdiran bir method olusturunuz

        int input1=30;
        int input2=20;

        // method 4 adimda olusturulur
        // 1. adim method call
        // 2. adim argument eklenmesi gerekiyorsa ekleyelim
        // eger method'un return typ'i void'den farkli olacaksa bir veriable olusturup' method call'i assign edelim

        topla(input1,input2);
    }

    private static void topla(int input1, int input2) {

        // 3. adim method deklarasyonunda degistirilmesi gereken bolumleri degistir (access modifier, return type vs)
        // 4. adim eger return type void disinda bir seyse return keyword'u ve donecek degeri hesaplamaliyiz

        System.out.println("Girilen iki sayinin toplami : "+(input1+input2));
    }
}
