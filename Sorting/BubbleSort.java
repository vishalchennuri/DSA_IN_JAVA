package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {4,3,2,6,1,7,5};
        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i =1;i<n;i++){
            for (int j = 0; j <n-i ; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j+1,j);
                }
            }
        }
    }

    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
}
