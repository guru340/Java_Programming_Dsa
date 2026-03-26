import java.math.BigDecimal;
import java.math.BigInteger;

public class Biginteger {

    public static void main(String[] args) {

    }



    static void BD(){
        BigDecimal d=new BigDecimal("0.332");
        BigDecimal e=new BigDecimal("0.366");
//        operations
        BigDecimal ans1=e.add(d);
        BigDecimal ans2=e.multiply(d);
        BigDecimal ans3=e.divide(d);
        BigDecimal ans4=e.remainder(d);
        BigDecimal ans15=e.pow(2);

        BigDecimal ans=e.subtract(d);
        System.out.println(ans);
    }
    static void BI(){

            BigInteger A= BigInteger.valueOf(33);
            BigInteger B=BigInteger.valueOf(56846123);
//        String
            BigInteger C=new BigInteger("564220");
            BigInteger D=BigInteger.ZERO;

//            add
            BigInteger s=A.add(B);
            BigInteger m=s.multiply(B);
            BigInteger sub=s.subtract(B);
            BigInteger d=s.divide(B);
            BigInteger rem=s.remainder(B);


            System.out.println(s);
            System.out.println(m);
            System.out.println(sub);
            System.out.println(d);
            System.out.println(rem);
    }


}
