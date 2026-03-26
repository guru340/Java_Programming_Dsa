public class fib {

    static int[] dp;

    public static int fiba(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = fiba(n - 1) + fiba(n - 2);
        return dp[n];
    }

    // Print Fibonacci series
    public static void printSeries(int n) {
        dp = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        for (int i = 0; i <= n; i++) {
            System.out.print(fiba(i) + " ");
        }
    }

    public static void main(String[] args) {
        int n = 50;
        printSeries(n);
    }


//    Through Tabulation
//int[] dp = new int[n + 1];
//    dp[0] = 0;
//    dp[1] = 1;
//
//for (int i = 2; i <= n; i++) {
//        dp[i] = dp[i - 1] + dp[i - 2];
//    }

}
