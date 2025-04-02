package OOPS.interfACE.extendeddemo;

public interface A {
//    Static should be always contain body interface
    static void greet(){
        System.out.println("Hey I am Greeting");
    }
    default void fun(){
        System.out.println("I am in A");
    }
}
