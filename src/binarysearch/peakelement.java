package binarysearch;

public class peakelement {


//    this solution give a complexicity of O(N).
    public static int search(int []nums){
        for(int i=0;i<nums.length;i++){
            if((i==0||nums[i-1]<nums[i])&&(i== nums.length-1||nums[i+1]<nums[i])){
                return i;
            }
        }
//        Now For the better solution we have to switch to O(logn)
        return -1;
    }
}
