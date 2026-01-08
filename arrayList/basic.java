import java.util.*;
public class basic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> al= new ArrayList<Integer>();
        System.out.println("enter numbers and type q to quit :");
        while(true){
            String input=sc.nextLine();
            if(input.equalsIgnoreCase("q")){
                break;
            }
            try{
                int num=Integer.parseInt(input);
                al.add(num);
            }catch(NumberFormatException e){
                System.out.println("invalid number");
            }
        }
        System.out.println("numbbers are:" + al);
        sc .close();
    }
}
