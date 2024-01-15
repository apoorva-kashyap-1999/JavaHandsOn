package AlgorithmsHandsOn.Recursion;
import java.util.*;
public class PalindromeString {
         static boolean isPalindrome(String s){
            String sL = s.toLowerCase();
            int j = sL.length()-1;
            System.out.println(j);
            int i = 0;
            while (i<j) {
                if (sL.charAt(i) != sL.charAt(j)) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputS = sc.next();
        boolean result = isPalindrome(inputS);
        if (result) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not Palindrom");
        }
    }
}
