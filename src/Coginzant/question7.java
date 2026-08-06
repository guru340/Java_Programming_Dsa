package Coginzant;
//Minimum Deletions to Make All Elements Identical
public class question7 {
    static void main() {
    String str[]={"i" ,"b","b","i","b","a","i","a" ,"a","i"};
        System.out.println(Identical(str));

    }

    public static int Identical(String []str){
        int maxfreq=0;
        int []frq=new int[26];

        for (String s : str) {
            frq[s.charAt(0) - 'a']++;
        }

        for(int count:frq){
            maxfreq=Math.max(count,maxfreq);
        }
        return str.length-maxfreq;
    }
}
