package Linked_List;

public class LinkedList01 {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
        public Node(){}
    }
    private Node head;
    private int size;
    private Node tail;
    public void InsertAtFirst(int data){
        if(this.size == 0){
            Node node = new Node(data);
            this.head=node;
            this.tail=node;
            this.size++;
            return;
        }
        Node node = new Node(data);
        node.next=head;
        this.head=node;
        this.size++;
    }

    public void addAtLast(int data){
        if(this.size == 0){
            Node node = new Node(data);
            this.head = node;
            this.tail = node;
            this.size++;
            return;
        }

        Node node = new Node(data);
        tail.next = node;
        this.tail = this.tail.next;
        this.size++;
    }


    // inserting at any index
    public void addAtIndex(int data, int index) throws Exception {
        if(index<0 || index > this.size){
            throw new Exception("index is out of bound");
        }else if(index==0){
             InsertAtFirst(data);
        }else if(index==size-1){
            addAtLast(data);
        }else{
            Node newNode = new Node(data);
            Node prev = getNode(index-1);
            newNode.next = prev.next;
            prev.next= newNode;
            this.size++;
        }
    }
    public int getFirst() throws Exception {
        if(head==null){
            throw new Exception("linkedlist size is 0");
        }else{
            return this.head.data;
        }
    }

    public int getLast() throws Exception {
        if(head==null){
            throw new Exception("linkedlist size is 0");
        }else{
            return this.tail.data;
        }
    }

    public int getatindex(int k) throws Exception {
        return getNode(k).data;
    }

    private Node getNode(int k) throws Exception {
        if(k<0 || k>=size){
            throw new  Exception("index out of bound hai..give k ki value within range");
        }
        Node temp = this.head;
        for(int i=1 ; i<=k ; i++ ){
            temp=temp.next;
        }
        return temp;
    }

    public int removeFirst() throws Exception {
        if (head == null) {
            throw new Exception("linkedlist empty hai chaman");
        } else {
            Node temp = this.head;
            this.head = this.head.next;
            temp.next=null;
            this.size--;
            return temp.data;
        }
    }
    public int removeLast() throws Exception {
        if (head == null) {
            throw new Exception("linkedlist empty hai chaman");
        } else if (this.size==1) {
            return removeFirst();
        } else {
            Node temp=getNode(this.size-2);
            int rv= this.tail.data;
            this.tail = temp;
            tail.next=null;
            this.size--;
            return rv;
        }
    }

    public int removeAtIndex(int k) throws Exception {
        if(k<0 || k>=size){
            throw new  Exception("index out of bound hai..give k ki value within range");
        }
        if(k==0){
            return removeFirst();
        }else {
            Node current=getNode(k);
            Node previous=getNode(k-1);
            int rv = current.data;
            previous.next=current.next;
            current.next=null;
            this.size--;
            return rv;
        }
    }
    public void display(){
        Node temp = this.head;

        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}
