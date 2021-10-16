import java.security.SecureRandom;
import java.util.Random;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter {
	private boolean active;
	private String intelligenceType;
//	private static int count;
	
	public NonPlayerCharacter() {
		super();
		setActive(false);
		setIntelligenceType("AVERAGE");
	}//end empty-argument constructor
	
	public NonPlayerCharacter(String id, String personality, boolean active, String intelligenceType) {
		super(id, personality);
		setActive(active);
		setIntelligenceType(intelligenceType);
	}//end preferred constructor
	
	public boolean isActive() {
		return active;
	}//end isActive
	public void setActive(boolean active) {
		this.active = active;
	}//end setActive
	public String getIntelligenceType() {
		return intelligenceType;
	}//end getIntelligenceType
	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}//end setIntelligenceType
	
	public String reportStructure() {
		StringBuilder sb = new StringBuilder();
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		return super.reportStructure()+sb.toString();
	}//end reportStructure
	
	public String introduce() {
		return "Hello, my name is "+uniqueID;
	}//end introduce
	
	public String exclaim() {
		final String [] str = {"Dag Gummit", "Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		
		Random random = new Random();
		int indx = random.nextInt(5);
		
		return str[indx];
	}//end exclaim
	

}//end class
