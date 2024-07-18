package exceptions;

public class TrafficSignal {

	public static void main(String[] args) {
		Signal sig=new Signal();
		Thread th=new Thread() {
			public void run() {
				try {
				sig.green("red");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}}
		};
		th.start();
		Thread th1=new Thread() {
			public void run() {
				sig.red("green");
			}
		};
		th1.start();
	}

}
