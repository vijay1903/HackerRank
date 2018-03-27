//import java.lang.Math;
class e extends Exception{
    String msg;
    
    e(){}
    
    e(String msg){
        super(msg);
        this.msg = msg;
    }
}
class Calculator extends Solution{
    int power(int n ,int p) throws e {
        int ans = (int)Math.pow(n,p);
        if(n>=0&&p>=0){
            return ans;
        }
        else
            throw new e("n and p should be non-negative");
    }
}
