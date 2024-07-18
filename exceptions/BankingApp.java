package exceptions;
//Class Declaration
public class BankingApp {
	//Variable Declaration
	int accNo;
	int balance;
	//Using Constructor
	public BankingApp(int accNo, int balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	//for depositing amount to the Account
	void deposit(int amt) {
		balance+=amt;
		System.out.println("New Balance:"+amt);
	}
	//for withdrawing amount
	void withdraw(int amt)  throws InsufficientBalanceException {
		if(balance>amt) {
			balance--;
			System.out.println("Amount withdrawn succefully"+amt+"\n New Balance:"+balance);
			} else
				//Throws custom Exception
			throw new InsufficientBalanceException("Insufficient Balance");
	}
	//Main Method
	public static void main(String[] args) throws InsufficientBalanceException {
		//Creating objects for BankingApp and Initializing values of accNo and Balance
		BankingApp ba=new BankingApp(325874,200000);
		//Deposit Amount
		ba.deposit(5000);
		try {
			//To withdraw the amount
			ba.withdraw(400000);
		}
		//Handling the Custom Exception
		catch(InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
}
