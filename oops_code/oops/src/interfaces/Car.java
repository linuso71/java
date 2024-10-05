package interfaces;

public class Car implements Media,Engine,Brake{
    // these are abstract methods thats why require override
    @Override
    public void brake() {
        System.out.println("breakingg");
    }

    @Override
    public void start() {
        System.out.println("start the car");
    }

    @Override
    public void stop() {
        System.out.println("stop the car");
    }

    @Override
    public void acc() {
        System.out.println("accelerate the car");
    }
}
