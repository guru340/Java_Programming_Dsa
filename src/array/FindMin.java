package array;

public class FindMin {
    public static void main(String[] args) {
        int [] arr={1,15,21,16};
        System.out.println(min(arr));
    }
    // assume length of array is not equal to zero
    static int min(int []arr){
        int ans=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[0]<ans) {
                ans=arr[i];
            }
        }
        return ans;
    }
}
