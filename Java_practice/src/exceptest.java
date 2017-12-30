
public class exceptest {

	
	
	public static void main (String args[])
	{
		
		try{
			
		
		int i=2;
		
		int j=5;
		
		int k=i/j;
		
		//String s1= new String ("Myname");
		//String s2= new String ("Hi");
		String s1="ABC";
		String s2="DEF";
		
	//	String s3=s1+s2;
	//String s4=s1.concat(s2);
		
		s1.concat(s2);
		//.out.println(s1+"\n"+s2+"\n"+s3+"\n");
		
		System.out.println(s1);
		
		
		
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
			System.out.println("Bye");
		}
		
		}
		
	}

