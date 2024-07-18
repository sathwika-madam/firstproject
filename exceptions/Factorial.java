package exceptions;
//Class Declaration
public class Factorial {
    // variable declaration
    int num;
    // constructor
    public Factorial(int num) {
        this.num = num;
    }
    // synchronized method to calculate factorial
    synchronized void calculateFactorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
            System.out.println(fact);
        }
        try {
            // Introducing a delay to simulate some processing time
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class FactorialSync extends Thread {
    Factorial f;
    public FactorialSync(Factorial fa) {
        super();
        this.f= f;
    }
    public void run() {
        // Calling the synchronized method on the shared Factorial object
        f.calculateFactorial();
    }
    public static void main(String[] args) {
        int number = 5;
        Factorial f = new Factorial(number);
        // Creating two threads that share the same Factorial object
        FactorialSync t1 = new FactorialSync(f);
        t1.start();
        FactorialSync t2 = new FactorialSync(f);
        t2.start();
    }
}