import java.util.Scanner;

public class PrintBetweenNumbers1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a lower bound: ");
		int low = input.nextInt();
		
		System.out.println("Enter an upper bound: ");
		int up = input.nextInt();
		
		if(low>up) {
			System.out.println("Error: lower bound " +low+ " is not less than or equal to the upper bound "+up+".");
		}else {
			for(int i = low; i <= up; i++) {
				System.out.println(i);
			}
			System.out.println("Bye!");
		}
	input.close();
	}

}
