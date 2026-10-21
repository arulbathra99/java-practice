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

class datatype{
    public int datat(int a,int b){
        return a*b;
    }
    public double datat(double a,double b){
        return a*b;
    }
    public String datat(String a, String b){
        return a+b;
    }
}

class order{
    public void order1(int a , String b){
        System.out.println("Values : "+a+" String : "+b+" int -> String");
    }
    public void order1(String a,int b){
        System.out.println("Values : "+a+" int : "+b+" String->int");
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
        datatype obj2 = new datatype();
        a = obj2.datat(1,2);
        double d = obj2.datat(2.0,3.0);
        String e = obj2.datat("Arul ","Bathra");
        System.out.println(a+" "+d+" "+e);

        //3. Order of datatypes changed
        order obj3 = new order();
        obj3.order1(10,"Arul");
        obj3.order1("Bathra",12);

        //4. Type conversion
        int z = obj.param1('a','b');
        System.out.println("Type Conversion -> "+z);
    }
}