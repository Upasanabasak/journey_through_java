package loops;

public class prog2 {
    public static void main(String[] args) {
        String Fruits[] = { "Apple", "Mango", "Bannana", "Orange", "Litchi" };

        // Fruits.length();
        // for(int i = 0; i <= length(Fruits); i++) {}

        // For - each loop: (dataType variable : collection)

        for (String fruit : Fruits) {
            System.out.println("Fruit : " + fruit);
        }
    }
}
