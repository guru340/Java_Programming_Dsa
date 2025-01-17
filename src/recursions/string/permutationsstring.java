package recursions.string;

import java.util.ArrayList;

public class permutationsstring {
    public static void main(String[] args) {
        System.out.println(permutationcount("","abc"));
    }

    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }

    static ArrayList<String> permutationlist(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
//        local for this for loop only
        ArrayList<String > ans=new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationlist(f+ch+s,up.substring(1)));
        }
        return  ans;
    }

    static int permutationcount(String p,String up){
        if(up.isEmpty()){

            return 1;
        }
        int count=0;
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            count=count+permutationcount(f+ch+s,up.substring(1));
        }
        return count;
    }
}
