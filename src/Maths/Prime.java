package Maths;

public class Prime {
    public static void main(String[] args) {
    int n=20;
    for (int i=0;i<=n;i++){
        System.out.println(i +" " +isPrime(n));
    }
    }

    static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        int c=2;
        while(c*c<=num){
            if (num%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
