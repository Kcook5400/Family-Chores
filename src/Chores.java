
/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Aug 29, 2021
 */
public class Chores {
	private String Name;
	private boolean Status=false;
	int timeToComplete;
	int ageRequirement;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public int getTimeToComplete() {
		return timeToComplete;
	}
	public void setTimeToComplete(int timeToComplete)  {

		this.timeToComplete = timeToComplete;
	}
	public int getAgeRequirement() {
		return ageRequirement;
	}
	public void setAgeRequirement(int ageRequirement) {
		this.ageRequirement = ageRequirement;
	}
	/**
	 * 
	 */
	public Chores() {
		super();
	}
	/**
	 * @param name
	 * @param timeToComplete
	 * @param ageRequirement
	 */
	public Chores(String name, int timeToComplete, int ageRequirement) {
		super();
		Name = name;
		this.timeToComplete = timeToComplete;
		this.ageRequirement = ageRequirement;
	}

}
