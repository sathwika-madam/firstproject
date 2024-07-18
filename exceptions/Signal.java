package exceptions;

public class Signal {
	String signal;
	synchronized void green(String s) throws InterruptedException {
		this.signal=s;
		if(signal.compareToIgnoreCase("green")!=0)
			wait();
		System.out.println("The Signal is green:now can move."+signal);
	}
	synchronized void red(String s) {
		System.out.println("The Signal is red:wait for 1min."+signal);
		this.signal=s;
		notify();
	}
/*	void yellow(String signal) {
		
	}
*/



}
