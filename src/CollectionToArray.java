import java.util.*;
public class CollectionToArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of list: ");
        int elements;
        List<Integer> list= new ArrayList<>();
        int n = sc.nextInt();
        System.out.println("Enter elements of list: ");
        for(int i =0;i<n;i++){
            elements=sc.nextInt();
            list.add(elements);
        }
        System.out.println("Elements of list: ");
        for(int j:list){
            System.out.print(j+" ");
        }
        //Convert to normal array
        Integer[] arr = list.toArray(new Integer[n]);
        System.out.println("\nArray : ");
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
