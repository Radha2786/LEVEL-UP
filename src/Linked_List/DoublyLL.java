package Linked_List;

public class DoublyLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
        }
        public Node(int data, Node next, Node prev){
            this.data= data;
            this.next=next;
            this.prev=prev;
        }
    }

    private Node head;
    private int size;
    private Node tail;

    public Node ConvertArr2DLL(int[] arr){
        head = new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length ; i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public void print() {
        Node temp = this.head;
        while (temp != null) {
            // Print the data in the current node
            System.out.print( temp.prev +"<-" + temp.data + "->" + temp.next);
            // Move to the next node
            temp = temp.next; // Move to the next node
        }
        System.out.println();
    }
}
