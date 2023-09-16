package Logical_Program_HashMap;

import java.util.HashMap;
import java.util.Set;

public class Example3_OccuranceOfEachCharInString3 
{
   public static void main(String[] args) 
   {
	 String str ="abcabzzzzz";
	 
	 HashMap<Character, Integer> mp = new HashMap();
	 
	 
	 for(int i=0; i<=str.length()-1;i++)
	 {
		char s1 = str.charAt(i);
		
		if(mp.containsKey(s1)) 
		{
			mp.put(s1, mp.get(s1)+1);
		}
		else 
		{
			mp.put(s1, 1);
		}
		
	 }
	 Set<Character> allkeys = mp.keySet();
	 // Occurrence of each character
	 for(Character key:allkeys) 
	  {
		 System.out.println(key+"-"+mp.get(key));
	  }
   
   
   }
}
