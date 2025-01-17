package Questions.gfg.Arrays;
//Maximum Product Subarray
public class MaximumProductSubarrays {
    public static void main(String[] args) {
        int []arr={-6};
        System.out.println(maxProduct(arr));
    }
    static int maxProduct(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int maxProduct = arr[0];
        int minProduct = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }


            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);


            result = Math.max(result, maxProduct);
        }

        return result;


    }
}
