package inheritance;

public class BoxColor extends boxWeight {
    String color = "";

    BoxColor(){
        this.color = color;
    }
    public BoxColor(double l,double b,double h, double weight,String color){
        super(l,b,h,weight);
        this.color = color;

    }
}
