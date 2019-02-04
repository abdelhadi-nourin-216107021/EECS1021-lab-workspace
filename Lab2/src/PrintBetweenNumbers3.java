import java.util.Scanner;

public class PrintBetweenNumbers3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a lower bound: ");
		int low = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter an upper bound: ");
		int up = input.nextInt();
		input.nextLine();
		
		if(low>up) {
			System.out.println("Error: lower bound " +low+ " is not less than or equal to the upper bound "+up+".");
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			String ask = input.nextLine();
			
			while(!(ask.equals("Y") || ask.equals("N"))) {
				System.out.println("Invalid indication on continuation: " +ask);
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				ask = input.nextLine();
			}
			
			while(ask.equals("Y")) {
				System.out.println("Enter a lower bound: ");
				int low2 = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter an upper bound: ");
				int up2 = input.nextInt();
				input.nextLine();
				
				if(low2>up) {
					System.out.println("Error: lower bound " +low2+ " is not less than or equal to the upper bound "+up2+".");
					System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
					ask = input.nextLine();
					
					while(!(ask.equals("Y") || ask.equals("N"))) {
						System.out.println("Invalid indication on continuation: " +ask);
						System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
						ask = input.nextLine();
					}
				}else {
					for(int i = low2; i <= up2; i++) {
						System.out.println(i);
					}
					
					System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
					ask = input.nextLine();
					
					while(!(ask.equals("Y") || ask.equals("N"))) {
						System.out.println("Invalid indication on continuation: " +ask);
						System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
						ask = input.nextLine();
					}
				}
			}
			System.out.println("Bye!");
		}else {
			for(int i = low; i <= up; i++) {
				System.out.println(i);
			}
			
			System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
			String ask = input.nextLine();
			
			while(!(ask.equals("Y") || ask.equals("N"))) {
				System.out.println("Invalid indication on continuation: " +ask);
				System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
				ask = input.nextLine();
			}
			while(ask.equals("Y")) {
				System.out.println("Enter a lower bound: ");
				int low2 = input.nextInt();
				input.nextLine();
				
				System.out.println("Enter an upper bound: ");
				int up2 = input.nextInt();
				input.nextLine();
				
				if(low2>up) {
					System.out.println("Error: lower bound " +low2+ " is not less than or equal to the upper bound "+up2+".");
					System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
					ask = input.nextLine();
					
					while(!(ask.equals("Y") || ask.equals("N"))) {
						System.out.println("Invalid indication on continuation: " +ask);
						System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
						ask = input.nextLine();
					}
				}else {
					for(int i = low2; i <= up2; i++) {
						System.out.println(i);
					}
					
					System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
					ask = input.nextLine();
					
					while(!(ask.equals("Y") || ask.equals("N"))) {
						System.out.println("Invalid indication on continuation: " +ask);
						System.out.println("Would you like to continue printing? (Enter Y for yes; N for no)");
						ask = input.nextLine();
					}
				}
			}
			System.out.println("Bye!");
			
		}
	input.close();
	}

}
