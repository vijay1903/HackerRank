import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int num[] = new int[n];
        int w[] = new int[n];
        int sum = 0, sum_w = 0;
        for(int i = 0; i < n; i++){
            num[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            w[i] = scan.nextInt();
        }
        for(int i = 0; i < n; i++){
            sum += num[i]*w[i];
            sum_w += w[i];
        }
        float mean = (float)sum/sum_w;
        System.out.printf("%.1f",mean);
    }
}
