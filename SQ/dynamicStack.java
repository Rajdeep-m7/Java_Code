package SQ;

public class dynamicStack extends customStack{
    public dynamicStack(){
        super();
    }
    public dynamicStack(int size){
        super(size);
    }

    public boolean push(int item)throws Exception{
        if(this.isFull()){
            int[] temp= new int[data.length*2];

            for(int i=0; i<data.length; i++){
                temp[i]= data[i];
            }
            data= temp;
        }
        return super.push(item);
    }
}
