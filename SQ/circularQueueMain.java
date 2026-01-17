package SQ;

public class circularQueueMain {
    public static void main(String[] args) throws Exception {
        circularQueue queue = new circularQueue();

    
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.display();

        System.out.println(queue.remove());

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
