package String;

public class example8 {
    public static void main(String[] args) {
        String fruits = "apple,banana,grape,orange";
        String[] favFruits = fruits.split(",");

        for (String fruit : favFruits) {
            System.out.print(fruit);
        }

        System.out.println(" ");
        String data = "Alice, Bob; Charlie    David, Eve;Frank,,Sristi";
        String[] names = data.split("[,;\\s]+");

        System.out.println("Original: " + data);
        System.out.println("Split result: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
