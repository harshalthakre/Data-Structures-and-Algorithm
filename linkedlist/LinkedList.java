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
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void delete()
}   