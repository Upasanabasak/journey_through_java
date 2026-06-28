package methods;

public class unboxFeature {
    public static void main(String[] args) {
        String webInput = "45";
        int price = Integer.parseInt(webInput);
        int tax = 10;
        int finalPrice = price + tax;
        System.out.println(finalPrice);
    }
}
