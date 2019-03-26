import java.util.*;
public class StackApplication{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Oerations list..\n1.Push to Stack\n2.Pop\n3.Display\n4.Get Stack top\n5.Get Minimum\nE.Exit");
        Stack stack=new Stack();
        while(true){
            System.out.println("select operation..");
            int operand=sc.nextInt();

            switch(operand){
                case 1: System.out.println("Enter the element ...");
                        stack.push(sc.nextInt());
                        break;
                case 2: System.out.println("Pop element.."+stack.pop());
                        break;
                case 3: System.out.println("Displaying Stack...");
                        stack.display();
                        break;
                case 4: System.out.println("Stack top: "+stack.top());
                        break;
                case 5: System.out.println("Min in Stack: "+stack.getMin());
                        break;
                case 'E': sc.close(); return;
            }
        }
        
    }
}