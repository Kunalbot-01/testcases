package test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import genericLibrary.DriverConfiguration;
import methodLibrary.OnlineToursPageLib;
public class TestOne extends TestTwo {
	
	@Test
	public void bookTicket() throws Exception{
		onlineToursPageLib.enterUserCredentials("rahul8", "rahul8");
		onlineToursPageLib.clickFindFlightsButton();
		onlineToursPageLib.enterPassengerDetails("abcd", "def");
	}
	@Test
	public void validateCredentialsOfUser() throws Exception{
		onlineToursPageLib.enterUserCredentials("rahul8", "rahul8");
		Assert.assertTrue(onlineToursPageLib.validateIfUserIsLoggedIn(), "User is not logged into the application");
	}
	
	
	public TestOne() {
		// TODO Auto-generated constructor stub
	}
}
