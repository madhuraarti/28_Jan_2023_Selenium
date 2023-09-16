package LogicalProgram;

import java.util.Scanner;

public class Example1_Accept_Input_From_User2 
{
 public static void main(String[] args) 
 {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter num1: "); 
    int	num1=scan.nextInt();
    System.out.println("Enter num2: "); 
    int	num2=scan.nextInt();
    System.out.println(num1+num2);  
 }
}
