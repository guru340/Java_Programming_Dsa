package Dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hr=new HashMap<>();
        System.out.println(fibo(6,hr));
    }

//    Fibonacci Memoization
    public static int fibo(int n, HashMap<Integer,Integer> memo){
        if (n==1){
            return 0;

        }
        if (n==2){
            return 1;
        }
        if(!memo.containsKey(n)){
            memo.put(n,(fibo(n-1,memo)+(fibo(n-2,memo))));

        }
        return memo.get(n);
    }

//    fibonacci series with tabulation
    public static int fibotab(int n){
        ArrayList<Integer> tb=new ArrayList<>();
        tb.add(0);
        tb.add(1);
        for (int i=2;i<=n-1;i++){
            int n1=tb.get(i-1);
            int n2=tb.get(i-2);
            tb.add(n1+n2);

        }
        return tb.get(n-1);

    }
}
