class Mythread extends Thread
{
	public void start()
	{
		System.out.println("Start method");
	}
	
	public   void run()
	{
		System.out.println("run method");
			
	}	
}
public class MultiThreadDemo2 {

	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();
		System.out.println("Main method");
	}

}
