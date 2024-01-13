import java.util.*;
public class CompareElementsInCollection {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input size: ");
        int n = sc.nextInt();
        String ele;
        List<String> li = new ArrayList<>();
        System.out.println("Input elements: ");
        for(int i=0;i<n;i++){
            ele=sc.next();
            li.add(ele);
        }
        String minimum= Collections.min(li);
        String maximum= Collections.max(li);
        if(minimum.equals(maximum)){
            System.out.println("Equal elements");
        }
        else   System.out.println("Unequal elements");
    }
}
