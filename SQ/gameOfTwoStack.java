package SQ;

import java.util.Arrays;
import java.util.Scanner;

public class gameOfTwoStack {

    static int game(int x , int[] a , int[] b){
        return game(x, a, b ,0 ,0) - 1;
    }

    private static int game(int x , int[] a , int[] b , int sum , int count){
        if(sum > x){
            return count;
        }

        if(a.length == 0 || b.length == 0){
            return count;
        }

        int ans1 = game(x , Arrays.copyOfRange(a , 1 , a.length), b , sum + a[0] , count+1); // array.copyOfRange use for slicing 
        int ans2 = game(x , a, Arrays.copyOfRange(b , 1 , b.length), sum + b[0] , count+1);

        return Math.max(ans1 , ans2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stack A: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements of stack A:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter size of stack B: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        System.out.println("Enter elements of stack B:");
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }

        System.out.print("Enter max sum (x): ");
        int x = sc.nextInt();

        int result = game(x, a, b);
        System.out.println("Maximum moves: " + result);

        sc.close();
    }
}