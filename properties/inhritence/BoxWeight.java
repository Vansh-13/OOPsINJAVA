package opps.properties.inhritence;

public class BoxWeight extends  Box{
    double weight;
    BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); //what is this this? call the parent constructor
//use to intalize value in parent class constructure

        this.weight = weight;
    }

    public BoxWeight(Bocprice other) {

    }
}
