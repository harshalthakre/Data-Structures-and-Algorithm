import java.util.*;

public class Stack{
    private Node top;

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
    
    
    public void getMinimum(){
        
    }
}