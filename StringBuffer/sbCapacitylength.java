package StringBuffer;

public class sbCapacitylength {
    public static void main(String[] args) {
        StringBuffer sb12 = new StringBuffer("Capacity");
        System.out.println("Cap" + sb12.capacity());
        System.out.println("Len" + sb12.length());

        System.out.println(sb12.capacity());


        StringBuffer sb13 = new StringBuffer();
        System.out.println("Cap" + sb13.capacity());
        System.out.println("Cap" + sb13.length());
        
        sb13.append("Computer Science and Engineering");
        System.out.println(sb13.capacity());
        sb13.append("I am Enjoy the Subject very much, Everyday and EveryTime....................");
        System.out.println("Cap" + sb13.capacity());
        System.out.println("Cap" + sb13.length());
    }
}
