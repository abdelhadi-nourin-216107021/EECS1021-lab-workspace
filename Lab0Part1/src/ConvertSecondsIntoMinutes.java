import java.util.Scanner;

public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("What is your name?");
	String name = input.nextLine();
	
	System.out.println("Enter and integer for seconds: ");
	int sec = input.nextInt();
	input.nextLine();
	
	int min = sec/60;
	int secs = min%60;
	
	System.out.println(name + ", your input " +sec+" seconds can be divided into " +
	min+ " minutes and "+secs+ " seconds." );

	}

}
