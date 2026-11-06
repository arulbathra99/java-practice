import java.io.*;
import java.util.*;

class vehicle{
	void start(){
		System.out.println("Vehicle started ");
	}
	vehicle(){
		System.out.println("constructos is called");
	}
}

class car extends vehicle{
	car(){
		super();
	}
	void start(){
		System.out.println("Car is started");
	}
	
	public void calling(){

		this.start();
		super.start();

	}
	
}


class super123{
	public static void main(String[] args){
		car c = new car();
		c.calling();
	}	
}