package opps.properties.inhritence;

public class Box {
    double l;
    double h;
    double w;
    double weight;
    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    //cube;
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    Box(double l,double w,double h){
        this.w=w;
        this.l=l;
        this.h=h;
    }
    public void information(){
        System.out.println("Running the box"+w);
    }

}
