package Dynamicprogramming;

public class numberFactor {
//    TOP DOWN APPROCH
     private int WaysTogetUp(int []dp,int n){
         if (n==0||n==1||n==2){
             return 1;
         }
         if (n==3){
             return 2;
         }
         if (dp[n]==0){
             int sp1=WaysTogetUp(dp,n-1);
             int sp2=WaysTogetUp(dp,n-2);
             int sp3=WaysTogetUp(dp,n-3);
             dp[n]=sp1+sp2+sp3;
         }
         return dp[n];
    }

    public int Waystogetup(int n){
         int dp[]=new int [n+1];
         return WaysTogetUp(dp,n);
    }

//    Bottom Approch
}
