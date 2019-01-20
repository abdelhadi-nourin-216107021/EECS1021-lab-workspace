import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the name of player 1: ");
		String p1 = input.nextLine();
		
		System.out.println("Enter the name of player 2: ");
		String p2 = input.nextLine();
		
		System.out.println("========");
		System.out.println("Round 1:");
		System.out.println("========");
		
		System.out.println("What does "+p1+" play? (R, P, or S)");
		String p1Play1 = input.nextLine();
		
		System.out.println("What does "+p2+" play? (R, P, or S)");
		String p2Play1 = input.nextLine();
		
		if((p1Play1.equals("R") && p2Play1.equals("S")) || (p1Play1.equals("P") && p2Play1.equals("R")) || (p1Play1.equals("S") && p2Play1.equals("P"))) {

			System.out.println("========");
			System.out.println("Round 2:");
			System.out.println("========");
			
			System.out.println("What does "+p1+" play? (R, P, or S)");
			String p1Play2 = input.nextLine();
			
			System.out.println("What does "+p2+" play? (R, P, or S)");
			String p2Play2 = input.nextLine();
			
			if((p1Play2.equals("R") && p2Play2.equals("S")) || (p1Play2.equals("P") && p2Play2.equals("R")) || (p1Play2.equals("S") && p2Play2.equals("P"))) {
				System.out.println("Game over: " +p1+ " wins!");
			}else if((p2Play2.equals("R") && p1Play2.equals("S")) || (p2Play2.equals("P") && p1Play2.equals("R")) || (p2Play2.equals("S") && p1Play2.equals("P"))) {
				
				System.out.println("========");
				System.out.println("Round 3:");
				System.out.println("========");
				
				System.out.println("What does "+p1+" play? (R, P, or S)");
				String p1Play3 = input.nextLine();
				
				System.out.println("What does "+p2+" play? (R, P, or S)");
				String p2Play3 = input.nextLine();
				
				if((p1Play3.equals("R") && p2Play3.equals("S")) || (p1Play3.equals("P") && p2Play3.equals("R")) || (p1Play3.equals("S") && p2Play3.equals("P"))) {
					System.out.println("Game over: " +p1+ " wins!");
				}else if((p2Play3.equals("R") && p1Play3.equals("S")) || (p2Play3.equals("P") && p1Play3.equals("R")) || (p2Play3.equals("S") && p1Play3.equals("P"))) {
					System.out.println("Game over: " +p2+ " wins!");
				}else if(p1Play3.equals(p2Play3)) {
					System.out.println("Game over: a tie between "+p1+" and "+p2);
				}
			}else if(p1Play2.equals(p2Play2)) {

				System.out.println("========");
				System.out.println("Round 3:");
				System.out.println("========");
				
				System.out.println("What does "+p1+" play? (R, P, or S)");
				String p1Play4 = input.nextLine();
				
				System.out.println("What does "+p2+" play? (R, P, or S)");
				String p2Play4 = input.nextLine();
				
				if((p1Play4.equals("R") && p2Play4.equals("S")) || (p1Play4.equals("P") && p2Play4.equals("R")) || (p1Play4.equals("S") && p2Play4.equals("P"))) {
					System.out.println("Game over: " +p1+ " wins!");
				}else if((p2Play4.equals("R") && p1Play4.equals("S")) || (p2Play4.equals("P") && p1Play4.equals("R")) || (p2Play4.equals("S") && p1Play4.equals("P"))) {
					System.out.println("Game over: a tie between "+p1+" and "+p2);
				}
			}
		}else if((p2Play1 == "R" && p1Play1 == "S") || (p2Play1 == "P" && p1Play1 == "R") || (p2Play1 == "S" && p1Play1 == "P")) {
			
			System.out.println("========");
			System.out.println("Round 2:");
			System.out.println("========");
			
			System.out.println("What does "+p1+" play? (R, P, or S)");
			String p1Play5 = input.nextLine();
			
			System.out.println("What does "+p2+" play? (R, P, or S)");
			String p2Play5 = input.nextLine();
			
			if((p2Play5.equals("R") && p1Play5.equals("S")) || (p2Play5.equals("P") && p1Play5.equals("R")) || (p2Play5.equals("S") && p1Play5.equals("P"))) {
				System.out.println("Game over: " +p2+ " wins!");
			}else if((p1Play5.equals("R") && p2Play5.equals("S")) || (p1Play5.equals("P") && p2Play5.equals("R")) || (p1Play5.equals("S") && p2Play5.equals("P"))) {
			
				System.out.println("========");
				System.out.println("Round 3:");
				System.out.println("========");
				
				System.out.println("What does "+p1+" play? (R, P, or S)");
				String p1Play6 = input.nextLine();
				
				System.out.println("What does "+p2+" play? (R, P, or S)");
				String p2Play6 = input.nextLine();
				
				if((p1Play6.equals("R") && p2Play6.equals("S")) || (p1Play6.equals("P") && p2Play6.equals("R")) || (p1Play6.equals("S") && p2Play6.equals("P"))) {
					System.out.println("Game over: " +p1+ " wins!");
				}else if((p2Play6.equals("R") && p1Play6.equals("S")) || (p2Play6.equals("P") && p1Play6.equals("R")) || (p2Play6.equals("S") && p1Play6.equals("P"))) {
					System.out.println("Game over: " +p2+ " wins!");
				}else if(p1Play6.equals(p2Play6)) {
					System.out.println("Game over: a tie between "+p1+" and "+p2);
				}
			}else if(p1Play5.equals(p2Play5)) {

				System.out.println("========");
				System.out.println("Round 3:");
				System.out.println("========");
				
				System.out.println("What does "+p1+" play? (R, P, or S)");
				String p1Play7 = input.nextLine();
				
				System.out.println("What does "+p2+" play? (R, P, or S)");
				String p2Play7 = input.nextLine();
				
				if((p2Play7.equals("R") && p1Play7.equals("S")) || (p2Play7.equals("P") && p1Play7.equals("R")) || (p2Play7.equals("S") && p1Play7.equals("P"))) {
					System.out.println("Game over: " +p2+ " wins!");
				}else if((p1Play7.equals("R") && p2Play7.equals("S")) || (p1Play7.equals("P") && p2Play7.equals("R")) || (p1Play7.equals("S") && p2Play7.equals("P"))) {
					System.out.println("Game over: a tie between "+p1+" and "+p2);
				}
			}
		}else if(p1Play1.equals(p2Play1)) {
			System.out.println("========");
			System.out.println("Round 2:");
			System.out.println("========");
			
			System.out.println("What does "+p1+" play? (R, P, or S)");
			String p1Play8 = input.nextLine();
			
			System.out.println("What does "+p2+" play? (R, P, or S)");
			String p2Play8 = input.nextLine();
			
			if((p1Play8.equals("R") && p2Play8.equals("S")) || (p1Play8.equals("P") && p2Play8.equals("R")) || (p1Play8.equals("S") && p2Play8.equals("P"))) {
				System.out.println("========");
				System.out.println("Round 3:");
				System.out.println("========");
				
				System.out.println("What does "+p1+" play? (R, P, or S)");
				String p1Play9 = input.nextLine();
				
				System.out.println("What does "+p2+" play? (R, P, or S)");
				String p2Play9 = input.nextLine();
				
				if((p1Play9.equals("R") && p2Play9.equals("S")) || (p1Play9.equals("P") && p2Play9.equals("R")) || (p1Play9.equals("S") && p2Play9.equals("P"))) {
					System.out.println("Game over: " +p1+ " wins!");
				}else if((p2Play9.equals("R") && p1Play9.equals("S")) || (p2Play9.equals("P") && p1Play9.equals("R")) || (p2Play9.equals("S") && p1Play9.equals("P"))) {
					System.out.println("Game over: a tie between "+p1+" and "+p2);
				}else if(p1Play9.equals(p2Play9)) {
					System.out.println("Game over: " +p1+ " wins!");
				}
				
			}else if((p2Play8.equals("R") && p1Play8.equals("S")) || (p2Play8.equals("P") && p1Play8.equals("R")) || (p2Play8.equals("S") && p1Play8.equals("P"))) {
				System.out.println("========");
				System.out.println("Round 3:");
				System.out.println("========");
				
				System.out.println("What does "+p1+" play? (R, P, or S)");
				String p1Play10 = input.nextLine();
				
				System.out.println("What does "+p2+" play? (R, P, or S)");
				String p2Play10 = input.nextLine();
				
				if((p2Play10.equals("R") && p1Play10.equals("S")) || (p2Play10.equals("P") && p1Play10.equals("R")) || (p2Play10.equals("S") && p1Play10.equals("P"))) {
					System.out.println("Game over: " +p2+ " wins!");
				}else if((p1Play10.equals("R") && p2Play10.equals("S")) || (p1Play10.equals("P") && p2Play10.equals("R")) || (p1Play10.equals("S") && p2Play10.equals("P"))) {
					System.out.println("Game over: a tie between "+p1+" and "+p2);
				}else if(p1Play10.equals(p2Play10)) {
					System.out.println("Game over: " +p2+ " wins!");
				}
			}else if((p1Play8.equals(p2Play8))) {
				System.out.println("Game over: a tie between "+p1+" and "+p2);
			}
		}
		input.close();
	}
}
