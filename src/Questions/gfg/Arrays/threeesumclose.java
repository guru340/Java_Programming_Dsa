package Questions.gfg.Arrays;

public class threeesumclose {
    public static void main(String[] args) {
        int []arr={-1,2,1,-4};
        int target=1;
        System.out.print(threeSumClosest(arr,target));
    }

    static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int closestSum = Integer.MAX_VALUE;  // Initialize with a large value
        // Loop through all combinations of three numbers
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int currentSum = nums[i] + nums[j] + nums[k];

                    // Check if the current sum is closer to the target
                    if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                        closestSum = currentSum;
                    }
                }
            }
        }

        return closestSum;  // Return the closest sum found
    }


}
