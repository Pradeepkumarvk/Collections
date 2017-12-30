package CollectionsPractice_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Accepts key value pair, accepts 1 null key, overrides if key matches, can have multiple null values.
		//It maintains no order.
		
		Map<Integer, String> hm=new HashMap<>();
		hm.put(1, "Pradeep");//put takes key value pair
		//hm.put("2", 5);
		hm.put(null, "kiran");
		hm.put(5, "Pradeep");
		hm.put(2, "Pradeep1");
		hm.put(6, null);
		hm.put(7, null);
		hm.put(null, "I'm");//overrides as key matches as null
	
		
		System.out.println(hm);
		hm.put(5, "Raju");
		System.out.println(hm);
		System.out.println(hm.get(5));//get w.r.t key
		hm.remove(2);//removes element which matches key	
		
		//Getting key value pair using entry set and iterator
		
//		Set s=hm.entrySet();
//	Iterator ir=s.iterator();
//	
//	while(ir.hasNext())
//	{
//		System.out.println(ir.next());
//	}
		
		
		// Using new entry set style
		
		for (Map.Entry<Integer, String> entry:hm.entrySet())
		{
			System.out.println("Key: "+entry.getKey()+"Value:  "+entry.getValue());
		}
		
		System.out.println(hm.keySet());
		
	}

}
