package LinkedList;

//Reverse a linked list using recursion
public class ReverseALinkedList extends LinkedList {

    public static Node recursiveReverse(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node res_head=recursiveReverse(head.next);
        Node res_tail=head.next;
        res_tail.next=head;
        head.next=null;
        return res_head;
    }

    public static void main(String[] args) {

        LinkedList l=new LinkedList();

        l.head=new Node(10);
        l.head.next=new Node(20);
        l.head.next.next=new Node(30);
        //l.head.next.next.next=new Node(40);

        l.head=recursiveReverse(l.head);
        RecursiveTraverse(l.head);

    }
}
