package Star_Pattern;

public class example12 
{
  public static void main(String[] args) 
  {
	//        *
    //       ***
   //       *****
	  //   *******
	 
	  
	  
       int space =3;
       int star =1;
	  for(int i=1; i<=4;i++)  // outer for loop ---> rows // first inner loop is used for space for inner for loop and second is used for star
	  {
		  for(int j=1; j<=space; j++) // first inner loop--> space
		  {
			  System.out.print(" ");
		  }
		  for(int j=1; j<=star; j++) // second inner loop--> star
		  {
			  System.out.print("*"); 
		  }
	      System.out.println();
	      space--;
	      star=star+2;   
	  }
  
	 
  
  
  
  
  
  
  } 
}
