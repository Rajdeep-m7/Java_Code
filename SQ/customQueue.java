package SQ;

import java.io.EOFException;

public class customQueue {
    protected int[] data;
    private static final int default_size = 10;
    int end= 0;

    public customQueue(){
        this(default_size);
    }

    public customQueue(int size){
        this.data= new int[size];
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception(" Queue is full");
        }
        data[end++]= item;
        return true;
    }

    public int remove()throws Exception{
        if(isEmpty()){
            throw new EOFException("Queue is empty");
        }
        int removed = data[0];

        for(int i =1 ; i<end ; i++){
            data[i-1]= data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception(" Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for(int i=0 ; i< end ;i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("End");
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end== 0;
    }

}
