// Write a simple Java program to change the string "impossible" to "possible"
package StringBuffer;

public class sbQues2 {
    public static void main(String[] args) {
        StringBuffer sb10 = new StringBuffer("impossible");
        sb10.delete(0, 2);
        System.out.println(sb10);
    }
}
