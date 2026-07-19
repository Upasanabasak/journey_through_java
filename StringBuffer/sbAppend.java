package StringBuffer;

public class sbAppend {
    public static void main(String[] args) {
        StringBuffer sb3 = new StringBuffer("Hello");
        sb3.append(" World!");
        System.out.println(sb3);
        StringBuffer sb4 = new StringBuffer(5);
        sb4.append("Computer Science");
        System.out.println(sb4);
        StringBuffer sb5 = new StringBuffer();
        sb5.append("Java Classes");
        System.out.println(sb5);
    }
}
