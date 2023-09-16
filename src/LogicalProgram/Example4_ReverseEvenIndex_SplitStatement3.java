package LogicalProgram;

public class Example4_ReverseEvenIndex_SplitStatement3 
{
   public static void main(String[] args) 
   {
	 String s1 ="my name is abc"; // ym name si abc
	 
	 String[] ar =s1.split(" "); // my[0] name[1] is[2] abc[3]
     
	 System.out.println(ar[2]); 
	 
     System.out.println("-------------------------------"); 
	 
	 for(int i=0;i<=ar.length-1;i++) 
   {
	  String org = ar[i];
	  if(i%2==0)
	  { String rev =reverseString(org);
	  
        System.out.print(rev+" "); 
	  }
	  else 
	  {
		  System.out.print(org+" ");   
	  }
   
   }
   }

public static String reverseString(String org)
{
	String rev="";
	for(int j=org.length()-1; j>=0; j--)
	  {
		  rev = rev+org.charAt(j);
	  }
    return rev; 
}

   }
   
