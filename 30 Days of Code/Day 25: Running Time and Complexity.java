import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            isPrime(scan.nextInt());
        }
    }
    public static void isPrime(int n){
        boolean primeness = true;
        for(int i = 2; i < n; i++){
            if(n%i==0){
                primeness = false;
                break;
            }
        }
        if(primeness){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
