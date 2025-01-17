package array;
// Pair Sum With Target Element in a Sorted Array
public class pairsumwithtarget {
    public static void main(String[] args) {
        int []arr={-1,1,5,5,7};
        int target =6;
        System.out.println(countPairs(arr, target));
    }

   static int countPairs(int arr[], int target) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;

                }
            }
        }
        return count;
    }
}
