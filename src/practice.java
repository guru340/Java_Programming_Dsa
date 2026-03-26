


import java.util.*;


class practice {



    static void main() {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=Math.max((i-a)+1,(i-b)+1);
        }

        System.out.println(dp[n]);



    }

}




















