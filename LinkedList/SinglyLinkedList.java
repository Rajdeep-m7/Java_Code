package LinkedList;

public class SinglyLinkedList {

    // Node class
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

    // Insert at beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found");
            return;
        }

        prev.next = temp.next;
    }

    public void rotateLL(int k){
        if(head == null || head.next == null){
            return;
        }
        for(int i =0 ; i<k ;i++){
            Node temp = head;
            Node prev= null;
            while(temp.next != null){
                prev= temp;
                temp = temp.next;
            }
            temp.next= head;
            head = temp;
            prev.next= null;
        }
    }

    // Display the list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void duplicate(){
        Node node= head;
        while(node.next != null){
            if(node.data == node.next.data){
                node.next= node.next.next;
            }else{
                node= node.next;
            }
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(30);
        list.insert(30);
        //list.insertAtBeginning(5);

        System.out.println("Linked List:");
        list.display();

        //list.delete(20);
        //System.out.println("After Deletion:");
        //list.duplicate();
        list.rotateLL(1);
        //System.out.println("After duplicate Deletion:");
        System.out.println("After rotate:");
        list.display();
    }
}
