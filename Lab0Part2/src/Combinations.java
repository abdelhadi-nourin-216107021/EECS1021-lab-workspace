import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the 1st string: ");
		String str1 = input.nextLine();
		
		System.out.println("Enter the 2nd string: ");
		String str2 = input.nextLine();
		
		System.out.println("Enter the 3rd string: ");
		String str3 = input.nextLine();
		
		System.out.println("Enter the 4th string: ");
		String str4 = input.nextLine();
		
		System.out.println("Enter the 1st integer: ");
		int num1 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 2nd integer: ");
		int num2 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 3rd integer: ");
		int num3 = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter the 4th integer: ");
		int num4 = input.nextInt();
		
		System.out.println("Here are all 16 possible combinations: ");
		
		System.out.println("("+str1+", "+num1+")");
		System.out.println("("+str1+", "+num2+")");
		System.out.println("("+str1+", "+num3+")");
		System.out.println("("+str1+", "+num4+")");
		System.out.println("("+str2+", "+num1+")");
		System.out.println("("+str2+", "+num2+")");
		System.out.println("("+str2+", "+num3+")");
		System.out.println("("+str2+", "+num4+")");
		System.out.println("("+str3+", "+num1+")");
		System.out.println("("+str3+", "+num2+")");
		System.out.println("("+str3+", "+num3+")");
		System.out.println("("+str3+", "+num4+")");
		System.out.println("("+str4+", "+num1+")");
		System.out.println("("+str4+", "+num2+")");
		System.out.println("("+str4+", "+num3+")");
		System.out.println("("+str4+", "+num4+")");
		
		input.close();

	}

}
