import java.util.Scanner;

public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println(name+ ", enter your height in inches:");
		double height = input.nextDouble();
		input.nextLine();
		
		System.out.println(name+ ", enter your weight in pounds:");
		double weight = input.nextDouble();
		input.nextLine();
		
		double weightMetric = weight/2.205;
		double heightMetric = height/39.37;
		
		double bmi = weightMetric/Math.pow(heightMetric, 2.0);
		
		System.out.println(name+", your BMI is " +bmi);
		
		if(bmi<18.5) {
			System.out.println("You are underweight.");
		}else if(bmi>=18.5&&bmi<25.0) {
			System.out.println("You have a normal BMI");
		}else if(bmi>=25.0&&bmi<30.0) {
			System.out.println("You are overweight.");
		}else
			System.out.println("You are obese.");
		
		input.close();

	}

}
