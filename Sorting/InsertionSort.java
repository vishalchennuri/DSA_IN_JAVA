package DSA.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4,3,2,6,1,7,5};
        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i =0;i<n; i++){
            int j= i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j-1,j);
                j--;
            }
        }
    }

    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
}
