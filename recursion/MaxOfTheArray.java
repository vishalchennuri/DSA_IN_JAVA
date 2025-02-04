package DSA.recursion;

public class MaxOfTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,77,89,9,5,7,4};
        System.out.println(maxOfTheArray(arr,0,-1));
    }
    public static int maxOfTheArray(int[] arr,int i,int low){
        if(i==arr.length){
            return low;
        }else if(arr[i]>low){
            low = arr[i];
        }

        return maxOfTheArray(arr,++i,low);
    }
}
