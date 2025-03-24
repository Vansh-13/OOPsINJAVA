package opps.properties.interfacess;

public class NiceCar {
    private Engine engine;
    private mediaa player=new cd();
    NiceCar(){
        engine=new poweren();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startmusic(){
        player.start();
    }
    public void upgrade(Engine engine){
        this.engine=engine;
    }
}
