package Questions.leetcode.Arrays;
//560:Subarray sum Equals to k
public class Subarraysum {
    public static void main(String[] args) {
        int []arr={1,1,1,1};
        int k=3;
        System.out.println(longestSubarray(arr,k));
    }
    public static int longestSubarray(int[] arr, int k) {
//        approach 1
//        Time Complexicity O(n saqure)
        int n=arr.length;
        int count=0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;

                }
            }
        }
        return count;
    }

}
