package exceptions;
//Class implementing the Runnable interface
class DThread implements Runnable{
	//Overriding the run method
    @Override
	public void run() {
    	//Printing the name of the current thread
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		//Printing the priority of the current thread
		System.out.println(Thread.currentThread().getPriority());
	}
}
//Main class that contains the main method
public class RunnableThread {
	//Main method where the execution starts
	public static void main(String[] args) {
		//Printinh the name of the main thread
		System.out.println(Thread.currentThread().getName());
		//Creating an object of DThread
		DThread dt=new DThread();
		//Creating Thread object
		Thread t=new Thread(dt,"Demo one");
		//Starting the newly created thread
		t.start();
	}
}
