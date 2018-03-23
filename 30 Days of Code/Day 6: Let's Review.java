import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
       String []arr = new String[T]; 
       for(int k= 0;k<T;k++)
        arr[k] = s.next();
      for(int i=0;i<T;i++){
       for(int j=0;j<arr[i].length();j+=2) 
            System.out.print(arr[i].charAt(j));
       System.out.print(" ");    
         for(int j=1;j<arr[i].length();j+=2) 
            System.out.print(arr[i].charAt(j));
       System.out.print("\n");
    }
    }
    
}
