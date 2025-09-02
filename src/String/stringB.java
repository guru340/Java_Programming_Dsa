package String;

public class stringB {
    public static void main(String[] args) {
        // String Builder
        StringBuilder name=new StringBuilder();
        for(int i=0;i<26;i++)
        {       
            char ch=(char)('A'+i);
                name.append(ch);

        }
        System.out.println(name.toString());
    }
}
