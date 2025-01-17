package OOPS.staticexample.Singleton;

public class main {
    public static void main(String[] args) {
        singleton obj=singleton.getInstance();

        singleton obj2=singleton.getInstance();


        singleton obj3=singleton.getInstance();

//        all 3 variables are just pointing to one variable
    }
}
