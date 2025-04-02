package OOPS.Ineritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
         this.weight=-1;
    }

    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }


    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);// It call The Parent class
//        used to intailize values present in parent class

        this.weight = weight;
    }
}
