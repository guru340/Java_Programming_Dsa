package array;

public class agnostics {
    public static void main(String[] args) {
       int[] arr={23,254,58,45,610,142,};
       int target=610;
       int ans=orderagmostics(arr, target);
       System.out.println(ans);
    }

    static int orderagmostics(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        // find the array is sorted or not
        boolean isAsc=arr[start]<arr[end] ;
       
        while (start<=end) {
            // find the middle element
            int mid=start+(end-start)/2;
             if(arr[mid]==target){
            return mid;
        }

            if(isAsc){
                if (target<arr[mid]) {
                    end=mid-1;
                }
    
                    else {
                        start=mid+1;
                    }
            }
                else
                if (target<arr[mid]) {
                    end=mid-1;
                }
    
                    else  {
                        start=mid+1;
                    }
            }
            return -1;
    }
}
