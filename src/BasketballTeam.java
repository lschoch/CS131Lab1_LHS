
public class BasketballTeam extends SportsTeam {
	private int fieldGoals;
	private int fieldGoalsAttempted;
	private int freeThrows;
	private int freeThrowsAttempted;
	
	public BasketballTeam() {
		super();
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}//end empty-argument constructor
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super(teamName, teamMascot, headCoach);
		this.fieldGoals = 0;
		this.fieldGoalsAttempted = 0;
		this.freeThrows = 0;
		this.freeThrowsAttempted = 0;
	}//end preferred constructor
	
	@Override
	public String toString() {
		return "BasketballTeam [teamName="+teamName+", teamMascot="+teamMascot+", headCoach="+headCoach+"\n"+
				"wins="+wins+", losses="+losses+", fieldGoals="+fieldGoals+", fieldGoalsAttempted="+fieldGoalsAttempted+", freeThrows="+
				freeThrows+", freeThrowsAttempted="+freeThrowsAttempted;
	}

	public int getFieldGoals() {
		return fieldGoals;
	}//end getFieldGoals

	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}//end setFieldGoals

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}//end getFieldGoalsAttemp;ted

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}//end setFieldGoalsAttempted

	public int getFreeThrows() {
		return freeThrows;
	}//end getFreeThrows

	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}//end setFreeThrow

	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}//end getFreeThrowsAttempted

	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}//end setFreeThrowsAttempted
	
	public int getWins() {
		return wins;
	}//end getWins
	
	public void setWins(int wins) {
		this.wins = wins;
	}//end setWins
	
	public int getLosses() {
		return losses;
	}//end getLosses
	
	public void setLosses(int losses) {
		this.losses = losses;
	}//end setLosses
	
	public double fieldGoalPercentage() {
		if (fieldGoalsAttempted>0) {
			return (double) fieldGoals/fieldGoalsAttempted;
		} else {
			return 0.0;
		}
	}//end fieldGoalPercentage
	
	public double freeThrowPercentage() {
		if (freeThrowsAttempted>0) {
			return (double) freeThrows/freeThrowsAttempted;
		} else {
			return 0.0;
		}
	}//end free/ThrowPercentage
	
	public double [] getStats() {
		double [] gs = new double[3];
		gs[0] = super.getWinPercentage();
		gs[1] = fieldGoalPercentage();
		gs[2] = freeThrowPercentage();
		return gs;
	}//end getStats
	

}//end class
