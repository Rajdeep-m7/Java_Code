package SQ;

import java.io.EOFException;

public class circularQueue {
    protected int[] data;
    private static final int default_size = 10;
    protected int end= 0;
    protected int front = 0;
    protected int size =0;

    public circularQueue(){
        this(default_size);
    }

    public circularQueue(int size){
        this.data= new int[size];
    }
    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception(" Queue is full");
        }
        data[end++]= item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove()throws Exception{
        if(isEmpty()){
            throw new EOFException("Queue is empty");
        }
        int removed = data[front];
        front++;
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception(" Queue is empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + "->");
            i++;
            i = i % data.length;
        }while(i != end);
        System.out.println("End");
    }
}
