package methods;

public class predefinedMethods {
    public static void main(String[] args) {
        String name = "Upasana Basak";

        String a1 = "mom";
        String a2 = "Mom";

        // println()
        System.out.println(name);

        // length()
        System.out.println("Length of name: " +name.length());

        // toUpperCase
        System.out.println("Upper case: " +name.toUpperCase());

        System.out.println(a1.equalsIgnoreCase(a2));
    }
}
