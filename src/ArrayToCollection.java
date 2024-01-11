import java.util.*;
public class ArrayToCollection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter size of string array: ");
        size=sc.nextInt();
        String[] arr=new String[size];
        System.out.println("Enter elements of string array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.next();
        }
        System.out.println("Entered string array: ");
        for(String i:arr){
            System.out.print(i+" ");
        }
        //Convert array to collection
        List<String> arrayAsList = Arrays.asList(arr);
        System.out.println(" ");
        System.out.println("Converted list :"+ arrayAsList);
    }
}
