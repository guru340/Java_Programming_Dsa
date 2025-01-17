package recursions;

public class fibo {
    
        public static void main(final String[] args) {
            System.out.println(fib(7));
        }   
        
        static int  fib(final int n){
            if(n<2){
                return  n;
            }
             return  fib(n-1)+fib(n-2);
        }
    }
    

