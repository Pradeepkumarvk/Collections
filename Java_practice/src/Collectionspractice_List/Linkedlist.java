package Collectionspractice_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array ex
		
		int[] a= new int[5];
		a[0]=2;
		a[1]=3;
		a[2]=5;
		
		for (int k:a)
		{
			System.out.println(k);
		}
		
	/////Linked List- maintains insertion order and allows duplicate- maintains doubly linked connections hence manipulation is easy n fast
		
		List LL=new LinkedList();
		
		LL.add("String");
		LL.add("String2");
		LL.add(0, 11);
		System.out.println(LL);
		LL.add(0,12);
		LL.add("String2");
		
		Iterator i=LL.iterator();//  has only hasnext, next and remove method
		
		ListIterator k= LL.listIterator();//list iterator has previous and has previous 
		
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		
		LL.remove(1);//removes index wise data
		
		System.out.println(LL);
		
		
	}

}
