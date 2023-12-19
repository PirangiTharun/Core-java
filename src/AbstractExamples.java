/**
 *  1) abstract keyword is used to make a method abstract
 *  2) 
 */

abstract class Car {
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

class Merc extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
}

public class AbstractExamples {
    public static void main(String[] args) {
        Merc glc = new Merc();
        glc.drive();
        glc.playMusic();
    }
}
