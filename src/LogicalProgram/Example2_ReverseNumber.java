package LogicalProgram;

public class Example2_ReverseNumber 
{
   public static void main(String[] args) 
   {
	 int orgNum = 112233;
	String org = Integer.toString(orgNum); // convert num into string
	
	String rev ="";
	
	for(int i =org.length()-1;i>=0; i--) 
	{
		rev = rev + org.charAt(i);
	}
      int revNum =Integer.parseInt(rev); // string into number
      System.out.println(revNum); 
   }
}
