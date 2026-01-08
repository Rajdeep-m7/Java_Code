package recursion;

public class quickSort {
    public static void main(String[] args) {
        int arr[]={1,4,2,11,3,8,6};
        pivot(arr, 0, 6);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void pivot(int arr[], int low, int high) {
        if(low<high){
            int pivotIdx=partition(arr, low, high);
            pivot(arr, low, pivotIdx-1);
            pivot(arr, pivotIdx+1, high);
        }
    }
    public static int partition(int arr[] , int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;

                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
