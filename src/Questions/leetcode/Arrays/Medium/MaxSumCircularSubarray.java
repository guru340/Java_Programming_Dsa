package Questions.leetcode.Arrays.Medium;
//918. Maximum Sum Circular Subarray
public class MaxSumCircularSubarray {
    public static void main(String[] args) {
        int []arr={1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(arr));
    }

    public static int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxSum = nums[0];
        int currentMax = 0;
        int minSum = nums[0];
        int currentMin = 0;
        for (int num : nums) {
            currentMax = Math.max(currentMax + num, num);
            maxSum = Math.max(maxSum, currentMax);
            currentMin = Math.min(currentMin + num, num);
            minSum = Math.min(minSum, currentMin); total += num;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }

}
