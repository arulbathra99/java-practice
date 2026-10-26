import java.io.*;
import java.util.*;

class length{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String s = sc.nextLine();
        int m = s.length();
        //1. Length of the string
        //System.out.println("Length is : "+m);

        // 2. print first and last characters
       // System.out.print("First character is "+s.charAt(0)+"\nLast charcter is "+s.charAt(m-1));

        // 3. Print each character using its index
        for(int i=0;i<m;i++){
            //System.out.println(s.charAt(i));
        }

        //4.Extract the first three characters
        System.out.println("Extract the first three characters : "+s.substring(0,3));
    }
}