import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		//quiz
		System.out.println(name+ ", what is your score for Quiz 1 (out of 100)?");
		int quiz1 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Quiz 2 (out of 100)?");
		int quiz2 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Quiz 3 (out of 100)?");
		int quiz3 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Quiz 4 (out of 100)?");
		int quiz4 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Quiz 5 (out of 100)?");
		int quiz5 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Quiz 6 (out of 100)?");
		int quiz6 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Quiz 7 (out of 100)?");
		int quiz7 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Quiz 8 (out of 100)?");
		int quiz8 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Quiz 9 (out of 100)?");
		int quiz9 = input.nextInt();
		input.nextLine();
		
		//assignments
		System.out.println(name+ ", what is your score for Assingment 1 (out of 100)?");
		int ass1 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Assingment 2 (out of 100)?");
		int ass2 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Assingment 3 (out of 100)?");
		int ass3 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Assingment 4 (out of 100)?");
		int ass4 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Assingment 5 (out of 100)?");
		int ass5 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Assingment 6 (out of 100)?");
		int ass6 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Assingment 7 (out of 100)?");
		int ass7 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Assingment 8 (out of 100)?");
		int ass8 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Assingment 9 (out of 100)?");
		int ass9 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Assingment 10 (out of 100)?");
		int ass10 = input.nextInt();
		input.nextLine();
		
		//Lab tests
		System.out.println(name+ ", what is your score for Lab Test 1 (out of 100)?");
		int test1 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Lab Test 2 (out of 100)?");
		int test2 = input.nextInt();
		input.nextLine();
		
		System.out.println(name+ ", what is your score for Lab Test 3 (out of 100)?");
		int test3 = input.nextInt();
		input.nextLine();

		//midterm
		System.out.println(name+ ", what is your midterm score (out of 100)?");
		int midterm = input.nextInt();
		input.nextLine();
		
		//exam
		System.out.println(name+ ", what is your final exam score (out of 100)?");
		int exam = input.nextInt();
		input.nextLine();
		
		//course
		System.out.println(name+ ", which course are you talking about?");
		String course = input.nextLine();
		
		//output
		System.out.println(name+", here is your grade report for " +course);
		System.out.println("-----------------------------------------");
		
		//quiz output
		System.out.println("Quiz 1: " +quiz1);
		System.out.println("Quiz 2: " +quiz2);
		System.out.println("Quiz 3: " +quiz3);
		System.out.println("Quiz 4: " +quiz4);
		System.out.println("Quiz 5: " +quiz5);
		System.out.println("Quiz 6: " +quiz6);
		System.out.println("Quiz 7: " +quiz7);
		System.out.println("Quiz 8: " +quiz8);
		System.out.println("Quiz 9: " +quiz9);
		
		//assignment output
		System.out.println("-----------------------------------------");
		
		System.out.println("Assignment 1: " +ass1);
		System.out.println("Assignment 2: " +ass2);
		System.out.println("Assignment 3: " +ass3);
		System.out.println("Assignment 4: " +ass4);
		System.out.println("Assignment 5: " +ass5);
		System.out.println("Assignment 6: " +ass6);
		System.out.println("Assignment 7: " +ass7);
		System.out.println("Assignment 8: " +ass8);
		System.out.println("Assignment 9: " +ass9);
		System.out.println("Assignment 10: " +ass10);
		
		//lab test output
		System.out.println("-----------------------------------------");
		
		System.out.println("Lab Test 1: " +test1);
		System.out.println("Lab Test 2: " +test2);
		System.out.println("Lab Test 3: " +test3);
		
		//midterm and exam output
		System.out.println("-----------------------------------------");
		
		System.out.println("Midterm Test " +midterm);
		System.out.println("Final Exam: " +exam);
		
		System.out.println("-----------------------------------------");
		
		//calculations
		double quizRaw = (quiz1*0.02)+(quiz2*0.02)+(quiz3*0.02)+(quiz4*0.02)+(quiz5*0.02)+(quiz6*0.02)+(quiz7*0.02)+(quiz8*0.02)+(quiz9*0.02);
		double assRaw = (ass1*0.02)+(ass2*0.02)+(ass3*0.02)+(ass4*0.02)+(ass5*0.02)+(ass6*0.02)+(ass7*0.02)+(ass8*0.02)+(ass9*0.02)+(ass10*0.02);
		double testRaw = (test1*0.04)+(test2*0.04)+(test3*0.04);
		double quizAvg = (quiz1+quiz2+quiz3+quiz4+quiz5+quiz6+quiz7+quiz8+quiz9)/9;
		double assAvg = (ass1+ass2+ass3+ass4+ass5+ass6+ass7+ass8+ass9+ass10)/10;
		double testAvg = (test1+test2+test3)/3;
		
		double midtermFinal = midterm*0.15;
		double examFinal = exam*0.35;
		double total = quizRaw + assRaw + testRaw + midtermFinal + examFinal;
		
		System.out.println("Average of quizzes: "+ quizAvg);
		System.out.println("Average of assignments: "+ assAvg);
		System.out.println("Average of lab tests: "+ testAvg);
		System.out.print("Final raw marks: " + total);
		
		input.close();
		
	}

}
