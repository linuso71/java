package interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("start power engine");
    }

    @Override
    public void stop() {
        System.out.println("stop power engine");
    }

    @Override
    public void acc() {
        System.out.println("acc power engine");
    }
}
