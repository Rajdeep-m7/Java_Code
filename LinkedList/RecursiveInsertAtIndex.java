package LinkedList;

public class RecursiveInsertAtIndex {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtIndex(int data, int index) {
        head = insertRec(head, data, index);
    }

   
    private Node insertRec(Node current, int data, int index) {

        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = current;
            return newNode;
        }

        if (current == null) {
            System.out.println("Index out of bounds");
            return null;
        }

        // Recursive call
        current.next = insertRec(current.next, data, index - 1);
        return current;
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

        RecursiveInsertAtIndex list = new RecursiveInsertAtIndex();

        list.insertAtIndex(10, 0); 
        list.insertAtIndex(20, 1); 
        list.insertAtIndex(30, 2); 
        list.insertAtIndex(15, 1); 

        list.display();
    }
}
