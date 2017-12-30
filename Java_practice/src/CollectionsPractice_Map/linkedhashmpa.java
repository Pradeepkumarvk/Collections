package CollectionsPractice_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Accepts key value pair, accepts null key, overrides if key matches, maintains insertion order,can have multiple null values.
		
		Map<Integer, String> hm=new LinkedHashMap<>();
		hm.put(1, "Pradeep");//put takes key value pair
		//hm.put("2", 5);
		hm.put(null, "kiran");
		hm.put(5, "Pradeep");
		hm.put(2, "Pradeep1");
	
		
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
