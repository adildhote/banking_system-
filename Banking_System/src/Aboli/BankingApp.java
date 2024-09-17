package Aboli;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysqol.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		Scanner scanner=new Scanner(System.in);
		User user=new User(scanner);
		Account account=new Account(scanner);
		AccountsManager accountsmanager =new AccountsManager(scanner);
		user.register();
	}

}
