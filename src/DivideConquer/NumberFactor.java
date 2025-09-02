package DivideConquer;

public class NumberFactor {
    public static void main(String[] args) {
            NumberFactor nf=new NumberFactor();
            System.out.println(nf.waystoget(4));
            System.out.println(nf.waystoget(5));
            System.out.println(nf.waystoget(6));
    }


    public int waystoget(int n){
        if((n==0)||(n==1)||(n==2)){
            return 1;
        }
        if(n==3){
            return 2;
        }
        int sub1=waystoget(n-1);
        int sub2=waystoget(n-3);
        int sub3=waystoget(n-4);

        return sub1+sub2+sub3;
    }
}
