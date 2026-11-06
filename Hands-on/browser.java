import java.io.*;
import java.util.*;
class br{
    public void printSummary(int i){
        System.out.println("object no : "+i);
    }
}
class browser{
    public static void main(String args[]){
        br b = new br();
        b.printSummary(1);
        b.printSummary(2);
        b.printSummary(3);

    }
}