package opps.properties.interfacess;

public class car implements breakk,Engine,mediaa{
    @Override
    public void start() {
        System.out.println("I start a engine normal class");
    }

    @Override
    public void stop() {
        System.out.println("I stop a engine normal class");
    }

    @Override
    public void acc() {
        System.out.println("I acc a normal class");
    }

    @Override
    public void breakk() {
        System.out.println("I brake like a normal car");
    }
}
