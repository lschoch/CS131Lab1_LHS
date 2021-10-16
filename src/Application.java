import java.text.NumberFormat;

/**
 * This is the Application object that will launch our application
 * @author Rob Kelley
 * @version 1.3
 * Lab1 
 * CS131ON
 */
public class Application {

	public static void main(String[] args) {
		
		NonPlayerCharacter npc = new NonPlayerCharacter();
		//Uncomment the line below to ensure reportStructure() method works after you have written it.
		System.out.println(npc.reportStructure());
		System.out.println();
		
		// Demonstrate npc.introduce().
		System.out.println(npc.introduce());
		System.out.println();
		
		// Print npc.exclaim() six times to show that it picks randomly from the set of five phrases
		for (int i=0; i<6; i++) {
			System.out.println(npc.exclaim());
		}
		System.out.println();
		
		// Instantiate BasketballTeam and demonstrate the toString() and getStats() methods
		NumberFormat nf = NumberFormat.getPercentInstance();
		nf.setMinimumFractionDigits(1);
		BasketballTeam hoops = new BasketballTeam("Hoopsters", "The Hoop Man", "Rick Johnson");
		hoops.setWins(40);
		hoops.setLosses(65);
		hoops.setFieldGoals(4500);
		hoops.setFieldGoalsAttempted(7000);
		hoops.setFreeThrows(983);
		hoops.setFreeThrowsAttempted(1150);
		double [] gs = new double[3];
		gs = hoops.getStats();
		
		System.out.println(hoops.toString());
		System.out.println();
		System.out.println(hoops.teamName+" stats:");
		System.out.println(" winning percentage "+nf.format(gs[0]));
		System.out.println(" field goal percentage "+nf.format(gs[1]));
		System.out.println(" free throw percentage "+nf.format(gs[2]));
		
	}//end main

}//end class