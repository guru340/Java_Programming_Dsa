package String.StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

import static String.StringBuffer.RandomStrin.generate;

public class Main {

    public static void main(String[] args) {
//        constructor Name1
        StringBuffer sb=new StringBuffer();
//        constructor Name2
        StringBuffer sb2=new StringBuffer("Mayank Sangwani");
//        constructor Name
        StringBuffer sb3=new StringBuffer(30);
    sb.append("Goolo Moolo");
        sb.insert(2,"Mayank");

        sb.replace(2,5,"mayank");
        String str=sb.toString();
        System.out.println(str);

        Random random=new Random();
        System.out.println(random.nextFloat());

        int n=20;
        String namr=generate(n);
        System.out.println(namr);


// remove whitespaces
        String str2=("may nkn hhfdk");
        System.out.println(str2.replaceAll("\\s",""));

//        split
        String arr="Mayank";
        String [] names=arr.split("");
        System.out.println(Arrays.toString(names));

//        roundinf off
        DecimalFormat df=new DecimalFormat();

    }
}
