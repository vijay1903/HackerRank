import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i=0,j=1;
        while(n!=0){
        if(n%2==1)
            i++;
        else
            i=0;
        if(j<=i)
           j=i;
        n/=2; 
        }
        System.out.println(j);
    }
}
