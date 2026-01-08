package recursion;

public class mazePath {
    public static void main(String[] args) {
        count("",3,3);
    }
    public static void count(String p, int r , int c) {
        if(c==1 && r==1){
            System.out.println(p);
            return ;
        }
        if(r>1){
            count(p+'D',r-1,c);
        }
        if(c>1){
            count(p+'R',r,c-1);
        }
    }
}
