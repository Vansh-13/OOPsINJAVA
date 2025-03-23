package opps.properties.inhritence;

public class Box {
  private   double l;
    double h;
    double w;
    double weight;
    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }
    public double getl(){
        return l;
    }
    static void g(){
        System.out.println("he i am in bc class");
    }
    //cube;
    Box(double side){
        System.out.println("hello1");
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
