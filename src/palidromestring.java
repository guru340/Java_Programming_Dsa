public class palidromestring {
    public static void main(String[] args) {
        String str="abccba";
        System.out.println(ispalidrome(str));
    }

    static boolean ispalidrome(String str){
        if (str==null|| str.length()==0) {
            return true;
        }
        str=str.toLowerCase();
        for(int i=0;i<=str.length()-1;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if (start!=end) {
                return false;
            }
        }

        return true;
    }
}
