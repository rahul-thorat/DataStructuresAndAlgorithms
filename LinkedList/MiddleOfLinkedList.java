package LinkedList;

//Find the middle node of a linked list in one traversal
public class MiddleOfLinkedList extends LinkedList{

    public static int middle(Node head){
        Node slow=head;
        Node fast=head;
        if(head==null)
            return -1;
        else {
            while (fast.next != null && fast.next.next != null ) {
                slow = slow.next;
                fast = fast.next.next;
            }
            if(fast.next==null){
                return slow.data;
            }
            else
                return slow.next.data;
        }

    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.head=new Node(10);
        l.head.next=new Node(20);
        l.head.next.next=new Node(30);
        //l.head.next.next.next=new Node(40);
        int x=middle(l.head);
        System.out.println(x);

    }
}
