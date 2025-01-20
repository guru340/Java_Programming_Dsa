package Questions.gfg.Arrays;

import java.util.Arrays;

//Small Positive Missing
public class SmallPositiveMissing {
    public static void main(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        int n= arr.length;
        System.out.println(findMissing(arr,n));
    }

    static int segregate(int arr[], int size) {
        int j = 0, i;
        for (i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    } // function to find the smallest positive missing number

    static int findMissingPositive(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];
        }
        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1;
        return size + 1;
    }

    static int findMissing(int arr[], int size) {
        int shift = segregate(arr, size);
        int returnSize = size - shift;
        int[] arr2 = new int[returnSize];
        int j = 0;
        for (int i = shift; i < size; i++) {
            arr2[j] = arr[i];
            j++;
        }
        return findMissingPositive(arr2, returnSize);
    }
}
