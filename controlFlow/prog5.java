//  switch - case

package controlFlow;

public class prog5 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        // ask user to provide operator

        char operator = '+';

        switch (operator) {
            case '+':
                System.out.println("Sum of the values" + (a + b));
                break;
            case '-':
                System.out.println("Diff of the values" + (a - b));
                break;
            case '*':
                System.out.println("Product of the values" + (a * b));
                break;
            case '/':
                System.out.println("Division of the values" + (a / b));
                break;
        
            default:
                System.err.println("Wrong Operator");
                break;
        }
    }
}
