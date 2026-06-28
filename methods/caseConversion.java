package methods;

public class caseConversion {
    public static void main(String[] args) {
        char letter0 = 'A';
        char letter1 = 'a';
        // Charecter.compare(first, second); return : -1 / 0 / 1

        // char letter00 = Character.toLowerCase(letter0);
        int result = Character.compare(Character.toLowerCase(letter0), Character.toLowerCase(letter1));
        System.out.println("Result : " + result);

        int num1 = 10;
        int num2 = 20;

        int comResult = Integer.compare(num1, num2);
        System.out.println("Integers are same? " + comResult);
    }
}
