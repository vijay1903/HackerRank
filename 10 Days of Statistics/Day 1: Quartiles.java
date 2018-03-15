import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int temp;
        for(int i = 0; i< n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        /*for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");    
        }
        System.out.println("");*/
        int q1, q2, q3;
        if(n%2==0){ //even numbers 6,8,10,12,14,16,18,...
            q2 = (arr[n/2]+arr[(n/2)-1])/2;
            if((n/2)%2!=0){
                q1 = arr[(n/4)];
                q3 = arr[(3*n/4)];
            } else{
                q1 = (arr[(n/4)-1]+arr[n/4])/2;
                q3 = (arr[(3*n/4)-1]+arr[3*n/4])/2;
            }
        } else { //odd numbers 5,7,9,11,13,15,17,19,...
            q2 = arr[n/2];
            if((n/2)%2!=0){ //if half is odd 
                q1 = arr[n/4];
                q3 = arr[3*n/4];
            } else { // if half is even
                q1 = (arr[(n/4)-1]+arr[(n/4)])/2;
                q3 = (arr[3*n/4]+arr[(3*n/4)+1])/2;
            }
        }
        
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }
}
