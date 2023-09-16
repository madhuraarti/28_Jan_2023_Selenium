package LogicalProgram;

import java.util.Scanner;

public class Example1_Accept_Input_From_User3 
{
 public static void main(String[] args) 
 {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Student Name: "); 
    String s1 = scan.next();
    System.out.println(s1.toUpperCase());
 }
}
