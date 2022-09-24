//Arranger.Java
//Robot Definition File
//Group 7 Project Solution
//CSC110: Fall 2019
import kareltherobot.*;

public class Arranger extends Robot {

    public Arranger(int street, int avenue, Direction direction, int beepers) {
        super(street, avenue, direction, beepers);
    }

    public void arrange(){
        goToOrigin();
        goToBeeper();
        while (nextToABeeper() && frontIsClear()) {
            surveyRow();
            upOneRow();
            collectRow();
            downRow();
            goToBeeper();
            findRow();
            putRow();
        }
    }
    public void goToOrigin() {
        faceWest();
        while (frontIsClear()) {
            move();
        }
        faceSouth();
        while (frontIsClear()) {
            move();
        }
        faceEast();
    }
    public void goToBeeper(){
        while (!nextToABeeper()){
            move();
        }
    }
    public void upOneRow(){
        faceNorth();
        move();
        faceWest();
    }
    public void downRow(){
        faceSouth();
        move();
        faceEast();
        while(!nextToABeeper()) {
            if (frontIsClear()) {
                move();
            }
        }
        faceEast();
    }
    public void surveyRow() {
        while (nextToABeeper()) {
            if(frontIsClear()) {
                move();
            }
            else {
                return;
            }
        }
        rotate180();
        if(frontIsClear()) {
            move();
        }
        else {
            return;
        }
    }
    public void collectRow() {
        while (nextToABeeper()) {
            pickBeeper();
            while (frontIsClear()) {
                move();
                collectRow();
            }
        }
        while (frontIsClear()) {
            move();
            collectRow();
        }
    }
    public void findRow(){
        while (nextToABeeper()){
            if(anyBeepersInBeeperBag()){
                move();
            }
            else{
                goToOrigin();
                return;
            }
        }
        rotate180();
        if(frontIsClear()) {
            move();
        }
        faceNorth();
        while (nextToABeeper()) {
            move();
        }
        faceWest();
    }
    public void putRow(){
        while (anyBeepersInBeeperBag()) {
            putBeeper();
            if(frontIsClear()){
                move();
            }
        }
        rotate180();
        if(frontIsClear()){
            move();
        }
    }
    public void faceNorth(){
        while(!facingNorth()){
            turnLeft();
        }
    }
    public void faceWest(){
        while(!facingWest()){
            turnLeft();
        }
    }
    public void faceSouth()
    {
        while(!facingSouth()){
            turnLeft();
        }
    }
    public void faceEast()
    {
        while(!facingEast()){
            turnLeft();
        }
    }
    public void rotate180(){
        turnLeft();
        turnLeft();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
