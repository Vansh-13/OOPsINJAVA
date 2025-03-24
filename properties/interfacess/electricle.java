package opps.properties.interfacess;

public class electricle implements Engine{
    @Override
    public void start() {
        System.out.println("electric st");
    }

    @Override
    public void stop() {
        System.out.println("elet stop");

    }

    @Override
    public void acc() {
        System.out.println("elect acc");
    }
}
