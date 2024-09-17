package Aboli;

import java.util.Scanner;

public class AccountsManager {
	private Scanner scanner;
	public AccountsManager(Scanner scanner) {
		this.scanner=scanner;
	}
public void credit_money(long account_number) {
	System.out.print("Enter Amount:");
	double amount=scanner.nextDouble();
	System.out.print("Enter Security Pin:");
	String security_pin=scanner.nextLine();
}
public void debit_money(long account_number) {
	System.out.print("Enter Amount:");
	double amount=scanner.nextDouble();
	System.out.print("Enter Security Pin:");
	String security_pin=scanner.nextLine();
	
}	
public void transfer_money(long sender_account_number) {
	System.out.print("Enter Receiver Amount Number:");
	long receiver_amount_number=scanner.nextLong();
	System.out.print("Enter Amount:");
	double amount=scanner.nextDouble();
	System.out.print("Enter Security Pin:");
	String security_pin=scanner.nextLine();
}
public void getBalance(long account_number) {
	System.out.print("Enter Security Pin:");
	String security_pin=scanner.nextLine();

}
}