package recursion;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={1,4,2,6,3,8,9};
        divide(arr, 0, 6);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void divide(int arr[], int si, int ei) {
        if(si==ei){
            return ;
        }
        int mid=si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static int[] conquer(int arr[], int si, int mid, int ei) {
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<arr[idx2]){
                merged[x]=arr[idx1];
                x++;
                idx1++;
            }
            else{
               if(arr[idx2]<arr[idx1]){
                merged[x]=arr[idx2];
                x++;
                idx2++;
            } 
            }
        }
        while(idx1<=mid){
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }
        while(idx2<=ei){
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }
        for(int i=0,j=si; i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
        return arr;
    }
}
