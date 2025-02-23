package DSA.Stacks;

import java.util.Arrays;

public class spanOfStock_bruteForce {
    public static void main(String[] args) {
    int[] arr = {12,14,15,7,15,17,5,12,10,13,20};
        System.out.println(Arrays.toString(spanOfStock(arr)));
    }

    public static int[] spanOfStock(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        for(int i=n-1;i>=0;i--){
            int count =0;
            for (int j = i; j>=0 ; j--) {
                if(arr[j]<=arr[i]){
                    count+=1;
                }else {
                    break;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
