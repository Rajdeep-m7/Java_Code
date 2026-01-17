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

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
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

    private boolean isFull(){
        return ptr == data.length-1;
    }

    private boolean isEmpty(){
        return ptr== -1;
    }

    public static void main(String[] args) throws Exception {
        customStack stack = new customStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
