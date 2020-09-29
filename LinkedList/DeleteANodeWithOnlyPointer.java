package LinkedList;

//Delete A Node With Only Pointer given to it and no reference to head pointer
public class DeleteANodeWithOnlyPointer extends LinkedList {

    public static void deleteWithOnlyPointer(Node pt){

        Node temp=null;
        if(pt.next==null) {
            System.out.println("Cant be deleted");
        }

        else {
            pt.data = pt.next.data;
            pt.next=pt.next.next;
        }

    }

    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        l.head=new Node(10);
        l.head.next=new Node(20);
        l.head.next.next=new Node(30);
        l.head.next.next.next=new Node(40);
        deleteWithOnlyPointer(l.head.next.next);
        traverse(l.head);
    }
}
