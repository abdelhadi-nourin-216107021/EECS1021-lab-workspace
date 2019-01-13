import java.util.Scanner;

public class IfStatementApp2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer balance:");
		int balance = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter an amount to withdraw:");
		int amount = input.nextInt();
		
		if(balance<0 || amount<0 || amount>=balance) {
			System.out.println("Error: Launch the program again.");
						
		}else {
			balance = balance - amount;
			System.out.println("Initial balance "+balance+
					" after withdrawing "+ amount+ " has the resulting balance "
					+balance);
		}
		
		input.close();

	}

}
