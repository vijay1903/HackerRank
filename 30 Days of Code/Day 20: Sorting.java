import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp;
        int numberOfSwaps = 0;
        int a[] = new int[n];
        for (int k = 0; k < n; k++)
            a[k] = s.nextInt();
       for (int i = 0; i < n; i++) {

    
    for (int j = 0; j < n - 1; j++) {
        if (a[j] > a[j + 1]) {
            temp = a[j];
            a[j] = a[j + 1];
            a[j + 1] = temp;
            numberOfSwaps++;
        }
    }
    
   if (numberOfSwaps == 0) {
        break;
    }
           
    }
    System.out.print("Array is sorted in ");
    System.out.println(numberOfSwaps + " swaps.");
    System.out.println("First Element: " + a[0]);
    System.out.println("Last Element: " + a[n-1]);
}
}
