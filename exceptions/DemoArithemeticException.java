package exceptions;
//Class Declaration
public class DemoArithemeticException {
	//Main Method
	public static void main(String[] args) {
		//Variable Declaration
		int a,b,c;
		a=20;
		b=20;
		System.out.println("start of the program");
		//checking Exception
		//Try Block
		try {
		c=a/b;
		System.out.println("c=" +c);
		//Array Declaration
		 int arr[]= {1,2,3};
			System.out.println(arr[5]);
        }
		//Handling the Exception
		//Catch Block
		catch(ArithmeticException ae){
			System.out.println("Exception caught");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Exception Caught");
		}
		//Executes whether Exception Handled or not
		//Finally executes a compulsory statement
		finally {
			System.out.println("End of the program");
		}
	}
}
