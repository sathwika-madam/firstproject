package exceptions;
//1.Defining a thread using Thread Class
class DemoThread extends Thread{
	String threadName;
	//Using Constructor 
	public DemoThread(String threadName) {
		super();
		//Initializing Thread name
		this.threadName = threadName;
	}
//3.Running State
	public void run() {
		//Printing name and priority of the Thread
		System.out.println("Name:"+this.getName());
		System.out.println("Priority:"+this.getPriority());
		try {
			this.sleep(2000);
		}catch(InterruptedException e) {
		e.printStackTrace();
		}
		//Printing ID of thread
		System.out.println("ID:"+this.getId());
}
}
//Main class to demonstrate MultiThreading
public class MultiThreadingExample {
	public static void main(String[] args) {
		//1.New Thread
		//Create new threads and start them
		DemoThread d=new DemoThread("Demo Thread");
		//2.Runnable Thread
		d.start();
		DemoThread d1=new DemoThread("Demo Thread1");
		d1.start();
		//Set priority of second thread
		d1.setPriority(8);
		DemoThread d2=new DemoThread("Demo Thread2");
		d2.start();
	}
}
