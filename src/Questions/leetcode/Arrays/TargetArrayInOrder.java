package Questions.leetcode.Arrays;

import java.util.Arrays;

//1389. Create Target Array in the Given Order
public class TargetArrayInOrder {
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4};
        int arr2[]={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(arr,arr2)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int []target=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int insertIndex = index[i];
            int value = nums[i];


            for (int j = nums.length - 1; j > insertIndex; j--) {
                target[j] = target[j - 1];
            }


            target[insertIndex] = value;
        }

        return target;
    }
}
