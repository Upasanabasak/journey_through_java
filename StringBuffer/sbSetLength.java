package StringBuffer;

public class sbSetLength {
    public static void main(String[] args) {
        StringBuffer sb16 = new StringBuffer();
        sb16.append("Computer Science ..............");
        System.out.println(sb16 + " | len :" + sb16.length() + " | Cap :" + sb16.capacity());
        sb16.setLength(8);
        System.out.println(sb16 + " | len :" + sb16.length() + " | Cap :" + sb16.capacity());
    }
}
