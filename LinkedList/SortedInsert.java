package LinkedList;

//sorted insert in a linked list
public class SortedInsert extends LinkedList {

    public static Node insertSorted(Node head,int data){

        Node n=new Node(data);
        if(head==null){
            return n;
        }
        Node prev=null;
        Node curr=head;
        while(curr!=null && curr.data<data ){
            prev=curr;
            curr=curr.next;
        }
        if(prev==null){
            n.next=curr;
            head=n;
        }
        else {
            prev.next = n;
            n.next = curr;
        }

        return head;
    }

    public static void main(String[] args) {

        LinkedList l=new LinkedList();
        l.head=new Node(10);
        l.head.next=new Node(20);
        l.head.next.next=new Node(30);
        l.head.next.next.next=new Node(40);
        l.head=insertSorted(l.head,5);
        RecursiveTraverse(l.head);


    }
}
