
import kareltherobot.*;

public class Main implements Directions{

    public static void main(String[] args) {
        Arranger jim = new Arranger(1, 1, North, 0);
        jim.arrange();
        jim.goToOrigin();
        jim.turnOff();
    }
    static
    {
        World.setDelay(1);
        World.readWorld("asdf");
        World.setVisible(true);
        World.showSpeedControl(true);
    }
}
