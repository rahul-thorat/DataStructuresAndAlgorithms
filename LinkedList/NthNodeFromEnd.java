package LinkedList;

public class NthNodeFromEnd extends LinkedList{

    public static void nthNodeFromEnd(Node head,int n){
        Node m=head;
        n=n-1;
        while(n>0 && m!=null){
            m=m.next;
            n--;
        }

        while(m!=null && m.next!=null){
            head=head.next;
            m=m.next;
        }
        if(m!=null) {
            System.out.println(head.data);
        }
    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.head=new Node(10);
        l.head.next=new Node(20);
        l.head.next.next=new Node(30);
        //l.head.next.next.next=new Node(40);
        //l.head.next.next.next.next=new Node(50);
        nthNodeFromEnd(l.head,1);

    }
}
