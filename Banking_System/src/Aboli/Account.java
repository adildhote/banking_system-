package Aboli;

import java.util.Scanner;

public class Account {
	private Scanner scanner;


public Account(Scanner scanner) {
	this.scanner=scanner;
}
public long open_account(String email) {
	System.out.print("Enter Full Name:");
	String full_name=scanner.nextLine();
	double balance=scanner.nextDouble();
	System.out.print("Enter Security Pin:");
	String security_pin=scanner.nextLine();
	return 0;
}
public long getAccount_number(String email) {
	return 0;
}
public long generateAccountNumber() {
	return 0;
}
public boolean account_exist(String email) {
	return false;
}
}
