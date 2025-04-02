package OOPS.abstractt;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age=age;

    }
    static void hel(){
        System.out.println("Hey");
    }

    abstract void career();
    abstract void Partner();
}
