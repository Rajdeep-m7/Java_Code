package recursion;

public class occurenceOfelements {
    public static void find(String str,int idx, int f, int l, int n, char element) {
        if(idx==n){
            System.out.println("first:"+f+" "+"last:"+l);
            return;
        }
        if(str.charAt(idx)==element){
            if(f==-1){
                f=idx;
            }
            else{
                l=idx;
            }
        }
        find(str, idx+1, f, l, n, element);
        
    }
    public static void main(String[] args) {
        String str="abcdhsaarv";
        find(str, 0, -1, -1, str.length(), 'a' );
    }
}
