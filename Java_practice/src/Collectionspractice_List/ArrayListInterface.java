package Collectionspractice_List;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// Array list maintains insertion order and it allows duplicate elements
		List AL=new ArrayList();// generics are objects
		AL.add(5);
		AL.add(2);//add elements
		AL.add(10.29);
	    AL.add(5);
	    AL.add(1, "Sec");//add w.r.t index
	       
	    System.out.println(AL);
	    
	    Iterator i=AL.iterator();
	  
	    
	    while (i.hasNext())
	    {
	    	System.out.println(i.next());
	    }
	    
	    System.out.println(AL.isEmpty());
	    
	    System.out.println(AL.remove(0));//Remove object using index
	    System.out.println(AL);
	    
	    ArrayList<Integer> AL1=new ArrayList<>();//in JAva8 generics after new arraylist is not mandatory
		AL1.add(5);
		
		AL1.add(1, 6);
		
		System.out.println(AL1);
		System.out.println(AL.containsAll(AL1));
		System.out.println(AL1.size());
		System.out.println(AL1.get(0));//get element using index
		System.out.println(AL1.removeAll(AL1));//remove all elements
		
		System.out.println(AL1);
		
	
	
	}

}
