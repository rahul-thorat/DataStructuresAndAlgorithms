package LinkedList;

public class SegregateEvenAndOddNodes extends LinkedList{

    public static Node segregate(Node head){

        Node es=null,ee=null,os=null,oe=null;

            while(head!=null){
                if(head.data%2==0){
                    if(es==null){
                        es=head;
                        ee=head;
                    }
                    else{
                        ee.next=head;
                        ee=ee.next;
                    }
                }
                else{
                    if(os==null){
                        os=head;
                        oe=head;
                    }
                    else{
                        oe.next=head;
                        oe=oe.next;
                    }
                }
                head=head.next;
        }
            if(os==null){
                return es;
            }
            if(es==null){
                return os;
            }

            oe.next=null;
            ee.next=os;

        return es;
    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.head=new Node(17);
        l.head.next=new Node(15);
        l.head.next.next=new Node(8);
        l.head.next.next.next=new Node(12);
        l.head.next.next.next.next=new Node(10);
        l.head.next.next.next.next.next=new Node(5);
        l.head.next.next.next.next.next.next=new Node(4);

        l.head=segregate(l.head);
        traverse(l.head);

    }
}
