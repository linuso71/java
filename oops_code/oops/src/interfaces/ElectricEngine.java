package interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("start electric engine");
    }

    @Override
    public void stop() {
        System.out.println("stop electric engine");
    }

    @Override
    public void acc() {
        System.out.println("acc electric engine");
    }
}
