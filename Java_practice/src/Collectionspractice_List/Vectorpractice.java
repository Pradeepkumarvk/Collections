package Collectionspractice_List;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vectorpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List v=new Vector();
		Vector v=new Vector();
v.add(2);
v.add(1, 10);
v.add("My");
v.add(4);
v.add(2);
v.add(1, 10);
v.add("My");
v.add(4);
v.add(2);
v.add(1, 10);
v.add("My");
v.add(4);
v.add(2);
v.add(1, 10);
v.add("My");
v.add(4);

//System.out.println(v);
v.remove(0);
System.out.println(v.size());
System.out.println(v.capacity());//default capacity of vector is 10, since item no is 15, capacity doubles to 20

Iterator i=v.iterator();

//while(i.hasNext())
//{
//	//System.out.println(i.next());
//	
//}
//System.out.println(v.capacity());

Vector v2=new Vector();


System.out.println(v2.capacity());// default capacity of vector is 10

v2=(Vector) v.clone();//cloning one vector to another

//System.out.println(v2);

System.out.println(v2.capacity());//Now capacity is equal to size of cloned vector i.e.,15

//v2.ensureCapacity(22);
System.out.println(v2.capacity());

Vector v3=new Vector (3);//with inital capacity of 3

System.out.println("v3 initail capacity"+v3.capacity());
v3.add(3);
v3.add(4);
v3.add(4);
v3.add(4);
System.out.println("v3 after capacity"+v3.capacity());//now capcity incresed by 100% i.e, 6


Vector<Integer> v4=new Vector(1,10);//with initial capacity of 1 and increment by 10


System.out.println("v4 initail capacity"+v4.capacity());
v4.add(3);
v4.add(3);
v4.add(3);
System.out.println("v4 after capacity"+v4.capacity());//now capcity incresed by 10 i.e, 11
Enumeration e= v4.elements();// Enumeration has hasmoreelements and next element method
while(e.hasMoreElements())
{
	System.out.println(e.nextElement());
}

	}

}