package StringBuffer;

public class sbReverse {
    public static void main(String[] args) {
        StringBuffer sb11 = new StringBuffer("Computer");
        sb11.reverse();
        System.out.println(sb11);

        // StringBuffer word = new StringBuffer("Dad");
        // StringBuffer revWord = word.reverse();

        String word = "Father";
        StringBuffer sb12 = new StringBuffer(word);
        String revWord = sb12.reverse().toString();
        if (word.equals(revWord)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not palindrom");
        }
    }
}
