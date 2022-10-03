package recap01;

public class Q13_Ternary {
    public static void main(String[] args) {
        /*
        Ternary kullanarak bir kod yazin. fiyat isminde bir veriable olusturalim.
        Eger fiyat 10'dan az ise "ucuz", 10-20 arasinda ise "normal",
        20-30 arasinda ise "pahali" ve 30dan daha yuksekse "cok pahali" yazdirin
         */

        int fiyat=25;

        String sonuc=   fiyat<10?"ucuz"
                        :fiyat<20?"normal"
                        :fiyat<30?"pahali"
                        :"cok pahali";
        System.out.println("sonuc= "+sonuc);
    }
}
