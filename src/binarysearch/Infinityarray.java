package binarysearch;

public class Infinityarray {
    public static void main(String[] args) {
    int arr[]={3,5,9,4,5,8,10,15,16,18,19,20};
    int target=15;
        System.out.println(ans(arr,target));
    }
    static int ans(int []arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;
//            double the box value
 //            end=previoue end +starbox*2
            end= end+  (end-start+1)*2;
            
            if (end >= arr.length) {
                end = arr.length - 1;
            }

            start = temp;

            // If start reaches or exceeds end, exit the loop
            if (start >= arr.length || start > end) {
                break;
            }
        }
        return binarys(arr,target,start,end);
    }

    static int binarys(int[] arr,int target,int start,int end){


        while (start<=end) {
            // find the middle element
            int mid=start+(end-start)/2;
            if (target<arr[mid]) {
                end=mid-1;
            }

            else if(target>arr[mid]){
                start=mid+1;
            }
            else
                return mid;
        }
        return -1;
    }
}
