package interfaces;

public class CdPlayer implements Media{


    @Override
    public void start() {
        System.out.println("start the player");
    }

    @Override
    public void stop() {
        System.out.println("stop the player");

    }
}
