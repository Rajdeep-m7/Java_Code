public class numPhyramid {
    public static void main(String[] args) {
        int n=5;
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
