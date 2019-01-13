import java.util.Scanner;

public class IfStatementApp3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer balance:");
		int initialBalance = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter an amount to withdraw:");
		int amount = input.nextInt();
		
		if(initialBalance<0) {
			System.out.println("Error: Initial balance should not be negative.");
						
		}else if(amount<0) {
			System.out.println("Error: Amount to withdraw should not be negative.");
		}else if(amount>= initialBalance) {
			System.out.println("Error: Amount to withdraw should be smaller than balance.");
		}else {
			initialBalance = initialBalance - amount;
			System.out.println("Initial balance "+initialBalance+
					" after withdrawing "+ amount+ " has the resulting balance "
					+initialBalance);
		}
		
		input.close();

	}

}
