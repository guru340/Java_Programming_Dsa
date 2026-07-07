import java.util.*;

public class Main {
    public static void main(String[] args) {

}
    public String processStr(String s) {
        StringBuilder s1=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                s1.append(s.charAt(i));
            } else if (s.charAt(i)=='*') {
                s1.deleteCharAt(s.length());
            } else if (s.charAt(i)=='%') {
                s1.reverse();
            }
            s1.append(s);
        }
        return s1.toString();
    }

}