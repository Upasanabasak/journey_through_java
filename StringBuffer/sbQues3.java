/* Write a Java program to insert a string "FRIEND" in the given string 
    "----in need is a --- in deed".
*/
package StringBuffer;

public class sbQues3 {
    public static void main(String[] args) {
        StringBuffer sb7 = new StringBuffer("in need is a in deed");
        sb7.insert(0, "FRIEND ");
        sb7.insert(19, " FRIEND");
        System.out.println(sb7);
    }
}
