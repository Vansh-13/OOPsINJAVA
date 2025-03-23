package opps.staticc;

//outside classes cannot be static but innerclas ses is static or non static both
public class Innterclass {
    static  class Test{
String name;
public  Test(String name){
    this.name=name;
}

        public static void main(String[] args) {
            Test a=new Test("kenal");
            Test b=new Test("rahil");
            System.out.println(a.name);
            System.out.println(b.name);
        }

    }
}
