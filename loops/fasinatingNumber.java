package loops;

import java.util.Scanner;

public class fasinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d, t;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        d = n * 2;
        t = n * 3;
        System.out.println("Concatenate result is: " +n+d+t);
        
    }
}
