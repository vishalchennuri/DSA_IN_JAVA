package DSA.Revision;
import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println(palindromeCheck(str));
    }
    public static boolean palindromeCheck(String s ){
        int n  = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
