package String;

public class lengthoflastword {
    public static void main(String[] args) {
        String s="101";
        System.out.println(isBinary(s));
    }


    static boolean isBinary(String s) {
        if(s.charAt(0)=='0'||s.charAt(0)=='1'){
            return true;
        }
        return false;

    }
}
