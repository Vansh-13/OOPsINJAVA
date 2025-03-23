package opps.properties.polimorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
       shapes shape=new shapes();
       circle circle=new circle();
       shapes s =new circle(); //in this access on the reernce type method but he area metho is commn bith cureple as haes get why it call the object type
//        Yeh method overriding aur dynamic method dispatch ki wajah se hota hai.


        s.area();
//       circle.area();
//       s.area3();
    }
}
