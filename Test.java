package DSA;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        int[] arr = {5,3,2,2,3,5};

        countFrequency(arr);
    }

    public static void countFrequency(int[] arr){
        int n = arr.length;;

        for (int i =0;i<n;i++){
            int count = 0;
            boolean flag  = false;
            for (int j = i+1; j <n ; j++) {
                if(arr[i]==arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag) continue;
            for (int j = i; j >=0 ; j--) {
                if (arr[i] == arr[j]){
                    count+=1;
                }
            }
            System.out.println(arr[i]+"-" +count);
        }

    }

}

