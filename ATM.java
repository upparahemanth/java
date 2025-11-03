package pack1;

public class ATM {
	
	int balance=50000;
	int pin=2002;
	
	cash withdraw(int wamt) {
		balance= balance-wamt;
		cash c=new cash();
		System.out.println("amount withdrwam "+ wamt);
		return c;
			
	}
	
	void deposit(int amt) {
		balance=balance+amt;
		System.out.println("Amount deposited successfully"+amt);
		
	}
	
	void checkbal() {
		System.out.println("Your Balance is :"+balance);
	}
	
	
	
	public static void main(String[] args) {
		ATM a = new ATM();
		a.withdraw(2000);
		a.checkbal();
		a.deposit(2500);
		a.checkbal();
		
	}

}


class cash{
	
}