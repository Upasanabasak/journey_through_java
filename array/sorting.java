// Write a program in Java to sort an array in ascending order and display it.

package array;

import java.util.*;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        int temp, i, j;

        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }  
            }
        }
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                System.out.println("" + arr[i]);
            }
        }
    }
}