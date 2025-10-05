public class BoxPrice extends BoxWeight{

    double cost;

    BoxPrice(){
        super(); //can be ignored
        this.cost = -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double l, double h, double w, double weight, double cost){
        super(l,h,w,weight);
        this.cost = cost;
    }

    BoxPrice(double side, double weight, double cost){
        super(side,weight);
        this.cost = cost;
    }


}
//Multiple inheritance(child extends from more than one parent) is not allowed in java. to solve this problem there is interface
// Hierarchical Inheritance: Multiple child classes inherit from a single parent class
