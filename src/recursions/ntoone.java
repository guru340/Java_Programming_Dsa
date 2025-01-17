package recursions;

public class ntoone{
    public static void main(String []args){
        recurrev(5);  
        
    }

    static void recur(int n){
        
        
        if(n==5){
            System.out.println(5);
            return;
            
        }
        System.out.println(n);
         recur(n+1);
    }

    static void recurrev(int n){
        if(n==0){
            return;
        }
        recurrev(n-1);
        System.out.println(n);
    }
}