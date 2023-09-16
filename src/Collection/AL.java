package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AL 
{
    public static void main(String[] args) 
    {
		ArrayList al = new ArrayList(4);
		al.add("rahul");
		al.add(101);
		al.add(65.5f);
		al.add('A');
		al.add("mahul");
		al.add(102);
		al.add(102);
		al.add(102);
		al.add("rahul");
		al.add(103);
		al.add(67.5f);
		al.add('C');
		al.add(null);
		al.add(null);
		al.add(68.3f);
		al.add('D');
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(13));
		al.add(13,"Aishwarya");
		System.out.println(al);
		System.out.println("---------------------------------");
		al.remove(13);
		System.out.println(al);
		System.out.println("---------------------------------");
		Iterator store=al.iterator();
		while(store.hasNext())
		{
			System.out.println(store.next());
		}
		System.out.println("---------------------------------");
	    ListIterator Store1=al.listIterator();
	    while(Store1.hasNext())
		{
			System.out.println(Store1.next());
		}
	    System.out.println("---------------------------------");
	    
	    for (Object S1:al) 
	    {
	    	System.out.println(S1);
	    	
	    }
	    System.out.println("---------------------------------");
     al.clear();
     System.out.println(al.size());
    }
}
