package array;

public class rotatearray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        rotateArr(arr,2);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void rotateArr(int arr[], int d) {
        int n = arr.length;

        d=d%n;

        // Step 1: Reverse the entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse the first d elements


        // Step 3: Reverse the remaining n-d elements
        reverse(arr, d, n - 1);

        reverse(arr, 0, d - 1);

    }

     static void reverse(int[] arr, int start, int end) {
         while (start <end) {
             // Swap arr[start] and arr[end]
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
    }
}
