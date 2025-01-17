package recursions;

public class countzeros  {
    public static void main(String[] args) {
        System.out.println(count(30204, 0));
    }

    static int count(int n,int c){
        return helper(n,c);
    }

    private static int helper(int n,int c){
        if(n==0){
            return c;
        
        }

        int rem=n%10;
        if(rem==0){
            return helper(n/10, c+1);

        }
        return helper(n/10, c);
    }
}
