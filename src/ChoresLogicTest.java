import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Aug 29, 2021
 */
public class ChoresLogicTest {
	ChoresLogic chore = new ChoresLogic();
	Chores dishes = new Chores();
	FamilyMembers son = new FamilyMembers();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testisChoreDoneNo() {
		assertEquals(chore.isChoreDone(dishes), "No");
	
	}
	@Test
	public void testisChoreDoneYes() {
		dishes.setStatus(true);
		assertEquals(chore.isChoreDone(dishes), "Yes");
	
	}
	@Test
	public void testChoreDifficult() {
		dishes.setAgeRequirement(10);
		dishes.setTimeToComplete(3);
		
		assertEquals(chore.choreDifficulty(dishes), 30);
		
	}
	@Test
	public void testAgelevelNo() {
		son.setAge(11);
		dishes.setAgeRequirement(12);
		
		assertEquals(chore.isAgeLevelOkay(dishes, son), "No");
		
	}
	@Test
	public void testAgeleveYes() {
		son.setAge(11);
		dishes.setAgeRequirement(10);
		
		assertEquals(chore.isAgeLevelOkay(dishes, son), "Yes");
		
	}

}
