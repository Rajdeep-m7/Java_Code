package SQ;

public class queueMain {
    public static void main(String[] args) throws Exception {
        dynamicQueue queue = new dynamicQueue(3);

    
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }

}
