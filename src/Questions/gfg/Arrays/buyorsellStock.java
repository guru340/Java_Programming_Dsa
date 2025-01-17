package Questions.gfg.Arrays;

//Buy or Sell Stock Ques
public class buyorsellStock {
    public static void main(String[] args) {
        int []arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

//    public static int maximumProfit(int prices[]) {
//
//        int profit=0;
//        for(int i=1;i<prices.length;i++){
//            if(prices[i]>prices[i-1]){
//                profit+=prices[i]-prices[i-1];
//            }
//        }
//        return profit;
//    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
