package coinchangeproblem;

import java.util.Arrays;

public class Mian {
    public static void main(String[] args) {
        int[] coins={1,2,5,10,20,50,100,1000};
        int amount=2035;
        System.out.println("Count Availble: "+ Arrays.toString(coins));
        System.out.println("Target Amount: "+amount);
        coin.coinchangeproble(coins,amount);
    }
}
