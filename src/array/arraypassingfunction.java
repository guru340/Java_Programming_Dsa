package array;

public class arraypassingfunction {
    public static void main(String[] args) {
        int [] nums={3,4,5,6};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        change(nums);
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
   }
   static void change(int[] arr){
    arr[0]=99;
   }
}
