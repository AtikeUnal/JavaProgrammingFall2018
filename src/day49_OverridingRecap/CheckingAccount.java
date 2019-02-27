package day49_OverridingRecap;

public class CheckingAccount extends BankAccount {

	public boolean transfer(int transferAmount, BankAccount targetAccount) {
		
		double fee=(transferAmount*3)/300;
		return true;
	}
	
}
