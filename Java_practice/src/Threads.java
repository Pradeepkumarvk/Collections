
public class Threads 
{

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		
		obj1.start();
		//try {Thread.sleep(1);} catch (Exception e) { e.printStackTrace();}
		obj2.start();
		System.out.println(obj1.isAlive());
		
		obj1.join();
		obj2.join();
		System.out.println(obj1.isAlive());
		//Join threads then print
		System.out.println("BYE");
		
	}


	}
class Hi extends Thread{
 

		
	public  void run()
	{
		for (int i=0; i<=10;i++)
		System.out.println("Inside threads :run no:"+i);
		try {Thread.sleep(100);} catch (Exception e) { e.printStackTrace();}
		
	}
	}


class Hello extends Thread{

	
	
	public   void run()
	{
		for (int i=0; i<=10;i++)
			System.out.println("Inside threadssec :run no:"+i);
		try {Thread.sleep(150);} catch (Exception e) { e.printStackTrace();}
	}
	}



