package recursion;

public class factorial {
    public static int calculation(int n){
        if(n==1|| n==0){
            return 1;
        }
        int fact=n*calculation(n-1);
        //int sum=n*fact;
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        int ans=calculation(n);
        System.out.print(ans);
    }
}
