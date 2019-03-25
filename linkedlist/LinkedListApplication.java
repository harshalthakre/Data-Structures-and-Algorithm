import java.util.*;
public class LinkedListApplication{
    public static void main(String args[]){
        LinkedList list=new LinkedList();
        Scanner sc=new Scanner(System.in);
        
        System.out.println ("Perform following operations on Linked List...\n1.AddFirst\n2.AddLast\n3.AddInBetween\n4.Display\n5.Exit");
        
        while(true){
            System.out.println("select operation..");
            int operand=sc.nextInt();

            try{
                switch(operand){
                case 1: System.out.println("Insert element to addFirst..");
                        list.addFirst(sc.nextInt());
                        break;
                case 2: System.out.println("Insert element to addLast...");
                        list.addLast(sc.nextInt());
                        break;
                case 3: System.out.println("Insert element to add in between");
                        int element=sc.nextInt();
                        System.out.println("Insert the index of the element");
                        int index=sc.nextInt();
                        list.add(index,element);
                        break;
                case 4: list.display();
                        break;
                case 5: System.out.println("Closing the Linked List Application...");
                        return;
                }
            }catch(Exception e){
                System.out.println("Exception..."+e);
                System.out.println("....\n Please choose the appropriate option ");
            }
        }
}
}