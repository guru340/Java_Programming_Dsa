package recursions;

public class palidrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1534236469));    
        
    }
    
   

    static  boolean isPalindrome(int x) {
        int n=x;
        int sum=0;
        
        while(x!=0){
            
        int rem=x%10;
        x=x/10;
        
        sum=sum*10+rem;
        }
        
        System.out.println(sum);
        System.out.println(n);
        if(n!=sum){
            return false;
        }
        
        return true;
    }


    
}
