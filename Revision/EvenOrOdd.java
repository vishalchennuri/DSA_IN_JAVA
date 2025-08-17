package DSA.Revision;

import java.util.Scanner;

public class EvenOrOdd {
    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(isEven(n));
    }
}
