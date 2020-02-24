class Shivam extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("shivam");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
	
	
	
}
class Vish extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("vish");
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
	
	
	
}


public class ThreadDemo {

	public static void main(String[] args) {
	 Shivam sh= new Shivam();
	 Vish v= new Vish();
	 sh.start();
	 v.start();
//	 Thread.sleep(10000);
	 
	 
	}

}
