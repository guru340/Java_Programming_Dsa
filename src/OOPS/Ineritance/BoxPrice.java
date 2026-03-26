package OOPS.Ineritance;

public class BoxPrice{
    double cost;
        BoxPrice(){

            this.cost=-1;
        }



    BoxPrice(BoxPrice other){

        this.cost=other.cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {

        this.cost = cost;
    }
    public BoxPrice(double side,double weight,double cost){

            this.cost=cost;
    }
}
