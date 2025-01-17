package recursions.string;

public class skipstr {
    public static void main(String[] args) {
        String ch="cbcapplefg";
        System.out.println(skipnotiya(ch));
    }

    static String skipriya(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipriya(up.substring(5));
        }else{
            return up.charAt(0)+skipriya(up.substring(1));
        }
    }

    static String skipnotiya(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipnotiya(up.substring(3));
        }else{
            return up.charAt(0)+skipnotiya(up.substring(1));
        }
    }
}
