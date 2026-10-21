import java.io.*;
import java.util.*;

class parameter{
    public int param1(int a, int b){
        return a+b;
    }
    public int param1(int a,int b,int c){
        return a+b+c;
    }
    public int param1(int a,int b,int c,int d){
        return a*b*c*d;
    }
}

class methodoverloading{
    public static void main(String args[]){
        //1.different types of parameters.
        parameter obj = new parameter();
        int a = obj.param1(1,2);
        int b = obj.param1(1,2,3);
        int c = obj.param1(1,2,3,4);

        System.out.println(a+" "+b+" "+c);

        //2. Different types of data types
    }
}