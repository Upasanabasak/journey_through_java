package Exception;

public class finallyBlock {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            // System.out.println(str);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
