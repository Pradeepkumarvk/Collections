class Q
{
	int num;
	boolean valueset=false;
	public synchronized void put(int num) 
	{
		while (valueset)
		{
			try {wait();} catch (Exception e) {}
		}
		System.out.println("Put :"+num);
		this.num=num;
		valueset=true;
		notify();
	}
	
	public synchronized void get() 
	{
		while (!valueset)
		{
			try {wait();} catch (Exception e) {}
		}
		
		System.out.println("Get :"+num);
		valueset=false;
		notify();
		
	}
}

class Producer implements Runnable{
	
	Q q;

	public Producer(Q q) {
		
		this.q = q;
		
		Thread t=new Thread (this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		int i=0;
		while (true)
		{
			q.put(i++);
			try {Thread.sleep(1000);} catch (Exception e) { e.printStackTrace();}
		}
	}
	
	
	
}

class consumer implements Runnable
{
	Q q;
public consumer(Q q) {
		
		this.q = q;
		Thread t=new Thread (this, "Consumer");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (true)
		{
			q.get();
			try {Thread.sleep(1000);} catch (Exception e) { e.printStackTrace();}
		}
	}
}
public class Prodconsumersynch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q q=new Q();
		
		new Producer(q);
		new consumer(q);
	}

}
