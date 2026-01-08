package OOPs;
abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("creating an animal");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("creating a horse class");
    }
    void walk(){
        System.out.println("walk with 4 legs");
    }
}

class Chicken extends Animal{
    Chicken(){
        System.out.println("creating a chicken class");
    }
    void walk(){
        System.out.println("walk with 2 legs");
    }
}
public class abstractionJava {
    public static void main(String[] args) {
        Horse horse1= new Horse();
        horse1.walk();
        Chicken chicken1=new Chicken();
        chicken1.walk();
    }
}
