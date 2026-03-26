package Dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintingLIS {

    static void main() {
        int []arr={1,9,7,5,2,9,11,7,6,2,3};
        getLIS(arr);
    }

    public static void getLIS(int arr[]) {
       int n=arr.length;

        int[] lis = new int[n];
        int []ins=new int[n];
        int size = 0;

        for (int i=0;i<n;i++){

            int idx = Arrays.binarySearch(lis, 0, size, arr[i]);


            if (idx < 0) {
                idx = -(idx + 1);

            }


            lis[idx] = arr[i];


            if (idx == size) {
                size++;
            }
            ins[i]=idx+1;
        }


       for(int i=0;i<n;i++){
           System.out.print(" "+ins[i]+" ");
       }
    }
}


