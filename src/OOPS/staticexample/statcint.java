package OOPS.staticexample;

public class statcint {
    static int num=9;
    static int num2;
// it will only once, when the first obj is create i.e when the class is loade for staticblock
    static {
        System.out.println("I am statc block");
        num2=num*6;
    }

    public static void main(String[] args) {
        statcint obj=new statcint();
        System.out.println(statcint.num+" "+statcint.num2);

        statcint.num2+=3;
        System.out.println(statcint.num+" "+statcint.num2);

        statcint obj2=new statcint();
        System.out.println(statcint.num+" "+statcint.num2);
    }
}
