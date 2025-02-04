package DSA.recursion;

public class FirstOccuranceInAnArray {
    public static void main(String[] args) {
        int[] array ={0,1,2,3,4,5,6,7,8,9,10};
        int n = firstOccurance(array,10,0);
        System.out.println(n);
    }
    public static int firstOccurance(int[] arr,int target,int i){
        if (i == arr.length){
            return -1;
        }else{
            if(arr[i]==target){
                return i;
            }
            return firstOccurance(arr,target,++i);
        }
    }
}
