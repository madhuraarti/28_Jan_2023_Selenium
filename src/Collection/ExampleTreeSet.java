package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class ExampleTreeSet 
{
 public static void main(String[] args) 
 {
	TreeSet tr = new TreeSet();
	tr.add(110);
	tr.add(102);
	tr.add(108);
	tr.add(104);
	tr.add(105);
//	tr.add(null);
	
    System.out.println(tr);
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
    
    
    for (Object S1:tr) 
    {
    	System.out.println(S1);
    	
    }
}
}
