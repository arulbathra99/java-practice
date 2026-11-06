import java.io.*;
import java.util.*;

class calculator{
    public void add(int a ,int b){
        int c = a+b;
        System.out.println("Addition : "+c);
    }
    public void sub(int a ,int b){
        int c ;
        if(a > b){
            c = a-b;
        }
        else {
            c = b - a;
        }
        System.out.println("Subtraction : "+c);
    }
    public void mul(int a ,int b){
        int c = a*b;
        System.out.println("Multiplication : "+c);
    }
    public void div(int a ,int b){
        int c = a/b;
        System.out.println("divition : "+c);
    }
}
class calc{
    public static void main(String args[]){
    int a , b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A and B value :  ");
    a = sc.nextInt();
    b = sc.nextInt();

    calculator c = new calculator();
	c.add(a,b);
	c.sub(a,b);
	c.mul(a,b);
	c.div(a,b);
    }
}