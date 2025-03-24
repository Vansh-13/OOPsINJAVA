package opps.properties.abstracesss;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(30);

        int a=son.age;
        System.out.println(a);
//        daughter dau=new daughter();//
//        dau.career();
//Parent mom=new Parent(); //error not crete of the object of abstract class
son.normal();
Parent dau=new daughter(30);//this is also
dau.career();
    }
}
