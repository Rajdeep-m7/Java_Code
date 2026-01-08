package recursion;
public class maze {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }
    public static int count(int r, int c) {
        if(r==1 || c==1){
            return 1;
        }
        int down =count(r-1,c);
        int left=count(r,c-1);
        return down+left;
    }
}
