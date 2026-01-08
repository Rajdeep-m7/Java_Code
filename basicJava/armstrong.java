import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,r,sum=0;
        int m=n;
        while(n!=0){
            count++;
            n=n/10;
        }
        n=m;
        while(n!=0){
            r=n%10;
            sum=sum+(int)Math.pow(r,count);
            n=n/10;
        }
        if(sum==m){
            System.out.print("Armstrong number");
        }
        else{
             System.out.print("Not Armstrong number");
        }
        sc.close();
    }
}
