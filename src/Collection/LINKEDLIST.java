package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LINKEDLIST 
{
public static void main(String[] args)
{
	HashSet hs = new HashSet();
	hs.add("rahul");
	hs.add(101);
	hs.add(65.5f);
	hs.add('A');
	hs.add("mahul");
	hs.add(102);
	hs.add(102);
	hs.add(102);
	hs.add("rahul");
	hs.add(103);
	hs.add(67.5f);
	hs.add('C');
	hs.add(null);
	hs.add(null);
	hs.add(68.3f);
	hs.add('D');
	
	System.out.println(hs);
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	;
	System.out.println("----------Add and modified---------------------");
	
	System.out.println(hs);
	System.out.println("---------------------------------");
	hs.remove(13);
	System.out.println(hs);
	System.out.println("---------------------------------");
	Iterator store=hs.iterator();
	while(store.hasNext())
	{
		System.out.println(store.next());
	}
	System.out.println("-------------list---------------");
    
    
    for (Object S1:hs) 
    {
    	System.out.println(S1);
    	
    }
    System.out.println("---------------------------------");
 hs.clear();

}
}
