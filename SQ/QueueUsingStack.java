package SQ;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek(){
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public void display() {
    if (isEmpty()) {
        System.out.println("Queue is empty");
        return;
    }

    while (!first.isEmpty()) {
        second.push(first.pop());
    }

    System.out.print("Queue: ");
    for (int item : second) {
        System.out.print(item + " ");
    }
    System.out.println();

    while (!second.isEmpty()) {
        first.push(second.pop());
    }
}


    public boolean isEmpty(){
        return first.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        
        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
