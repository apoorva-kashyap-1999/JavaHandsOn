import java.util.*;
public class MaxElementInVector {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,size,element;
        System.out.println("Input size of vector: ");
        size=sc.nextInt();
        Vector<Integer> v= new Vector<>();
        for(i=0;i<size;i++){
           element=sc.nextInt();
           v.add(element);
        }
        System.out.println("Maximum element in vector V is: "+Collections.max(v));
    }
}
