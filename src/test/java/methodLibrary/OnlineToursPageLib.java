package methodLibrary;

import org.openqa.selenium.support.PageFactory;

import elementRepository.OnlineToursPage;
import genericLibrary.DriverConfiguration;
import genericLibrary.ScreenshotUtility;

public class OnlineToursPageLib {

	ScreenshotUtility sutility = new ScreenshotUtility();
	public OnlineToursPageLib(){
		
	}
	
	OnlineToursPage onlineToursPage = PageFactory.initElements(DriverConfiguration.driver, OnlineToursPage.class);
	public void enterUserCredentials(String userName, String password) throws Exception{
		try{
			onlineToursPage.getUserNameInputBox().sendKeys(userName);
			onlineToursPage.getPasswordInputBox().sendKeys(password);
			onlineToursPage.getLoginButton().click();
			sutility.takeSnapShot(DriverConfiguration.driver, "userLoggedIn");
		}
		catch(Exception e){
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "User_NotLoggedIn");
		}
	}
	public void clickFindFlightsButton() throws Exception{
		try{
		onlineToursPage.getContinueButton().click();
		Thread.sleep(3000);
		onlineToursPage.getReserveFlightsButton().click();
		}
		catch(Exception e){
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "UnableToClickContinueButton");
		}
	}
	
	public void enterPassengerDetails(String firstName,String lastName) throws Exception{
		try{
			onlineToursPage.getFirstNameInputBox().sendKeys(firstName);
			onlineToursPage.getLastNameInputBox().sendKeys(lastName);
			onlineToursPage.getSecureFlightsButton().click();
		}
		catch(Exception e){
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "UnableToEnterUserDetails");
		}
	}
	
	public boolean validateIfUserIsLoggedIn() throws Exception{
		boolean b = false;
		try{
			if(onlineToursPage.getDetailsPageHeader().isDisplayed()){
				b = true;
			}
		}
		catch(Exception e){
			ScreenshotUtility.takeSnapShot(DriverConfiguration.driver, "UserNotLoggedIn");
		}
		return b;
	}
}
