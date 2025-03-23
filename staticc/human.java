package opps.staticc;

public class human {
    int age;
   String name;
    int salary;
    boolean married;
    static long population;
    public human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        population+=1;// same static h bas jab bhi nya object bnega vo popution nhi h but main class m static h toh increment
//       this.population+=1;// same
//        human.population+=1;// same access by human class beacause this is static
    }

}
