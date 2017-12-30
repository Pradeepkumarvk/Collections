
class Hinew implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<=100;i++)
			System.out.println("Inside threads :run no:"+i);
	}
	
}


class Hellonew implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<=100;i++)
			System.out.println("Inside threadssec :run no:"+i);
		
	}
	
}




public class ThreadsusingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hinew obj1= new Hinew();
		Hellonew obj2=new Hellonew();
		
		Thread t1=new Thread (obj1);
		Thread t2=new Thread (obj2);
		
		t1.start();
		t2.start();
		
		
		
	

	}

}
