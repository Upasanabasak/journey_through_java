package Exception;

public class arrayOoB {
    public static void main(String[] args) {
        try {
            int myArray[] = { 1, 2, 4, 5 };
            int fav = myArray[10];
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("The number doesn't exists.");
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
