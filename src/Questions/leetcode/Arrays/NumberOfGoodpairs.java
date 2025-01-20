package Questions.leetcode.Arrays;
//1512:Number Of Good Pairs
public class NumberOfGoodpairs {
    public static void main(String[] args) {
    int []arr={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
