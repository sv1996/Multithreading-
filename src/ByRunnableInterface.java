class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
			
		{
			System.out.println("run methdod ");
		}
			
}
}
public class ByRunnableInterface {

	public static void main(String[] args) {
		MyRunnable r= new  MyRunnable();
		
	 Thread t=new Thread(r);
	 t.start();
	 for(int i=0;i<5;i++)
			
		{
			System.out.println("main methdod ");
		}
	 
	 
	}

}
