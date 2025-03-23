package opps.properties.inhritence;

public class Main {
    public static void main(String[] args) {
        Box box=new Box(4.6,5.6,4.5);
        //        System.out.println(box.l);
//        System.out.println(box.w);
//
//        System.out.println(box.h);
        BoxWeight box3=new BoxWeight(4,3,2,1);
        System.out.println(box3.h);
        System.out.println(box3.w);
        System.out.println(box3.weight);
//        box3.information();
        Box box5=new BoxWeight(2,3,4,5); //in there acces only the superclass method and varabel jo refernce ker rhah
//        System.out.println(box5.weight);  ///not access weigth

    }
}
