package loops;

import java.util.Scanner;

public class fasinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, d, t, i;
        String result;
        boolean fasinating = true;
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        d = n * 2;
        t = n * 3;
        result = "" + n + d + t;
        System.out.println("Concatenate result is: " +result);
        for(i = 1; i <= result.length(); i++) {
            if (result.indexOf(i + "") == -1 || result.indexOf(i + "") != result.lastIndexOf(i + "")) {
                fasinating = false;
            }
        }
        if(fasinating) {
            System.out.println(n+ " is a Fasinating Number.");
        }
        else {
            System.out.println(n+ " is not a Fasinating Number.");
        }
    }
}
