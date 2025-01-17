package array;

import java.util.Arrays;

//Question from GfG
public class nextpermutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4 };
        permut(arr);
        System.out.println(("Next Permutation" + Arrays.toString(arr)));
    }


    static void permut(int[] arr) {
        int n = arr.length;
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }

            swap(arr, i, j);

        }
        reversear(arr, i + 1, n - 1);
    }
    static void swap ( int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reversear(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }




    }
}






