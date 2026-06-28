package methods;

public class parsingDemo {
    public static void main(String[] args) {
        String basePrice = "100";
        String Tax = "10";

        int intBasePrice = Integer.parseInt(basePrice);

        // valueOf();

        Integer intTax = Integer.valueOf(Tax);

        int total = intBasePrice;
        System.out.println(total);
    }
    
}
