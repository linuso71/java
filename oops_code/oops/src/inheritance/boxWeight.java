package inheritance;

public class boxWeight extends Box {
    double weight;

    public boxWeight(){
        this.weight = -1;
    }

    public boxWeight(boxWeight other){
        super(other);
        this.weight = other.weight;
    }

    public boxWeight(double l, double b,double h, double weight){
        super(l,h,b);
        this.weight = weight;
    }


}
