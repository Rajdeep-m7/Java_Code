
public class holoRectangle {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(j==1 || j==m || i==1 || i==n){
                System.out.print("*");
                }else {
                System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}
