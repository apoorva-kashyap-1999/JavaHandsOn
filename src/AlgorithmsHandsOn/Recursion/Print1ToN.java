package AlgorithmsHandsOn.Recursion;
import java.util.*;

public class Print1ToN {

    static void printNumbers1ToN(int n){
      if(n>0) {
          printNumbers1ToN(n - 1);
          System.out.print(n + " ");
      }
    }

    static void printNumbersNTo1(int n){
        if(n>0){
            System.out.print(n+" ");
            printNumbersNTo1(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of N: ");
        int n= sc.nextInt();
        printNumbers1ToN(n);
        System.out.println(" ");
        printNumbersNTo1(n);
    }
}
