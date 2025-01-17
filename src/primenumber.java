public class primenumber  {
    public static void main(String[] args)
    {
        System.out.println(isPrime(25));

    }

    static int isPrime(int N){
        int a=0;
        int i=0;
        while (i>2){
            if(N%i==0){
                a=1;
                break;
            }
        }
        if(N==1||a==1){
            return 0;
        }
        else {
            return 1;
        }
    }

//    Another method for prime number in less time complexity
static int isPrime2(int N){
    if (N <= 1)
        return 0;

    // Check divisibility from 2 to the square root of n
    for (int i = 2; i <= Math.sqrt(N); i++)
        if (N % i == 0)
            return 0;

    // If no divisors were found, n is prime
    return 1;
}



}