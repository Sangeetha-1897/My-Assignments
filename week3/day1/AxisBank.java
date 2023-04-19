package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("deposit");
	}
	public static void main(String[] args) {
		AxisBank Bank= new AxisBank();
				Bank.saving();
		Bank.fixed();
		Bank.deposit();
	}
}
