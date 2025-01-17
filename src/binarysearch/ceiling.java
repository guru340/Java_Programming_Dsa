package binarysearch;

public class ceiling {
    public static void main(String[] args) {
        int []arr={2,4,8,9,10,12,15};
        int target=9;
        int ans=binarys(arr, target);
        System.out.println(ans);

    }
        // return the index
        // return -1 and if it does not exist
        static int binarys(int[] arr,int target){
            int start=0;
            int end=arr.length-1;

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
                return start;}
        
    }
    


