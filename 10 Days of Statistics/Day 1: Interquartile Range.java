import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x[] = new int[n];
        int f[] = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = scan.nextInt();
        }
        int f_sum = 0;
        for(int i = 0; i < n; i++){
            f[i] = scan.nextInt();
            f_sum += f[i];
        }
        int num[] = new int[f_sum];
        int k = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < f[i]; j++){
                num[k] = x[i];
                k++;
            }
        }
        Arrays.sort(num);
        /*for(int i = 0; i < f_sum; i++){
            System.out.println(num[i]+" "+i);
        }*/
        float answer,q1,q3;
        if(f_sum%2==0){
            if((f_sum/2)%2==0){
                q1 = (float)(num[(f_sum/4)-1]+num[f_sum/4])/2;
                q3 = (float)(num[(3*(f_sum/4))-1]+num[3*(f_sum/4)])/2;
                answer = q3-q1;
            } else {
                q1 = (float)num[(f_sum/4)];
                q3 = (float)num[f_sum/2+(f_sum/4)];
                answer = q3-q1;
            }
        } else {
            if(((f_sum/2))%2==0){
                q1 = (float)(num[(f_sum/4)-1]+num[f_sum/4])/2;
                q3 = (float)(num[(3*(f_sum/4))]+num[3*(f_sum/4)+1])/2;
                answer = q3-q1;
            } else {
                q1 = (float)num[(f_sum/4)];
                q3 = (float)num[(f_sum/2)+(f_sum/4)+1];
                answer = q3-q1;
            }
        }
        System.out.printf("%.1f",answer);
    }
}
