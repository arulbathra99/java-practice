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

class methodtypes{
    public static void main(String[] args){
        //normal
        normal n = new normal();
        n.value();

        //static method calling
        staticmethod.value();

        //Predefined method
        System.out.println("Predefined : "+Math.random());

    }
}