package Coginzant;
// Minimum Removals to Form an Ideal String
public class question9 {
    static void main() {
        System.out.println(ideal("XXY"));
    }
    public static int ideal(String str){
        int countx=0;
        int county=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='X'){
                countx++;
            }
            else county++;
        }
        if(countx>county){
            return countx-county;
        }
        else return county-countx;
    }
}
