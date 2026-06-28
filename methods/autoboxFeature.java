package methods;

public class autoboxFeature {
    public static void main(String[] args) {
        int finalScore = 0;
        int aScore = 50;
        int bScore = 60;
        // int cScore = null;
        Integer cScore = 12;  // autoboxing
        if(cScore == null) {
            System.out.println("Student failed to attend exam");
        }
        int Cscore = cScore; // unboxing
        finalScore = aScore + bScore + Cscore;
        System.out.println(finalScore);

    }
}
