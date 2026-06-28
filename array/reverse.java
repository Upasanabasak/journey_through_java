/* Write a program in Java  that push elements in an array dynamically and display the array 
    in both reversed and sorted order */

package array;

import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, temp;
        System.out.println("Enter the total number of elements: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements- ");
        for(i = 0 ; i < n; i++) {
            System.out.println("Position number " + (i + 1) + " :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array are : ");
        for( i = 0; i < n; i++) {
            System.out.println(+arr[i]);
        }

        System.out.println("The reverse elements are : ");
        for( i = n - 1; i >= 0; i--) {
            System.out.println(+arr[i]);
        }
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }  
            }
        }
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                System.out.println("" + arr[i]);
            }
        }
    }
}