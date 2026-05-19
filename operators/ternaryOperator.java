package operators;

public class ternaryOperator {
    public static void main(String[] args) {
        int num = 5;
        // variable = (condition) ? expression1 : expression2;
        String result = (num % 2 == 0) ? "Even" : "Odd" ;
        char result1 = (num % 2 == 0) ? 'E' : 'O' ;
        int result2 = (num % 2 == 0) ? 1 : 0 ;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
