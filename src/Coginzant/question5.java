package Coginzant;

import java.util.Arrays;

//Impact Sum with Threshold
public class question5 {
    static void main() {
    int []arr={2, 4, 6, 8, 10};
    int C=20;
        System.out.println(Arrays.toString(threshold(arr,C)));
    }
    public static int[] threshold(int []arr,int c){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int []arr1=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr1[i]=Math.min(sum-arr[i],c);
        }
        return arr1;
    }
}
