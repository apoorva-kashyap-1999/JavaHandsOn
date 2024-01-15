package AlgorithmsHandsOn.Recursion;
import java.util.*;
 class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
 class LinkedList {
    Node head;
     void push(int data){
         Node new_node=new Node(data);
        //if first
         if(head==null){
             head=new_node;
             return;
         }

         //push at last place
         Node last=head;
         while(last.next!=null){
             last=last.next;
         }
         last.next=new_node;
    }

    void delete(int key){
         Node temp=head, prev=null;
         if(temp!=null && temp.data ==key){
             head=temp.next;
         }
         if(temp!=null && temp.data!=key){
             prev= temp;
             temp =temp.next;
         }
         prev.next=temp.next;
    }

    void print(){
        System.out.println("LinkedList");
        Node node=head;
        while(node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println(" ");

    }


}

public class LinkedListInsertion{
    public static void main(String[] args){
        LinkedList ll= new LinkedList();
        ll.push(3);
        ll.push(5);
        ll.push(4);
        ll.push(6);
        ll.print();
        ll.delete(4);
        ll.print();

    }
}
