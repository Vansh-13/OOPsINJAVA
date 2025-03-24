package opps.properties.interfacess;

public interface Engine {
default void fg(){

}
static void grr(){ ///call by the interface name
    System.out.println("hey i am");
}
    int price=78000; //by deautl static,final
    void start();
    void stop();
    void acc();
}
