package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class hashset 
{
public static void main(String[] args)
{
	LinkedList ll = new LinkedList();
	ll.add("rahul");
	ll.add(101);
	ll.add(65.5f);
	ll.add('A');
	ll.add("mahul");
	ll.add(102);
	ll.add(102);
	ll.add(102);
	ll.add("rahul");
	ll.add(103);
	ll.add(67.5f);
	ll.add('C');
	ll.add(null);
	ll.add(null);
	ll.add(68.3f);
	ll.add('D');
	
	System.out.println(ll);
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	System.out.println(ll.get(13));
	ll.add(13,"Aishwarya");
	System.out.println("----------Add and modified---------------------");
	ll.set(5, "Kalesh");
	System.out.println(ll);
	System.out.println("---------------------------------");
	ll.remove(13);
	System.out.println(ll);
	System.out.println("---------------------------------");
	Iterator store=ll.iterator();
	while(store.hasNext())
	{
		System.out.println(store.next());
	}
	System.out.println("---------------------------------");
    ListIterator Store1=ll.listIterator();
    while(Store1.hasNext())
	{
		System.out.println(Store1.next());
	}
    System.out.println("---------------------------------");
    
    for (Object S1:ll) 
    {
    	System.out.println(S1);
    	
    }
    System.out.println("---------------------------------");
 

}
}
