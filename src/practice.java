import java.util.*;


//    public static void main(String[] args) {
//        int[] arr = {5, 1, 47, 8, 6};
////        insertion(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void insertion(int[] arr) {
//        for(int i=0;i<=arr.length-2;i++){
//            for(int j=i+1;j>0;j--){
//                if(arr[j]>arr[j-1]){
//                    swap(arr,j,j-1);
//
//                }else {
//                    break;
//                }
//            }
//        }
//
//    }
//
//    static void swap(int []arr,int start,int end){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//    }


    public class practice {
        public static int countTriplets(int[] arr, int target) {
            int n = arr.length;
            int count = 0;

            // Sort the array first (if not already sorted)
            Arrays.sort(arr);

            // Traverse each element as the first element of the triplet
            for (int i = 0; i < n - 2; i++) {
                int left = i + 1;
                int right = n - 1;

                // Use two-pointer technique to find the other two elements
                while (left < right) {
                    int sum = arr[i] + arr[left] + arr[right];

                    // If we found a valid triplet
                    if (sum == target) {
                        count++;
                        left++;
                        right--;
                    }
                    // If the sum is less than the target, move the left pointer
                    else if (sum < target) {
                        left++;
                    }
                    // If the sum is greater than the target, move the right pointer
                    else {
                        right--;
                    }
                }
            }
            return count;
        }

        public static void main(String[] args) {
            int[] arr = {-3, -1, -1, 0, 1, 2};
            int target = -2;

            System.out.println("Number of triplets: " + countTriplets(arr, target));
        }
    }




