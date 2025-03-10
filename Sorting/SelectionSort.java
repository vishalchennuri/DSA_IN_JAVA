package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {4,3,2,6,1,7,5};
        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i <n ; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[min_index]){
                    min_index = j;
                }
            }
            swap(arr,min_index,i);
        }
    }
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] = temp;
    }
}
