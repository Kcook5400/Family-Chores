import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Aug 29, 2021
 */
public class TestRunner {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
			
		}
		System.out.println(result.wasSuccessful());
	}

}

