package Oops.Stack;

public class Stack {
    private int[] arr;
    private int top=0;
    public Stack(){
        this.arr = new int[5];
    }
    public Stack(int size){
        this.arr = new int[size];
    }

    public void push(int data) throws Exception {
        if(isFull()){
            throw new Exception("stack full ho gya bhaii");
        }
        arr[this.top]=data;
        this.top++;
    }

    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("stack empty hai gadhe");
        }
        this.top--;  // top = top-1;
        return this.arr[this.top];
    }

    public boolean isEmpty(){
        return top==0;
    }
    public boolean isFull(){
        return this.top==this.arr.length;
    }
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("stack empty hai bhaii");
        }
        return this.arr[this.top-1];
    }
    public int size(){
        return this.top;
    }

    public void display(){
        for(int i=0;i<top;i++){
            System.out.println(this.arr[i]+" ");
        }
        System.out.println();
    }

}
