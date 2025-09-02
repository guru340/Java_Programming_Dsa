package coinchangeproblem;

import java.util.Arrays;

public class coin {
    static void coinchangeproble(int [] coins,int N){
        Arrays.sort(coins);
        int index=coins.length-1;
        while(true){
            int coinvalue=coins[index];
            index--;
            int maxAmount=(N/coinvalue)*coinvalue;
            if (maxAmount>0){
                System.out.println("Coin Value"+coinvalue+"takencoin"+(N/coinvalue));
                N=N-maxAmount;


            }
            if (N==0){
                break;
            }
        }
    }
}
