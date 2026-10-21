import java.io.*;
import java.util.*;

//Normal calling method by creating objects
class normal{
    public void value(){
        System.out.print("Normal calling method .. ");
    }
}

class staticmethod{
    public static void value(){
        System.out.print("Static method is calling ... ");
    }
}

abstract class car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Playing music ... ");
    }
}

class amaze extends car{
    public void drive() {
        System.out.println("Car driving is working...");
    }
    public void playMusic() {
        System.out.println("Amaze car is playing...");
    }
}

class methodtypes{
    public static void main(String[] args){
        //normal
        normal n = new normal();
        n.value();

        //static method calling
        staticmethod.value();

        //Predefined method
        System.out.println("Predefined : "+Math.random());

        //Abstract method values
        car c = new amaze();
        c.drive();
        c.playMusic();

    }
}