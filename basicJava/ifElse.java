import java.util.*;
public class ifElse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a==b){
            System.out.println("a and b equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        
        
        sc.close();
    }
}
