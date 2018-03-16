import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int num[] = new int[n];
            float mean = 0;
            for(int i = 0; i < n; i++){
                num[i] = scan.nextInt();
                mean += num[i];
            }
            mean = (float)mean/n;
            float sum = 0;
            for(int i = 0; i < n; i++){
                sum += ((num[i]-mean)*(num[i]-mean));
            }
            sum = (float)Math.sqrt(sum/n);
            System.out.printf("%.1f",sum);
    }
}
