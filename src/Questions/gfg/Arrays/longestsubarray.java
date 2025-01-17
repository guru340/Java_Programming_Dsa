package Questions.gfg.Arrays;
//longest subarray with sum k
public class longestsubarray {
    public static void main(String[] args) {
        int arr[]={10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr,k));

    }


    public static int longestSubarray(int[] arr, int k) {
//        approach 1
//        Time Complexicity O(n saqure)
        int n = arr.length;
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);

                }
            }
        }
        return maxLength;
    }
}
