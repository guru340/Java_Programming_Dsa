package OOPS.Ineritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
//    cube
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }

//    super(); call the constructor
    Box(double l,double h,double w){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Box(Box old){
        this.h=old.h;
        this.l=l;
        this.w=w;
    }

    public void information(){
        System.out.println("Running The Box");
    }
}
