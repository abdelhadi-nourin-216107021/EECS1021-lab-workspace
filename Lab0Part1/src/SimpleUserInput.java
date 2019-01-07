import java.util.Scanner;

public class SimpleUserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int i = input.nextInt();
		
		int square = i*i;
		
		System.out.println(square);
		
		input.close();
	}

}
