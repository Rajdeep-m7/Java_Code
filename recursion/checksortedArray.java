package recursion;

public class checksortedArray {
    public static void checkArray(int arr[], int idx) {
        if(idx==arr.length-1){
            System.out.println(true); 
            return;
        }
        if(arr[idx]>=arr[idx+1]){
            System.out.println(false); 
            return;
        }
        checkArray(arr, idx+1);
    }
    public static void main(String [] args){
        int arr[]={1,2,5};
        checkArray(arr, 0);
    }
}
