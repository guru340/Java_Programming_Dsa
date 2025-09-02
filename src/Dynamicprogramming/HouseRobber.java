package Dynamicprogramming;

public class HouseRobber {
    public int maxmoneyTopDown(int []Housenetwoth){
        int dp[]=new int[Housenetwoth.length];
        return maxmoneyTopDown(dp,Housenetwoth,0);
    }

    private int maxmoneyTopDown(int []dp,int []Housenetworth,int currentindex){
        if(currentindex>=Housenetworth.length){
            return 0;
        }
        if(dp[currentindex]==0){
            int stealfirsthouse=Housenetworth[currentindex]+maxmoneyTopDown(dp,Housenetworth,currentindex+2);
            int skipfirsthouse=maxmoneyTopDown(dp,Housenetworth,currentindex+1);
            dp[currentindex]=Math.max(stealfirsthouse,skipfirsthouse);

        }
        return dp[currentindex];
    }

//    Bottom UP
public int maxMoneyBottomUp(int[] wealth) {
    int dp[] = new int[wealth.length + 2];
    dp[wealth.length] = 0;
    for (int i = wealth.length - 1; i >= 0; i--) {
        dp[i] = Math.max(wealth[i] + dp[i + 2], dp[i + 1]);
    }
    return dp[0];
}


}
