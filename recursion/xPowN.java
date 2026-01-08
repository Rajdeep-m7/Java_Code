package recursion;

public class xPowN {
    public static int calPow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int pow=x*calPow(x, n-1);
        return pow;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=calPow(x, n);
        System.out.print(ans);
    }
}
