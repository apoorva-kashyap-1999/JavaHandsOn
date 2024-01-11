import java.awt.*;
import java.util.*;
public class BinarySearchVector {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Vector<Integer> v= new Vector<>();
        int searchedElement;
        System.out.println("Input size of vector");
        int size= sc.nextInt();
        System.out.println("Input element to find in vector");
        searchedElement = sc.nextInt();
        int i, element;
        System.out.println("Input vector elements :");
        for(i=0;i<size;i++){
            element=sc.nextInt();
            v.add(element);
        }

        Collections.sort(v);
        int returnValueOfIndex = Collections.binarySearch(v,searchedElement);
        System.out.println(returnValueOfIndex);
        if(returnValueOfIndex >= 0 && returnValueOfIndex< size){
            System.out.println("Input element "+searchedElement+ " found in vector");
        }
        else{
            System.out.println("Input element "+searchedElement+" not found in vector");
        }
    }
}
