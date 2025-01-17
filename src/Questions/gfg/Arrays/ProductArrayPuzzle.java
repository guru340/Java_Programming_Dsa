package Questions.gfg.Arrays;

import java.util.Arrays;

//Product Array Puzzle
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int []arr={10,3,5,6,2};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int arr[]) {

        int n = arr.length;
        int[] res = new int[n];


        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * arr[i - 1];
        }


        int rProduct = 1;
        for (int i = n - 2; i >= 0; i--) {
            rProduct *= arr[i + 1];
            res[i] *= rProduct;
        }

        return res;
    }
}
