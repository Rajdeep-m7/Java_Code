package SQ;

public class customStack {
    protected int[] data;
    private static final int default_size = 10;
    int ptr= -1;

    public customStack(){
        this(default_size);
    }

    public customStack(int size){
        this.data= new int[size];
    }

    public boolean push(int item)throws Exception{
        if(isFull()){
            throw new Exception("stack is full");
        }

        ptr++;
        data[ptr]= item;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
        }
        return data[ptr--];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr== -1;
    }

}
