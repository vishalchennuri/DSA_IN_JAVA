//NAIVE APPROACH

package DSA.Stacks;

public class LargestRecAreaUnderHistogram {
    public static void main(String[] args) {
        int[] arr = {11,3,4,4,1,5,7};
        System.out.println(solution(arr));
    }
    public static int solution(int[] arr){
        int finalResult=0 ;


        for(int i=0;i<arr.length;i++){
            int result = arr[i];
            int right = i+1;
            int left = i-1;
            while(left>=0 && arr[left]>=arr[i]){
                    result+=arr[i];
                    left--;
            }
            while(right<arr.length && arr[right]>=arr[i]){
                    result+=arr[i];
                    right++;
            }
                finalResult = Math.max(result,finalResult);
            }


        return finalResult;
        }
    }
