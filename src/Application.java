//Application.Java
//Main Application File
//Group 7 Project Solution
//CSC110: Fall 2019
import kareltherobot.*;

public class Application implements Directions
{
 public static void main(String [] args)
 { Arranger jim = new Arranger(1, 1, North, 0);
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


