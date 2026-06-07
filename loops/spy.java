package loops;

import java.util.Scanner;

public class spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, digit, sum = 0, product = 1, temp;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        if (sum == product)
            System.out.println(temp + " is a spy number.");
        else
            System.out.println(temp + " is not a spy number.");
    }
}
