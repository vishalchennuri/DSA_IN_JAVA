package DSA.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {30,50,20,15,25};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }

    public static int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        result[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
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
