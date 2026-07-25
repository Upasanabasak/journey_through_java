package Exception;

public class throwKeyword {
    public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            System.out.println("You are not eligible to vote");
            throw new ArithmeticException("Age must be >= 18");
        } else {
            System.out.println("You can vote");
        }
    }
}
