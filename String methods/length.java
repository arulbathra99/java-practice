import java.io.*;
import java.util.*;

class length{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        int m = s.length();

        //System.out.println("Length is : "+m);

        // print first and last characters

        System.out.print("First character is "+s.charAt(0)+"\nLast charcter is "+s.charAt(m-1));
    }
}