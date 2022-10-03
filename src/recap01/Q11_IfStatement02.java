package recap01;

public class Q11_IfStatement02 {
    public static void main(String[] args) {
        /*
        Not hesaplayici;
        A => 90-100
        B => 80-89
        C => 70-79
        D => 60-69
        F => 0-59
         */

        int not=60;

        if (not<60){
            System.out.println("Notunuz : F");
        } else if (not<70){
            System.out.println("Notunuz : D");
        } else if (not<80){
            System.out.println("Notunuz : C");
        } else if (not<90){
            System.out.println("Notunuz : B");
        } else if (not<=100){
            System.out.println("Notunuz : A");
        } else {
            System.out.println("Lutfen gecerli bir not giriniz");
        }
    }
}
