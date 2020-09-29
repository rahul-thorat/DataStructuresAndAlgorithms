package LinkedList;

/*
Total 5 Methods:
1.Naive solution:O(n^2)
2.Modify linked list structure:O(n)
3.Temp node(linked list structure same):O(n)
4.Hashing:O(n)-time & space
5.Floyd algo:O(n) time O(1) extra space
 */

import java.util.HashSet;
import java.util.Set;

public class DetectALoop extends LinkedList {

    public static boolean detect (Node head){

        Set<Node> set=new HashSet<>();
        while(head.next!=null){
            if(set.contains(head))
                return true;
            else
                set.add(head);
            head=head.next;
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.head=new Node(10);
        l.head.next=new Node(20);
        l.head.next.next=new Node(30);
        l.head.next.next.next=new Node(40);
        //l.head.next.next.next.next=l.head.next.next;

        boolean a=detect(l.head);
        System.out.println(a);

    }
}
