package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VECTOR 
{
    public static void main(String[] args) 
    {
		Vector v = new Vector(4);
		v.add("rahul");
		v.add(101);
		v.add(65.5f);
		v.add('A');
		v.add("mahul");
		v.add(102);
		v.add(102);
		v.add(102);
		v.add("rahul");
		v.add(103);
		v.add(67.5f);
		v.add('C');
		v.add(null);
		v.add(null);
		v.add(68.3f);
		v.add('D');
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.get(13));
		v.add(13,"Aishwarya");
		System.out.println(v);
		System.out.println("---------------------------------");
		v.remove(13);
		System.out.println(v);
		System.out.println("---------------------------------");
		Iterator store=v.iterator();
		while(store.hasNext())
		{
			System.out.println(store.next());
		}
		System.out.println("---------------------------------");
	    ListIterator Store1=v.listIterator();
	    while(Store1.hasNext())
		{
			System.out.println(Store1.next());
		}
	    System.out.println("---------------------------------");
	    
	    for (Object S1:v) 
	    {
	    	System.out.println(S1);
	    	
	    }
	    System.out.println("---------------------------------");
    // v.clear();
     System.out.println(v.size());
     System.out.println("-----------enu-------------------");
    
    Enumeration enu=v.elements();
    
     while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
    
    
    }
}
