package LinkedList;

import java.util.List;

//traversing a singly linked list
public class LinkedList {
    Node head;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }


    public static void traverse(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }

    public static void RecursiveTraverse(Node head){
        if(head==null)
            return;
        System.out.println(head.data);
        RecursiveTraverse(head.next);
    }

    public static int search(Node head,int x){
        Node n=new Node(x);
        int count=0;
        while(head!=null){
            if(head.data==n.data){
                return count+1;
            }
            head=head.next;
            count++;
        }
        return -1;
    }

    public static int RecursiveSearch(Node head,int x){

        if(head==null){
            return -1;
        }
        if(head.data==x){
            return 1;
        }
        int n=RecursiveSearch(head.next,x);
        if(n==-1)
            return -1;
        else
            return 1+n;
    }

    public static Node insertAtBegin(Node head,int x){
        Node n=new Node(x);
        n.next=head;
        head=n;
        return head;
    }

    public static Node insertAtEnd(Node head,int x){
        Node n=new Node(x);

        if(head==null) {
            return n;
        }
        Node h=head;
        while (h.next != null) {
            h= h.next;
        }
        h.next=n;

        return head;
    }

    public static Node deleteFirstNode(Node head){
        if(head==null)
            return null;
        else
            return head.next;
    }

    public static Node deleteLastNode(Node head){
        if(head==null)
            return null;
        if(head.next==null)
            return null;
        Node h=head;
        Node prev=null;
        while(h.next!=null) {
            prev=h;
            h = h.next;
        }
        prev.next=null;
        return head;
    }

    public static Node insertAtGivenPos(Node head,int pos,int data){
        int x=1;
        Node curr=head;
        Node n=new Node(data);
      if(pos==1) {
          n.next=head;
          return n;
      }

      while (x + 1 != pos) {
          curr = curr.next;
          x++;
      }
            if(curr==null)
                return head;

            n.next = curr.next;
            curr.next = n;

        return head;
    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        l.head=new Node(10);
        l.head.next=new Node(20);
        l.head.next.next=new Node(30);
        l.head.next.next.next=new Node(40);

        //traverse(l.head);
        //RecursiveTraverse(l.head);
        //int x= RecursiveSearch(l.head,20);
        //System.out.println(x);
        //l.head=insertAtBegin(l.head, 5);
        //RecursiveTraverse(l.head);
        //l.head = insertAtEnd(l.head, 50);
        //RecursiveTraverse(l.head);
       // l.head=deleteFirstNode(l.head);
       // RecursiveTraverse(l.head);
        //l.head=deleteLastNode(l.head);
        //RecursiveTraverse(l.head);
        l.head=insertAtGivenPos(l.head,3,25);
        RecursiveTraverse(l.head);
    }

}
