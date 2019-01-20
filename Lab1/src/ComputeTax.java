import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println(name+ ", enter your filing status  (1 - Single Filing; 2 - Married Filing):");
		int filing = input.nextInt();
		input.nextLine();
		
		if(filing == 1) {
			System.out.print("Enter your taxable income: ");
			int income = input.nextInt();
			input.nextLine();
			
			if(income > 33950) {
				double part1 = 8350*0.10;
				double part2 = 25600*0.15;
				double part3 = (income-33950)*0.25;
				double taxedIncome = part1+part2+part3;
				
				System.out.println(name+ ", you should pay $" +taxedIncome);
				System.out.println("Calculation is based on the scheme of Single Filing:");
				System.out.println("Part I: $" +part1+ "\nPart II: $" +part2+ "\nPart III: $" +part3 );
			}else if(income < 33950 && income > 8351) {
				double part1 = 8350*0.10;
				double part2 = (income-8350)*0.15;
				double taxedIncome = part1+part2;
				
				System.out.println(name+ ", you should pay $" +taxedIncome);
				System.out.println("Calculation is based on the scheme of Single Filing:");
				System.out.println("Part I: $" +part1+ "\nPart II: $" +part2);
			}else if(income < 8350) {
				double part1 = (income)*0.10;
				
				System.out.println(name+ ", you should pay $" +part1);
				System.out.println("Calculation is based on the scheme of Single Filing:");
				System.out.println("Part I: $" +part1);
			}
			
		}else if(filing == 2) {
			System.out.print("Enter your taxable income: ");
			int income = input.nextInt();
			input.nextLine();
			
			if(income > 67900) {
				double part1 = 16700*0.10;
				double part2 = 51200*0.15;
				double part3 = (income-67900)*0.25;
				double taxedIncome = part1+part2+part3;
				
				System.out.println(name+ ", you should pay $" +taxedIncome);
				System.out.println("Calculation is based on the scheme of Married Filing:");
				System.out.println("Part I: $" +part1+ "\nPart II: $" +part2+ "\nPart III: $" +part3 );
			}else if(income < 67900 && income > 16701) {
				double part1 = 8350*0.10;
				double part2 = (income-16700)*0.15;
				double taxedIncome = part1+part2;
				
				System.out.println(name+ ", you should pay $" +taxedIncome);
				System.out.println("Calculation is based on the scheme of Married Filing:");
				System.out.println("Part I: $" +part1+ "\nPart II: $" +part2);
			}else if(income < 16700) {
				double part1 = (income)*0.10;
				
				System.out.println(name+ ", you should pay $" +part1);
				System.out.println("Calculation is based on the scheme of Married Filing:");
				System.out.println("Part I: $" +part1);
			}
		}else {
			System.out.println("Illegal Status: " +filing);
		}
	}

}
