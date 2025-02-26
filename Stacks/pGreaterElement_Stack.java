package DSA.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class pGreaterElement_Stack {
    public static void main(String[] args) {
        int[] arr = {12,10,20,22,15,14,18,32,20,22,19};
        System.out.println(Arrays.toString(pGreaterElement(arr)));
    }
    public static int[] pGreaterElement(int[] arr){
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int[] result = new int[n];
        s.push(arr[0]);
        result[0] = -1;

        for (int i = 1; i < n; i++) {
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = s.peek();
            }
            s.push(arr[i]);
        }

        return result;
    }
}
