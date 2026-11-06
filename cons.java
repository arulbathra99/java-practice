import java.io.*;
import java.util.*;

class constructor{
	
	int a;
	String b;
	String name ;
	int age ;
	String area;
	
	//default constructor
	constructor(){
	}
	
	//parameterized constructor
	constructor(int a, String b){
		System.out.println("A is "+a+"\n Stirng value is : "+b);
	}
	
	//copy constructor
	constructor(String name , int age , String area){
		this.name = name ;
		this.age = age;
		this.area = area;
	}
	
	public void printdetails(){
		System.out.println("Name : "+name+"\n Age : "+age+"\n area : "+area);
	}
	
	constructor(constructor c3){
		this.name = c3.name;
		this.age = c3.age;
		this.area = c3.area;
	}
}

class cons{
    public static void main(String args[]){
		
		constructor c1 = new constructor(10,"Arul");
		constructor c2 = new constructor("Arul" , 24 , "Palani");
		c2.printdetails();
		
		constructor c3 = new constructor(c2);
		c3.printdetails();
		
	}
}