package DSA.Revision;

public class LargestInArray {
    public static int largest(int[] arr){
        int index = -1 ;
        if(arr.length>=1) index = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[index] <arr[i]){
                index =  i;
            }
        }
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,76,8,89};
        System.out.println(largest(arr));
    }
}
