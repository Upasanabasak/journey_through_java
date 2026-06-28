package String;

public class example5 {
    public static void main(String[] args) {
        String one = "abcd";
        String two = "ABCD";
        String three = "efgh";
        String four = "abcd";

        System.out.println(one.equals(four));
        System.out.println(one.equals(two));
        System.out.println(one.equals(three));

        System.out.println(one.equalsIgnoreCase(two));
    }
}
