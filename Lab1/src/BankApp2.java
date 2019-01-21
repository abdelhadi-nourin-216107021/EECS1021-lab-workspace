import java.util.Scanner;

public class BankApp2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a balance: ");
		double balance = input.nextDouble();
		input.nextLine();
		
		if(0 < balance && balance <= 1000) {
			System.out.println("Enter a transaction type (\"d\" or \"w\"):");
			String type = input.nextLine();
			
			System.out.println("Enter an amount for " +type+ ": ");
			double amount = input.nextDouble();
			input.nextLine();
			
			if(type.equals("d")) {
				
				if(amount <= 0) {
					System.out.println("Error: withdraw amount is not positive.");
				}else if(amount >= balance) {
					System.out.println("Error: withdraw amount too large.");
				}else {
					balance+=amount;
				}
				
			}else if(type.equals("w")) {
			
				if(amount <= 0) {
					System.out.println("Error: deposit amount is not positive.");
				}else if(balance + amount > 1000) {
					System.out.println("Error: deposit amount too large.");
				}else {
					balance-=amount;
				}
			}else {
				System.out.println("Error: transaction type " +type+ " is neither d or w");
			}
			
			if(type.equals("d")) {
				
			}else if(type.equals("w")) {
				
			}
			System.out.println(" Resulting Balance: after performing transaction of " +type+ "with $" +amount+ ": " + balance);
		}else {
			System.out.println("Error: initial balance " +balance+ "is not in (0, 1000).");
		
		}
		
		
		input.close();
	}

}
