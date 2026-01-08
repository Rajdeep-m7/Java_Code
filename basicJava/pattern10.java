public class pattern10 {
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>=0;i--){
            for(int j=0;j<n;j++){
                if(j<i){
                    System.out.print(" "+" ");
                }
                if(j>=i && j%2==0){
                    System.out.print("0"+" ");
                }
                if(j>=i && j%2==1){
                    System.out.print("1"+" ");
                }
            }System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<i){
                    System.out.print(" "+" ");
                }
                if(j>=i && j%2==0){
                    System.out.print("0"+" ");
                }
                if(j>=i && j%2==1){
                    System.out.print("1"+" ");
                }
            }
            System.out.println();
        }
    }
}
