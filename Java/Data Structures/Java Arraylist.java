import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        ArrayList<int[]> a = new ArrayList<int[]>();
        for(int i = 0; i < n; i++){
            int jn = scan.nextInt();
            int b[] = new int[jn];
            for(int j = 0; j <jn; j++){
                b[j] = scan.nextInt(); 
            }
            a.add(b);
        }
        int n2 = scan.nextInt();
        while(n2-- > 0){
            int p = scan.nextInt();
            int q = scan.nextInt();
            if(p <= a.size()){
                int temp[] = a.get(p-1);
                if(q <= temp.length){
                    System.out.println(temp[q-1]);
                } else {
                    System.out.println("ERROR!");    
                }
            } else {
                System.out.println("ERROR!");
            }
        }
        scan.close();
}
}
