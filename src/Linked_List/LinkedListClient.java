package Linked_List;

public class LinkedListClient {
    public static void main(String[] args) throws Exception {
        LinkedList01 ll = new LinkedList01();
        ll.InsertAtFirst(10);
        ll.addAtLast(20);
        ll.addAtLast(30);
        ll.addAtLast(50);
        ll.addAtLast(100);

//        ll.display();
//        System.out.println(ll.getLast());
//        System.out.println(ll.removeFirst());
//        System.out.println(ll.removeFirst());

//        System.out.println(ll.removeAtIndex(1));
//        ll.display();
        ll.addAtIndex(-90,3);
        ll.display();
    }
}
