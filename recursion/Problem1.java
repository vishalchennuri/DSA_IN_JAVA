package DSA.recursion;

public class Problem1 {
    public static void main(String[] args) {
        printSequence(1);
    }
    public static void printSequence(int n){
        if(n==0){
            return;
        }

        System.out.print(n+" ");
        printSequence(n-1);
        System.out.print(n+" ");
        printSequence(n-1);
        System.out.print(n+" ");
    }
}
