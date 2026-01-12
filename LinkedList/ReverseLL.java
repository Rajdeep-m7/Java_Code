package LinkedList;

public class ReverseLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; 

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
    Node prev = null;
    Node current = head;

    while (current != null) {
        Node next = current.next; 
        current.next = prev;      
        prev = current;           
        current = next;         
    }

    head = prev;
}


    public static void main(String[] args) {

        ReverseLL list = new ReverseLL();

        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(30);

        System.out.println("Linked List:");
        list.display();

        list.reverse();
        System.out.println("After reverse:");
        list.display();
    }
}
