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
    public void reverseBetween(int left, int right) {
    if (head == null || left == right) return;

    Node dummy = new Node(0);
    dummy.next = head;
    Node prev = dummy;

    for (int i = 1; i < left; i++) {
        prev = prev.next;
    }

    Node current = prev.next;
    Node next = null;

    for (int i = 0; i < right - left; i++) {
        next = current.next;
        current.next = next.next;
        next.next = prev.next;
        prev.next = next;
    }

    head = dummy.next;
}



    public static void main(String[] args) {

        ReverseLL list = new ReverseLL();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Linked List:");
        list.display();

        list.reverse();
        System.out.println("After reverse:");
        list.display();

        list.reverseBetween(2, 4);
        System.out.println("After reverse sublist:");
        list.display();

    }
}
