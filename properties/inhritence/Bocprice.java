package opps.properties.inhritence;

public class Bocprice extends BoxWeight{
    double cost;
    Bocprice(){
        super();
        this.cost=-1;
    }
    Bocprice(Bocprice other){
        super(other);
        this.cost=other.cost;
    }

    public Bocprice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }
    public Bocprice(double side,double weight,double cost) {
super(side,weight);
this.cost=cost;
    }
    }


