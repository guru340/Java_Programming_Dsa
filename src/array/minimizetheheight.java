package array;

import java.util.Arrays;

public class minimizetheheight {
    public static void main(String[] args) {
        int arr[]={1,5,8,10};

        System.out.println(getMinDiff(arr,2  ));
    }

   static int getMinDiff(int[] arr, int k) {

        int n=arr.length;
        Arrays.sort(arr);

        int ans=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;

        int max=0; int min=0;
        for(int i=0;i<n-1;i++){
            min=Math.min(smallest,arr[i+1]-k);
            max=Math.max(largest,arr[i]+k);

            if(min>0){
                ans=Math.min(ans,max-min);

            }

        }
        return ans;
    }
}

