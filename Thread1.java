package threads;

class ThreadsDemo extends Thread
{
	public void run()
	 {
		/*try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println("vijay");
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
}
class Sample implements Runnable
{
	public void run()
	 {
		 for(int i=1;i<=5;i++)
		 {
			 System.out.println(i);
			 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	 }
}


public class Threads1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ThreadsDemo d = new ThreadsDemo();
         Thread t1 = new Thread(d);
         t1.start();
         Sample s = new Sample();
         Thread t2 = new Thread(s);
         t2.start();
	}

}
