package exceptions;
public class ArrayElements {
	int arr[];
	//Parameterized Constructor
	public ArrayElements(int[] arr) {
		super();
		this.arr = arr;
	}
	//Synchronized Method
	synchronized void sumOfElements() {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(arr[i]);
		}
		System.out.println("Sum="+sum);
	}

}
