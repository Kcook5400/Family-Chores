import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Aug 29, 2021
 */
public class FamilyMembersTest {
	
	FamilyMembers son = new FamilyMembers();
	FamilyMembers daughter = null;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNotNull() {
		assertNotNull(son);
	}
	@Test
	public void testNull() {
		assertNull(daughter);
	}
	@Test
	public void testFamilyMemberSetup() {
		daughter = new FamilyMembers("Eleanor",4,"Daughter");
		
		assertNotNull(daughter);
	}
	@Test
	public void testFamilyMembertoString() {
		son.setAge(11);
		son.setName("Emerson");
		son.setRole("Son");
		assertEquals(son.toString(),"FamilyMembers [Name=Emerson, age=11, role=Son]");
	}
	
}
