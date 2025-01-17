package sorting;

import java.util.Arrays;

public class bub {

    public static void main(String[] args) {
        int []arr={1,3,4,5,2};
        bubbleaort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleaort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            // for each step,max item will comae at last  respective index
            for (int j = 1; j < arr.length-i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]) {
                    // swap
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}