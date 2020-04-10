package oops.abstraction.interf;

public class StateBank implements RBIBank {
	
	public void fundTransfer(){
		System.out.println("Inside SBI Bank: I have my own way of Fund transfer");
	}
	public void addBeneficiery(){
		System.out.println("Inside SBI Bank: I have my own way of Beneficiery management");
	}
	public void makeDeposit(){
		System.out.println("Inside SBI Bank: I have my own way of Make Deposit");
	}
	public void balanceCheck(){
		System.out.println("Inside SBI Bank: I have my own way of Balance Check");
	}
	public void applyLoan(){
		System.out.println("Inside SBI Bank: I have my own way of Apply Loan");
	}
	public void applyOverdraft(){
		System.out.println("Inside SBI Bank: I have my own way of Apply Overdraft");}

}
