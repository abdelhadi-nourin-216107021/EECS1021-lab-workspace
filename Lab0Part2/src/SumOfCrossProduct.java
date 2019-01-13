import java.util.Scanner;

public class SumOfCrossProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st integer in sequence 1: ");
		int num1a = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 2nd integer in sequence 1: ");
		int num2a = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 3rd integer in sequence 1: ");
		int num3a = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 4th integer in sequence 1: ");
		int num4a = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 1st integer in sequence 2: ");
		int num1b = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 2nd integer in sequence 2: ");
		int num2b = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 3rd integer in sequence 2: ");
		int num3b = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 4th integer in sequence 2: ");
		int num4b = input.nextInt();
		
		int sum = (num1a*num1b)+(num2a*num2b)+(num3a*num3b)+(num4a*num4b); 
		
		System.out.println("sum["+num1a+", "+num2a+", "+num3a+", "+num4a+"] * ["
				+num1b+", "+num2b+", "+num3b+", "+num4b+"] = "+sum);
		
		
		input.close();
	}

}
