package Coginzant;


//Expand String Based on First Occurrence
public class question3 {

    static void main() {
        System.out.println(str("abca"));

    }

    public static String str(String string){
        StringBuilder sb=new StringBuilder();
        String str1 = "";
      for(char ch:string.toCharArray()){
          int index=string.indexOf(ch)+1;
          for (int i = 0; i < index; i++) {
              str1 += ch;
          }
          str1 += "-";
      }

        return str1.substring(0, str1.length() - 1);
    }
}
