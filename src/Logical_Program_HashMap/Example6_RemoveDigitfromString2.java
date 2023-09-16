package Logical_Program_HashMap;

import java.util.HashMap;
import java.util.Set;

public class Example6_RemoveDigitfromString2
{
   public static void main(String[] args) 
   {
	   String str ="abcd123xyz";
	   String str1 ="";
	   for(int i=0; i<=str.length()-1;i++)
		 {
		   char s1 = str.charAt(i);
		 
		   if (!Character.isDigit(s1))
		   {
			   str1 =str1+s1;	  
		   }
		   else 
		   {
			   
		   }
		 }
		 System.out.println(str1);
   }
   }


