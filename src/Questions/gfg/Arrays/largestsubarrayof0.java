package Questions.gfg.Arrays;
//largest subarray of o's and 1's
public class largestsubarrayof0 {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,0,0};
        System.out.println(maxlen(arr));
    }

    static int maxlen(int[]arr){
        int n = arr.length;
        int sum = 0;
        int count=0;
        int ncount=0;
        for(int i=0;i<n;i++){
           if(arr[i]==0){
               count++;
           }
           else {
               ncount++;
           }



        }

        return sum;
    }
}
