package OOPS.polymorphism;

public class Circle extends Shapes {

//    this will run when obj of Circle is Created
//    hence it is overidding the parent class
    @Override //this is called annotation
    void area(){
        System.out.println("Area is 3.14*R*R");
    }
}
