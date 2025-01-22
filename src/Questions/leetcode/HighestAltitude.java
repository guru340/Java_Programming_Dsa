package Questions.leetcode;

import java.util.Arrays;

//1732:Find The Highest Altitude
public class HighestAltitude {
    public static void main(String[] args) {
        int []arr={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int []gain){
        int n= gain.length;
        int highest=0;
        int next[]=new int[n+1];
        next[1]=gain[0];
        int sum=0;
        for(int i=1;i< gain.length;i++){
            next[i+1]=next[i]+gain[i];
        }
        for (int i=0;i< next.length;i++){
            if(highest<next[i]){
                highest=next[i];
            }
        }
        return highest;
    }
}
