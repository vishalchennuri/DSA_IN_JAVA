package DSA.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class PGreaterElement_BruteForce {
    public static void main(String[] args) {
        int[] arr = {12,10,20,22,15,14,18,32,20,22,19};
        System.out.println(Arrays.toString(pGreaterElement(arr)));
    }
    public static int[] pGreaterElement(int[] arr){
        int n = arr.length;
        int[] result = new int[n];

        for(int i=0; i<n;i++){
            for (int j = i; j>=0; j--) {
                if(arr[j]>arr[i]){
                    result[i] = arr[j];
                    break;
                }else{
                    result[i] = -1;
                }
            }
        }


        return result;
    }
}
