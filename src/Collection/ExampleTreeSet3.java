package Collection;

import java.util.Iterator;

import java.util.TreeSet;

public class ExampleTreeSet3 
{
 public static void main(String[] args) 
 {
	TreeSet <String> tr = new TreeSet();
	
	tr.add("madhur");
	tr.add("rahul");
	tr.add("aishwaraya");
	tr.add("pinto");
	

	
    System.out.println(tr.size());
	System.out.println(tr.first());
	System.out.println(tr.last()); 
	System.out.println(tr.pollFirst());
	System.out.println(tr); 
	System.out.println("---------------------------------");
    
	Iterator store=tr.iterator();
	while(store.hasNext())
	{
		System.out.println(store.next());
	}
	System.out.println("---------------------------------");
    
	for (int i=0;i<=tr.size()-1;i++)
	{
		System.out.println(i);
		
	}
	System.out.println("---------------------------------");
    for (Object S1:tr) 
    {
    	System.out.println(S1);
    	
    }
}
}
