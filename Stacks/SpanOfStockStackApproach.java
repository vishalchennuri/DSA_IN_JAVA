package DSA.Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;

public class SpanOfStockStackApproach {
    public static void main(String[] args) {
        int[] arr = {12,14,15,7,15,17,5,12,10,13,20};
        System.out.println(Arrays.toString(spanOfStock(arr)));
    }
    public static int[] spanOfStock(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(0);
        result[0] = 1;
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                s.pop();
            }

            if(s.isEmpty()){
                result[i] = i+1;
            }else {
                result[i] = i - s.peek();
            }
            s.push(i);
        }



        return result;
    }
}
