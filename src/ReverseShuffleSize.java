import java.util.*;
public class ReverseShuffleSize {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;int ele;
        List<Integer> li=new ArrayList<>();
        System.out.println("Enter size of n: ");
        n=sc.nextInt();
        System.out.println("Enter elements of list: ");
        for(int i=0;i<n;i++){
            ele=sc.nextInt();
            li.add(ele);
        }
        System.out.println("Elements of list: ");
        for(int i=0;i<n;i++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println(" ");



        //After reverse
        Collections.reverse(li);
        System.out.println("Elements of reversed list: ");
        for(int i=0;i<n;i++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println(" ");

        //Shuffle
        Collections.shuffle(li);
        System.out.println("Elements of shuffled list: ");
        for(int i=0;i<n;i++){
            System.out.print(li.get(i)+" ");
        }
        System.out.println(" ");

        System.out.println("Size of list: "+ li.size());

    }
}
