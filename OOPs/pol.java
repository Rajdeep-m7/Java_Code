package OOPs;

class Student1{
    int roll;
    String name;
    Student1(int roll, String name){
        this.roll=roll;
        this.name=name;
    }
    public void displayInfo(){
        System.out.println(this.roll);
        System.out.println(this.name);
    }
    public void displayInfo(int roll){
        System.out.println(this.roll);
    }
    public void displayInfo(String name){
        System.out.println(this.name);
    }
}
public class pol {
    public static void main(String[] args) {
        Student1 s1=new Student1(18,"Rajdeep");
        //s1.roll=18;
        //s1.name="Rajdeep";
        s1.displayInfo();
        s1.displayInfo(s1.roll);
        s1.displayInfo(s1.name);
    }
}
