package LinkedList;
public class MergeSortedLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; 

    public void insertLast(int data) {
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

    public void merge(Node h1, Node h2) {

        while (h1 != null && h2 != null) {

            if (h1.data <= h2.data) {
                insertLast(h1.data);
                h1 = h1.next;
            } else {
                insertLast(h2.data);
                h2 = h2.next;
            }
        }

        while (h1 != null) {
            insertLast(h1.data);
            h1 = h1.next;
        }

        while (h2 != null) {
            insertLast(h2.data);
            h2 = h2.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

       
        Node h1 = new Node(1);
        h1.next = new Node(3);
        h1.next.next = new Node(5);

        Node h2 = new Node(2);
        h2.next = new Node(4);
        h2.next.next = new Node(6);

        MergeSortedLL list = new MergeSortedLL();
        list.merge(h1, h2);

        list.display();
    }
}
