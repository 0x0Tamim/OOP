public class BoxWeight extends Box{

    double weight = -1;

    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }

    // Copy constructor for BoxWeight class
// Takes another BoxWeight object and copies its properties into the new object
    BoxWeight(BoxWeight other) {
        super(other);              // Call the parent (Box) copy constructor to copy width, height, depth
        weight = other.weight;     // Copy the weight field specific to BoxWeight

    }


    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

}
