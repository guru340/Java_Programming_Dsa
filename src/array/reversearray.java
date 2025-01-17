package array;

import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int []arr={1,2,5,3,6};
        reversearray(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

   static int [] reverseArray(int []arr) {
        int start=0;
        int end=arr.length-1;
        int []arr2=new int[arr.length];
        for(int i=start;i<arr.length;i++){
            arr2[start]=arr[end];
            end--;
            start++;
        }
            return arr2;

    }

    static void reversearray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;


        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
