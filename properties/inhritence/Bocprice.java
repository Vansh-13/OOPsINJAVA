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
}
