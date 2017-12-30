package Collectionspractice_Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreesetPractice {

	
	public static void main(String[] args) {
	
		//Maintains ascending order,Maintains ascending order.TreeSet does not allow to insert Heterogeneous objects
		//it allows only int, only string but not mix
		//If we insert null in a TreeSet, it throws NullPointerException
		//because while inserting null it will get compared to existing elements and 
		//null can not be compared to any value.
		Set hs=new TreeSet();
	
		hs.add(4);
		hs.add(2);// we dont have index wise add in set
		
		hs.add(2);
		hs.add(22);
		hs.add(21);
		//hs.add(null);//doesn't take null values
		
		
		System.out.println(hs);
		hs.remove(2);//removes value but not w.r.t index
		System.out.println(hs.size());
		Iterator ir=hs.iterator();
		
		while (ir.hasNext())
		{
			System.out.println(ir.next());
		}
		


	}




	}

