package Aboli;

import java.util.Scanner;

public class User {
	private Scanner scanner;

	public User(Scanner scanner) {
		this.scanner=scanner;
	}
	public void register() {
		System.out.println("Full Name: ");
		String full_name=scanner.nextLine();
		System.out.println("Email: ");
		String email=scanner.nextLine();
		System.out.println("Password: ");
		String password=scanner.nextLine();
		if(user_exist(email)) {
			System.out.println("User Already Exists for ");
			return;
		}
	}
private boolean user_exist(String email) {
		// TODO Auto-generated method stub
		return false;
	}
public String login() {
	System.out.println("Email:");
	String email=scanner.nextLine();
	System.out.println("Password:");
	String password=scanner.nextLine();
	return null;
	
}
}
