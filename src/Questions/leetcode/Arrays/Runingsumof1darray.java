package Questions.leetcode.Arrays;

import java.util.Arrays;

//1480:Running Sum of 1d Array
public class Runingsumof1darray {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    public static int[] runningSum(int[] nums) {
        int []sum=new int[nums.length];
        sum[0]=nums[0];
        for(int i=1;i< nums.length;i++){
            sum[i]=sum[i-1]+nums[i];
        }
        return sum;
    }
}
