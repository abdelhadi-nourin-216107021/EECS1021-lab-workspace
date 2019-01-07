import java.util.Scanner;

public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer for radius: ");
		int i = input.nextInt();
		input.nextLine();
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		double area = i*i*3.14;
		double per = 2*3.14*i;
		
		System.out.println(name +", your input circle with radius " +i+
				" has perimeter " +per+ " and area " +area);
		
		input.close();

	}

}
