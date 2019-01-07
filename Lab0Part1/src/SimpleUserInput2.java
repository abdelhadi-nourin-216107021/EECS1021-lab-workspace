import java.util.Scanner;

public class SimpleUserInput2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double first = input.nextDouble();
		input.nextLine(); 
		
		System.out.print("Enter the second number: ");
		double second = input.nextDouble();
		input.nextLine();
		
		System.out.print("What is your name? ");
		String name = input.nextLine();
		
		double avg = (first+second)/2;
		
		System.out.println(first + "\n" +second +"\n"+ name);
		System.out.print("average of the two numbers is: " + avg);

	}

}
