import java.util.ArrayList;
import java.util.List;

public class leetcodepractice {
   static int count=0;
    public static int countArrangement(int n) {

        int arr[]=new int[n+1];
        solve(n,arr,1);
        return count;
    }

    public static void solve(int n,int []arr,int val){
        if(val>n){
            count++;
            return;
        }
        for(int i=1;i<arr.length;i++){
            if((val%i==0 || i%val==0) && arr[i]==0 ){
                arr[i]=1;
                solve(n,arr,val+1);
                arr[i]=0;
            }
        }
    }

    static void main() {
        System.out.println(countArrangement(2));
    }
}
