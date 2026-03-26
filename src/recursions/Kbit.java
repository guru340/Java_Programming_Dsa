package recursions;

public class Kbit {
    public char findKthBit(int n, int k) {
        String s[]=new String[n+1];
        s[1]="0";
        for (int i=2;i<=n;i++){
            s[i]=s[i-1]+"1"+reverse(invert(s[i-1]));

        }

        return s[n].charAt(k-1);
    }

    private String invert(String s) {
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)==0){
                s1.append('1');
            }else{
                s1.append('0');
            }
        }
        return s1.toString();
    }

    public  String reverse(String s){
        StringBuilder s1=new StringBuilder(s);
        return s1.reverse().toString();
    }

}
