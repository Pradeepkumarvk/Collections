package CollectionsPractice_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Hashtablepractice {
	public static void main(String[] args) {

	//A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
	//It contains only unique elements.
	//It may have not have any null key or value.
	//It is synchronized.
	
	
	
	Map<Integer, String> hm=new Hashtable<>();
	hm.put(1, "Pradeep");//put takes key value pair
	//hm.put("2", 5);
	//hm.put(null, "kiran");//Cannot have null key, gives run time exception
	hm.put(5, "Pradeep");
	hm.put(2, "Pradeep1");
	//hm.put(6, null);//Cannot have null key, gives run time exception
	//hm.put(7, null);//Cannot have null key, gives run time exception
//	hm.put(null, "I'm");//Cannot have null key, gives run time exception
	
	System.out.println(hm);
	hm.put(5, "Raju");
	System.out.println(hm);
	System.out.println(hm.get(5));//get w.r.t key
	
	//Getting key value pair using entry set and iterator
	
//	Set s=hm.entrySet();
//Iterator ir=s.iterator();
//
//while(ir.hasNext())
//{
//	System.out.println(ir.next());
//}
	
	
	// Using new entry set style
	
	for (Map.Entry<Integer, String> entry:hm.entrySet())
	{
		System.out.println("Key: "+entry.getKey()+"Value:  "+entry.getValue());
	}
	
	System.out.println(hm.keySet());
	
}
}