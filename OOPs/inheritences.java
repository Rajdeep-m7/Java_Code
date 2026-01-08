package OOPs;



class emp{ //super class
    int id;
    int salary;
    emp(int id, int salary){
        this.id=id;
        this.salary=salary;
    }
}
class emp1 extends emp{               //Inheritence //subclass
    int salInc;
    emp1(int i, int s, int salInc){
        super(i,s);
        this.salInc=salInc;
    }
    public void get(){
        System.out.println("id :" +id+" salary :"+salary+" salary insentives :" +salInc);
        //System.out.println(salary);
        //System.out.println(salInc);
    }
}
public class inheritences {
    public static void main(String[] args) {
        
        emp1 s1=new emp1(1001, 100000, 5000);
        emp1 s2=new emp1(1002, 105000, 5500);
        s1.get();
        s2.get();
    }
    
}
