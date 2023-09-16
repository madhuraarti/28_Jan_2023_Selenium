package Logical_Program_HashMap;

import java.util.HashMap;
import java.util.Set;

public class Example5_TotalnoOfAlphabatInAString1
{
   public static void main(String[] args) 
   {
	   String str ="abc 12@";
	   
	   int countLetter =0;
	   int countDigit = 0;
	   int countWhiteSpace =0;
	   int countSpecialChar=0;
	   
	   
	   for(int i=0; i<=str.length()-1;i++)
		 {
		   char s1 = str.charAt(i);
			
		   if (Character.isLetter(s1))
		   {
			   countLetter++;
		   }
   
		   else if (Character.isDigit(s1))
		   {
			   
			   countDigit++;
		   }
		 
		   else if (Character.isWhitespace(s1))
		   {
			   
			   countWhiteSpace++;
		   }
		 
		   else 
		   {
			   countSpecialChar++;
		   }
		 }
		 System.out.println("Letter Count: "+countLetter);
		 System.out.println("Digit Count: "+countDigit);
		 System.out.println("SpecialChar Count: "+countSpecialChar);
		 System.out.println("Whitespace Count: "+countWhiteSpace);
		 
		 
		 
   }
   }


