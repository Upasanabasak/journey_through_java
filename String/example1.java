package String;

public class example1 {

    // How to make a String in java ?
    public static void main(String[] args) {

        // 1. Using String Literal

        String str0 = "Hello";
        String str1 = "Hello";
        String str5 = "hello";

        // str1 is stored in String pool
        // The String pool in Java is a special memory

        // Using new keyword

        String str2 = new String("hello");
        String str3 = new String("hello");

        if (str2 == str5) {
            System.out.println("str2 and str3 refers to same object.");
        } else {
            System.out.println("str2 and str3 refers to different object.");
        }
    }
}
