import java.util.*;
public class FindAndPrintElementsOfLinkedList {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println("Input size of linkedlist");
        int size = sc.nextInt();
        int element;
        System.out.println("Input key to find in linkedlist");
        int key = sc.nextInt();
        System.out.println("Input elements of linkedlist: ");
        for(int i =0;i<size;i++){
            element=sc.nextInt();
            ll.add(element);
        }
        System.out.println("Key found at index :"+Collections.binarySearch(ll,key));
        System.out.println("All elements in linked list are : ");
        for(int j=0;j<size;j++){
            System.out.println(ll.get(j));
        }
        ll.clear();
        int sizeOfLL= ll.size();
        System.out.println("Size of linked list after clear() is: "+sizeOfLL);
    }
}
