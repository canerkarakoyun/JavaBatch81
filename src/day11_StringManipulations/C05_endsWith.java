package day11_StringManipulations;

public class C05_endsWith {
    public static void main(String[] args) {

        String str="Ah be Java";
        System.out.println(str.endsWith("ava")); // true
        System.out.println(str.endsWith("be Java")); // true
        System.out.println(str.endsWith("Ah be Java")); // true
        System.out.println(str.endsWith("")); // true

        // endsWith methodu ile cumlenin ne ile bittigini sorariz, true ya da false olarak donus aliriz
    }
}