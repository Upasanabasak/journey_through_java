package loops;

import java.util.Scanner;

public class largest3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, largest;
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        c = sc.nextInt();
        largest = (a > b ) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest number is: " +largest);
    }
}
