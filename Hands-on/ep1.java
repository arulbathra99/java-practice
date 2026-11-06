import java.io.*;
import java.util.*;

class testcase{

        int id;
        String name ;
        int priority;
        String status;
    testcase(int id,String name, int priority,String status){
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.status = status;
    }
    public void printSummary(){
        System.out.println("ID : "+id+"\nNAme : "+name+"\nPriority : "+priority+"\nstatus : "+status);
        System.out.println();
    }
}
class ep1{
    public static void main(String args[]){
        testcase t1 = new testcase(1,"Arul",23,"Success");
        t1.printSummary();
        testcase t2 = new testcase(2,"Arun",24,"Failure");
        t2.printSummary();
        testcase t3 = new testcase(3,"Aravind",25,"Success");
        t3.printSummary();
    }
}