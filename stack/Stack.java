import java.util.*;

public class Stack{
    private Node top;
    private boolean fastMinRetrieval;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public int top(){
        return top.data;
    }

    public Node getStackTop(){
        return top;
    }
    
    public int push(int data){
        try{
            Node newNode=new Node(data);
            newNode.next=top;
            top=newNode;
            return 1;
        }catch(Exception e){
            System.out.println("ERROR! STACK OVERFLOW ERROR...");
            return 0;
        }
    }

    public int pop(){
        Node head=top;
        if(head==null){
            System.out.println("ERROR! STACK UNDERFLOW ERROR...");
            return -1;
        }
        top=top.next;
        return head.data;
    }
    
    public void display(){
        Node temp=top;
        if(temp==null){
            System.out.println("ERROR! STACK IS EMPTY...");
            return;
        }
        System.out.println("DISPLAYING STACK...");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        return;
    }
    
    // Check if stack is empty 
    // returns True if Stack Empty else false
    public boolean isStackEmpty(){
        if(top==null) return true;
        else return false;
    }
    public int getMin(){
        if(isStackEmpty()){ System.out.println("STACK IS EMPTY.."); return -1;}
        return getMinimum(this,Integer.MAX_VALUE);
    }
    // Get minimum of stack 
    // Time complexity O(n)
    // Space complexity O(1)
    private int getMinimum(Stack stack,int minimum){
        if(isStackEmpty()){
            return minimum;
        }
            int data=stack.pop();
            if(data<minimum) {
                minimum= getMinimum(stack,data);
            }else{
                minimum= getMinimum(stack,minimum);
            }
            stack.push(data);
            return minimum;
        }
    
    // Get minmimum in stack
    // Time complexity O(1)
    // Space complexity O(n)
    public int optimizedTimeMin(){
         
    }
}
