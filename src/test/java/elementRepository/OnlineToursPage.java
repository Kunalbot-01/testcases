package elementRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OnlineToursPage {

	@FindBy(name="userName")
	@CacheLookup
	private WebElement userNameInputBox;
	
	@FindBy(name="password")
	@CacheLookup
	private WebElement passwordInputBox;
	
	@FindBy(name="login")
	@CacheLookup
	private WebElement loginButton;
	
	@FindBy(name="findFlights")
	@CacheLookup
	private WebElement continueButton;
	
	@FindBy(name="reserveFlights")
	@CacheLookup
	private WebElement reserveFlightsButton;
	
	@FindBy(name="passFirst0")
	@CacheLookup
	private WebElement firstNameInputBox;
	
	@FindBy(name="passLast0")
	@CacheLookup
	private WebElement lastNameInputBox;
	
	@FindBy(name="buyFlights")
	@CacheLookup
	private WebElement secureFlightsButton;

	public WebElement getUserNameInputBox() {
		return userNameInputBox;
	}

	public WebElement getPasswordInputBox() {
		return passwordInputBox;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getReserveFlightsButton() {
		return reserveFlightsButton;
	}

	public WebElement getFirstNameInputBox() {
		return firstNameInputBox;
	}

	public WebElement getLastNameInputBox() {
		return lastNameInputBox;
	}

	public WebElement getSecureFlightsButton() {
		return secureFlightsButton;
	}
	
	@FindBy(xpath="//font[contains(text(),'Details')]")
	@CacheLookup
	private WebElement detailsPageHeader;

	public WebElement getDetailsPageHeader() {
		return detailsPageHeader;
	}
	
	public OnlineToursPage() {
		// TODO Auto-generated constructor stub
	}
}
