package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {4,3,2,6,1,7,5};
        mergeSort(array,0,array.length-1);

        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid = low + (high-low)/2;
             mergeSort(arr,low,mid);
             mergeSort(arr,mid+1,high);
             merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low, int mid , int high){
        int n1 = mid-low+1;
        int n2 = high-mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for(int i=0;i<n1;i++){
            leftArr[i] = arr[low+i];
        }

        for(int i=0;i<n2;i++){
            rightArr[i] = arr[mid+1+i];
        }

        int i=0,j=0,k=low;
        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
