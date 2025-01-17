package array;

public class evendigitleetcode {
    public static void main(String[] args) {
        int [] nums={12,5647,123,487,56423,-1254};
        System.out.println(Findnumber(nums));
        
    }
    static int Findnumber(int[] nums){
        int count=0;
        for(int num:nums){
            if (even(num)) {
                count++;
            }
        }



        return count;
        // 
        
    }
        // function to check wether a number contains evendigit
        static Boolean even(int num){
        int numberofdigit=digits(num);
        if (numberofdigit%2==0) {
            return true;
        }
        
            return false;
    }
    // count no of digit 
    static int digits(int num){
        // convert negative number into positive
        if (num<0) {
            num=num*-1;
            
        }
        int count=0;
        while (num>0) {
            count++;
            num=num/10;    
        }
        return count;
    }
}
