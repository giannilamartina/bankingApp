package bankingApp;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		int userChoice;
		boolean quit = false;
		float balance = 0f;
		do {
			System.out.println("1. Deposit money");
			System.out.println("2. Withdraw money");
			System.out.println("3. Check balance");
			System.out.println("Your choice, 0 to quit");
			userChoice = in.nextInt();
			switch (userChoice) {
			case 1: 
				// deposit money
				float amount;
				System.out.println("Amount to deposit: ");
				amount = in.nextFloat();
				if (amount <= 0) {
					System.out.println("Invalid deposit amount.");
				} else {
					balance += amount;
					System.out.println("$" + amount + " has been deposited successfully.");
				}
				
				
				break;
			case 2:
				// withdraw money
				System.out.println("Amount to withdraw: ");
				amount = in.nextFloat();
				if (amount > balance || amount <= 0) {
					System.out.println("Invalid withdrawal amount.");
				} else {
					balance -= amount;
					System.out.println("$" + amount + " has been withdrawn successfully.");
				}
				break;
			case 3:
				// check balance
				System.out.println("Current balance is $" + balance);
				break;
			case 0:
				quit = true;
				break;
			default: 
				System.out.println("Invalid choice.");
				break;
			}
			System.out.println();
			
		} while (!quit);
		System.out.println("Bye!");
	}
}
