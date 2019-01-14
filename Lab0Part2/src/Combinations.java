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
		
		System.out.println("("+num4+", "+str4+")");
		System.out.println("("+num3+", "+str4+")");
		System.out.println("("+num2+", "+str4+")");
		System.out.println("("+num1+", "+str4+")");
		System.out.println("("+num4+", "+str3+")");
		System.out.println("("+num3+", "+str3+")");
		System.out.println("("+num2+", "+str3+")");
		System.out.println("("+num1+", "+str3+")");
		System.out.println("("+num4+", "+str2+")");
		System.out.println("("+num3+", "+str2+")");
		System.out.println("("+num2+", "+str2+")");
		System.out.println("("+num1+", "+str2+")");
		System.out.println("("+num4+", "+str1+")");
		System.out.println("("+num3+", "+str1+")");
		System.out.println("("+num2+", "+str1+")");
		System.out.println("("+num1+", "+str1+")");
		
		input.close();

	}

}
