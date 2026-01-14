package LinkedList;
public class plindromeLL {
    static class Node{
        int val ;
        Node next;
        Node(int val){
            this.val= val;
            this.next=null;
        }
    }
    Node head;
    
    public void insertLast(int val) {
        Node newNode = new Node(val);

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
    
    private Node findMid(Node head){
        Node slow= head;
        Node fast= head;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

     private Node reverse(Node head) {
        Node prev = null, curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public  boolean isPalindrome(){
        

        Node mid = findMid(head);
        Node headSecond = reverse(mid.next);
        Node reverseHead = headSecond;
        Node headFirst = head;


        while(headSecond != null){
            if(headFirst.val != headSecond.val){
                break;
            }
            headFirst = headFirst.next;
            headSecond = headSecond.next;
        }
        reverse(reverseHead);

        if(head == null || headSecond== null){
            return true;
        }
        return false;
    }

    public void reOrder(){
        if(head == null && head.next== null){
            return;
        }
        Node mid = findMid(head);
        Node hf= head;
        Node hs = reverse(mid.next);

        while(hf!= null && hs != null){
            Node temp = hf.next;
            hf.next= hs;
            hf= temp;

            temp = hs.next;
            hs.next= hf;
            hs= temp;
        }
        if(hf !=null){
            hf.next=null;
        }
    }

     public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        plindromeLL list = new plindromeLL();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(2);
        list.insertLast(1);
        //list.insertLast(3);

        list.display();
        System.out.println("Is Palindrome? " + list.isPalindrome());
        list.display();
        list.reOrder();
        list.display();
    }
}
