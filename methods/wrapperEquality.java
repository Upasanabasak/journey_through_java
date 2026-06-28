package methods;

public class wrapperEquality {
    public static void main(String[] args) {
        Integer x = 100;
        Integer y = 100;

        // equals() vs ==

        System.out.println("X equals y ? " +x.equals(y));
        System.out.println("X == y ? " + (x == y));

        // java typically cache -127 to 128

        Integer a = 127;
        Integer b = 127;

        // equals() vs ==

        System.out.println("X equals y ? "+ a.equals(b));
        // true because both objects hold the number 127
        System.out.println("X == Y ?" +(a == b));
        // == fails because they are two different objects at different memory locations
    }
}
