package opps.properties.inhritence;

public class BoxWeight extends  Box{
    double weight;
    BoxWeight(){
        this.weight=-1;
    }

//    @Override // no ovverde static method
    static void g(){
        System.out.println("he imm am in bc class");
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); //what is this this? call the parent constructor
//use to intalize value in parent class constructure

        this.weight = weight;
    }

     BoxWeight(Bocprice other) {

    }
     BoxWeight(double side, double weight){
         super(side);
         System.out.println("hello2");

        this.weight=weight;
     }
}
