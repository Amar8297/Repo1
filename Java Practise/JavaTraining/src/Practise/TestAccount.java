package Practise;



class Account{
	int acc_no;
	String name;
	float amount;
	void insert(int a,String n,float amt) {
		acc_no=a;
		name=n;
		amount=amt;
	
	}void deposit(float amt){
		amount=amount+amt;
		
	}void withdraw(float amt){
		if( amount<amt) {
		System.out.println("Insufficent account balance");
	}else 
	{amount =amount-amt;
		System.out.println("Transcation Successful");
	}
	}
	void displayBalance() {
		System.out.println("Balance Remaining"+(amount));
	}void display(){System.out.println(acc_no+" "+name+" "+amount);
	}  
}
public class TestAccount {
	public static void main(String[] args) {
		
		System.out.println("Enter the amount");
		
		System.out.println("");
		Account a1=new Account();
		a1.insert(108,"Amar",100000);
		a1.deposit(20000);
		a1.withdraw(35000);
		a1.displayBalance();
		a1. display();
	}
}
