package loops;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp, count = 0, sum = 0, digit;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        temp = n;
        while (n > 0) {
            count++;
            n /= 10;
        }
        // System.out.println(+count);
        n = temp;
        while (n > 0) {
            digit = n % 10;
            sum += Math.pow(digit, count);
            n /= 10;
        }
        n = temp;
        if (n == sum)
            System.out.println(sum + " is an armstrong number.");
        else
            System.out.println(sum + " is not an armstrong number.");
    }
}
