package exceptions;
//program using nested try-catch block
import java.util.TreeSet;
public class DemoException {
	public static void main(String[] args) {
		int a[]= {1,2,4,10};
		try {
			for(int i=0;i<4;i++) {
			System.out.println(a[i]);
		}
			try {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(null);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Exception Caught");
		}
		finally {
				System.out.println("finally");
			}
	}

}
