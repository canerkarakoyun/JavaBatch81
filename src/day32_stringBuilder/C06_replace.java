package day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Calm down");
        System.out.println(sb);

        System.out.println(sb.replace(5, 9, "Up"));

        System.out.println(sb.replace(4, 5, "---"));
        System.out.println(sb.replace(4, 7, " "));

        System.out.println(sb.replace(5,7, "Down"));
    }
}
