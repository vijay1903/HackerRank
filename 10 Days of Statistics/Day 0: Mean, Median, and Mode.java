import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int num[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i]==arr[j]){
                    num[i]++;
                }
            }
        }
        int mode = 100000;
        float mean, median, sum = 0,temp;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        mean = (sum/n);
        int max_num = 1;
        for(int i = 0; i < n; i++){
            if(num[i] > max_num){
                max_num = num[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(num[i] == max_num){
                if(arr[i]<mode){
                    mode = arr[i];
                }
            }
        }
        
        Arrays.sort(arr);
        
        if(max_num == 1){
            mode = arr[0];
        }
        if(n%2 == 0){
            median = (float)((arr[n/2]+arr[(n/2)-1]))/2;
        } else {
            median = (float)(arr[(n/2)]/2);
        }
        System.out.printf("%.1f\n",mean);
        System.out.printf("%.1f\n",median);
        System.out.printf("%d\n",mode);
        
    }
}
