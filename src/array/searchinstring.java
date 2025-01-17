package array;

public class searchinstring {
    public static void main(String[] args) {
        String name="Vrinda";
        char target='V';
        System.out.println(searchin(name, target));

    }
    static Boolean searchin(String arr,char target){
        if (arr.length()==0) {
            return false;
        }
        for (int i = 0; i < arr.length(); i++) {
            if (target==arr.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
