package controlFlow;

import java.util.Scanner;

public class prog4 {
    public static void main(String[] args) {
        
        // database
        String username = "sristi";
        String password = "123kol@sristi";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Username... ");
        String yourUsername = sc.nextLine();

        System.out.println("Enter your password... ");
        String yourPassword = sc.nextLine();

        if(yourUsername.equals(username) && yourPassword.equals(password)) {
            System.out.println("Login Successfully");
        }
        else {
            System.out.println("Wrong Credentials ...");
        }
    }
}
