package Questions.gfg.sorting;

public class countinversions {
    public static void main(String[] args) {
        int []arr={2,4,1,3,5};
        System.out.println(inversionCount(arr));
    }

    static int inversionCount(int arr[]) {
        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }

    public static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int count = 0;
        if (left < right) {
            int mid = (left + right) / 2;


            count += mergeSortAndCount(arr, temp, left, mid);
            count += mergeSortAndCount(arr, temp, mid + 1, right);


            count += mergeAndCount(arr, temp, left, mid, right);
        }
        return count;
    }


    private static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int count = 0;


        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {

                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }


        while (i <= mid) {
            temp[k++] = arr[i++];
        }


        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }
}
