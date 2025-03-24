package opps.properties.abstracesss;

import com.sun.security.jgss.GSSUtil;

abstract public class Parent {
    int age;
    static int ah;
//    final int vale;

    Parent(){
        System.out.println("Hello parent");
//        vale=122;
    }
     Parent(int age){
        this.age=age;
         System.out.println("hello parent5");
    }
    static void hello(){
        System.out.println("hey");
    }
    void normal(){
        System.out.println("hello");
    }
//    abstract Parent(){
//
//    }
    abstract void career();
    abstract void partner();
//    voi s(); not allow
}
