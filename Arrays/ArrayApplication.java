import java.util.*;
public class ArrayApplication{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array...");
        int len=sc.nextInt();
        System.out.println("Input Array...");
        int arr[]=new int[len];

        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Operations..");

        sc.close();
    }
}