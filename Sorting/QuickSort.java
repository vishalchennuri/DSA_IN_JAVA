package DSA.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {4,3,2,6,1,7,5};
        quickSort(array,0,array.length-1);

        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] arr ,int low ,int high){
        if(low<high){
            int pi = partition(arr,low,high);

            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i= low;
        int j = high;
        while(i<j){
            while(arr[i]>pivot && i<=high){
                i++;
            }
            while(arr[j]<=pivot && j>=low ){
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
        }
        swap(arr,low,j);
        return j;
    }
    public static void swap(int[] arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
