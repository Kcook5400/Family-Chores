
/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Aug 29, 2021
 */
public class ChoresLogic {
	
	public int choreDifficulty(Chores chore) {
		int levelofDifficulty = 0;
		
		levelofDifficulty = chore.getAgeRequirement()*chore.getTimeToComplete();
		
		return levelofDifficulty;
	}
	
	public String isChoreDone(Chores chore) {
		if (chore.isStatus()==true) {
			return "Yes";
		}
		return "No";
	}
	
	public String isAgeLevelOkay(Chores chore, FamilyMembers member) {
		if(chore.getAgeRequirement() < member.getAge()) {
			return "Yes";
		}
		return "No";
	}

}
