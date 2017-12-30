package CollectionsPractice_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//It contains only unique elements.
	//	It cannot have null key but can have multiple null values.
	//	It is same as HashMap instead maintains ascending order.
		
		
		
		Map<Integer, String> hm=new TreeMap<>();
		hm.put(1, "Pradeep");//put takes key value pair
		//hm.put("2", 5);
		//hm.put(null, "kiran");
		hm.put(5, "Pradeep");
		hm.put(2, "Pradeep1");
		hm.put(6, null);
		hm.put(7, null);
		//hm.put(null, "I'm");//Cannot have null key, gives run time exception
	
		
		System.out.println(hm);
		hm.put(5, "Raju");
		System.out.println(hm);
		System.out.println(hm.get(5));//get w.r.t key
		
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
