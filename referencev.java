import java.io.*;
import java.util.*;

class employee{
	int a ;
	employee(int a){
		this.a = a;
	}
	public void print(){
		System.out.println("value is : "+a);
	}
}
class referencev{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value : ");
		int m = sc.nextInt();
		employee a = new employee(10);
		a.print();
		employee b =a;
		b.print();

		System.out.println("After value change  ");
		b.a = 30;
		a.print();
		b.print();
	}	
}