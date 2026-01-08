package OOPs;

class Pen{
    /*String color;
    String type;

    public void write(){
        System.out.println("wrting something");
    }
    public void printColor(){
        System.out.println(this.color);
    }*/
}
class Student{
    String name;
    int age;
    public void displayInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    /*Student(String name, int age){//parameterize constructor
        this.name=name;
        this.age=age;
    }*/

    Student(Student s2){ //copy contrustor
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){  //default constructor
        
    }
}
public class Constructor {
/*public static void main(String[] args) {
Pen pen1= new Pen();
       pen1.color="blue";
       pen1.type="gel";
       pen1.printColor();
       Pen pen2= new Pen();
       pen2.color="black";
       pen2.type="gel";
       pen2.printColor();
      pen1.write();
    }*/

public static void main(String[] args) {
   // Student student1= new Student(); 
   // student1.name="rajdeep";
   // student1.age=19;
   // student1.displayInfo();


   //Student s1=new Student("Rajdeep", 19); // parameterize constructor
   //Student s2=new Student("Ayush", 10);// parameterize constructor
   //s1.displayInfo();
   //s2.displayInfo();

    Student s1=new Student();
    s1.name="Aman";
    s1.age=20;
    Student s2= new Student(s1); //copy from s1
    s2.displayInfo();

}
}



