package String;

public class revstr {
    public static void main(String[] args) {
        System.out.println(reverseString("Mayank"));
    }

    public static String reverseString(String s) {
        // code here


        // code here
        String[] words=s.split("");
        StringBuilder sb=new StringBuilder();
        for (int i= words.length-1;i>=0;i--){
            sb.append(words[i]);
        }
        return sb.toString();
    }

}
