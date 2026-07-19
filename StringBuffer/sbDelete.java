package StringBuffer;

public class sbDelete {
    public static void main(String[] args) {
        StringBuffer sb9 = new StringBuffer("Computers");
        sb9.delete(8, 9);
        System.out.println(sb9);
        StringBuffer sb10 = new StringBuffer("Kingfisher");
        sb10.delete(4, 10);
        System.out.println(sb10);
    }
}
