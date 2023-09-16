package Logical_Program_HashMap;

import java.util.HashMap;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

public class Example1_HashMap1_Methods 
{
public static void main(String[] args) 
{
	// HashMap is the implementation class
  HashMap<Integer, String> mp = new HashMap<>();

  // 1: put(key, value); --> to add key & value in hashmap
  
  mp.put(101, "Mahesh");
  mp.put(102, "Ramesh");
  mp.put(103, "Mahesh");
   System.out.println(mp);
  // put method is used to store integer and String
  
   //2: for update: put(key, value); --> update value of already existing key & value
   
   mp.put(101, "MAHESH");
   System.out.println(mp);
   
   
   //3: Find a particular key : containskey(key) // to verify the specific key present or not
   
   System.out.println(mp.containsKey(102));
   System.out.println(mp.containsKey(104));

  // 4: get(key)---> get value of specific key
   System.out.println(mp.get(101));
   
   System.out.println("------------");
   //5: keyset()-->to get all the key from hashmap
   
   
  Set<Integer> allkeys = mp.keySet();
  
  for(Integer key:allkeys) 
  {
	  System.out.println(key);
  }
  System.out.println("------------");
  // 6: get all keys & value print 

  for(Integer key:allkeys) 
  {
	  System.out.println(key+"-"+mp.get(key));
  }
}
}
