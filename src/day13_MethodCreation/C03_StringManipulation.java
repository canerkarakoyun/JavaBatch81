package day13_MethodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {
        /*
        " Java ogrenmek123 Cok guzel@ " Stringini "Java ogrenmek cok guzel." haline getirin.
         */

        String str=" Java ogrenmek123 Cok guzel@ ";

        str=str.trim();
        System.out.println(str);

        str=str.replaceAll("\\d", "");
        System.out.println(str);

        str=str.replace("@", ".");
        System.out.println(str);

        str=str.replace("C", "c");
        System.out.println(str);
    }
}
