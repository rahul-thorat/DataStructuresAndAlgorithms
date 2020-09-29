package LinkedList;

//Reverse a Linked List In Groups
//Find also recursive solution
public class ReverseInGroups extends LinkedList {

    public static Node reverseInGroups(Node head,int k){
        int group=k;
        Node prev=null;
        Node curr=head;
        Node nex=null;
        while(group>0 && curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
            group--;
        }
        Node temp=prev;
        while(temp.next!=null){
            temp=temp.next;
        }

        if(curr!=null)
            temp.next=reverseInGroups(curr,k);
        return prev;
    }


    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        l.head=new Node(10);
        l.head.next=new Node(20);
        l.head.next.next=new Node(30);
        l.head.next.next.next=new Node(40);
        l.head.next.next.next.next=new Node(50);
        /*l.head.next.next.next.next.next=new Node(60);
        l.head.next.next.next.next.next.next=new Node(70);
        l.head.next.next.next.next.next.next.next=new Node(80);
        l.head.next.next.next.next.next.next.next.next=new Node(90);

         */

       // traverse(l.head);
        l.head=reverseInGroups(l.head,3);
        traverse(l.head);
    }
}
