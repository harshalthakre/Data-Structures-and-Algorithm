import java.util.*;
public class LinkedList{

    private Node head;

    public LinkedList(){
        this.head=null;
    }

    class Node{
        private int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public Node getHead(){
        return head;
    }
    // Add new node to the start of the list 
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }

    // Add new  node to the end of the list 
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }   

    public void display(){
        Node temp=head;
        if(temp==null){
            System.out.println("list is empty....");
        }
        System.out.println("Displaying list....");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    // Add new node after the
    // return 0 - if success
    // return 1 - if failed 
    public int add(int index,int data){
        Node first=head;
        if(first==null){
            return 1; // failed
        }
        if(index==0){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            return 0;
        }
        Node second=first.next;
        int itr=1;
        while(itr<=index&&first!=null){
            if(itr==index){
                Node newNode=new Node(data);
                first.next=newNode;
                newNode.next=second;
                return 0;
            }
            first=second;
            if(first!=null) {second=second.next;}
            itr++;
        }
        return 1;
    }

    // Reverse the linked list by swapping the link
    // Time complexity O(n)
    // Space complexity O(1)
    public void reverse(){
        Node curr=head;
        if(curr==null){
            System.out.println("ERROR!! Linked List is empty..");
            return;
        }
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev; // make the last node as head;
    }

    // Reverse the linked list using stack
    // Time complexity O(n)
    // Space complexity O(n)
    public void reverseWithStack(){
        LinkedList stack=new LinkedList();
        Node temp=head;
        if(temp==null){ System.out.println("ERROR!! Linked List is empty..");}
        while(temp!=null){
            stack.addFirst(temp.data);
            temp=temp.next;
        }
        head=stack.getHead();
    }

    public int pop(){
        Node temp=head;
        if(temp==null){
            return -1;
        }
        head=temp.next;
        return temp.data;
    }

    public int deleteLast(){
        Node temp=head;
        if(temp==null){
            return -1;
        }   
        if(temp.next==null){
            head=null;
            return temp.data;
        }
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        return temp.data;
    }
}   