import java.util.Scanner;

public class LogicalOperationApp1b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter an integer: ");
		int i = input.nextInt();
		boolean isLessThanZero = i<=0;
		System.out.println("The number you entered was positive: "+!isLessThanZero);
		//System.out.println("The number you entered was positive: "+ !(!(i>0)));
		
		input.close();

	}

}
