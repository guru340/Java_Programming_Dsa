package OOPS;

public class wrapperexample {
    public static void main(String[] args) {

        Integer a=10;
        Integer b=20;
        Integer num=545;
           swap(a,b);
        System.out.println(a+" "+b);
         final A kunal=new A("name");
         kunal.name="other name";

    }
//    final int n=3;
//    n=4;

    static void swap(Integer a ,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }


}
class A{
    final  int num=10;
    String name;

    public A(String name) {
        this.name = name;
    }
}

