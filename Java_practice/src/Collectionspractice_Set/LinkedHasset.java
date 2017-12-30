package Collectionspractice_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Linked Hash set  maintain insertion order, doesn't allow duplicates, allows null values
Set hs=new LinkedHashSet();
		
		hs.add(2);
		hs.add(4);
		hs.add("Strring");// we dont have index wise add in set
		hs.add(2);
		hs.add(21);
		hs.add(22);
		hs.add(null);
		
		
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


