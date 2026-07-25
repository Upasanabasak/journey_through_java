package Exception;

public class tryCatchBlock {
    public static void main(String[] args) {
        try {
            int number = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
