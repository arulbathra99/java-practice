import java.io.*;
import java.util.*;

class bankAccount{
	private int balance;
	public String name ;
	public int accno;
	
	public void create(String name , int accno , int balance){
		this.name = name ;
		this.accno = accno;
		this.balance = balance;
	}
	public void getDetails(){
		System.out.println("Name : "+name+"\nAccount number : "+accno+"\nBalance : "+balance);
	}
	
	public void deposit(int amount){
		balance = balance + amount;
	}
	
	
}

class enca{
	public static void main(String args[]){
		bankAccount b = new bankAccount();
		b.create("Arul",123456789,10000);
		b.getDetails();
		
		System.out.println("After deposit");
		
		b.deposit(4387);
		b.getDetails();
	}
}
