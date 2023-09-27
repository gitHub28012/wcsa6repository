package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericPackage.WorkLib;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class UsersPage {
	
	// it is use to store all WebElement of users page
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement create_new_user_Button;
	@FindBy(name = "username") private WebElement usernameTB;
	@FindBy(name = "passwordText") private WebElement passwordTB;
	@FindBy(name = "passwordTextRetype") private WebElement retypePassTB;
	@FindBy(name = "firstName") private WebElement FirstNameTB;
	@FindBy(name = "lastName") private WebElement LastNameTB;
	@FindBy(name = "rightGranted[12]") private WebElement rightGrantedCheckBox;
	@FindBy(name = "rightGranted[2]") private WebElement manageCust_ProCheckBox;
	@FindBy(name = "rightGranted[1]") private WebElement generateReportsCheckBox;
	@FindBy(name = "rightGranted[5]") private WebElement manageUserCheckBox;
	@FindBy(name = "rightGranted[7]") private WebElement manageBillingTypesCheckBox;
	@FindBy(name = "rightGranted[10]") private WebElement manageWSCheckBox;
	@FindBy(xpath = "//input[@value='   Create User   ']") private WebElement createUserButton;
	@FindBy(xpath = "(//td[@class='listtblcell']/a)[2]") private WebElement usersListLink;
	@FindBy(xpath = "//input[@value='Delete This User']") private WebElement deleteThisUserButton;
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	
	
	public WebElement getCreate_new_user_Button() {
		return create_new_user_Button;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRetypePassTB() {
		return retypePassTB;
	}

	public WebElement getFirstNameTB() {
		return FirstNameTB;
	}

	public WebElement getLastNameTB() {
		return LastNameTB;
	}

	public WebElement getRightGrantedCheckBox() {
		return rightGrantedCheckBox;
	}

	public WebElement getManageCust_ProCheckBox() {
		return manageCust_ProCheckBox;
	}

	public WebElement getGenerateReportsCheckBox() {
		return generateReportsCheckBox;
	}

	public WebElement getManageUserCheckBox() {
		return manageUserCheckBox;
	}

	public WebElement getManageBillingTypesCheckBox() {
		return manageBillingTypesCheckBox;
	}

	public WebElement getManageWSCheckBox() {
		return manageWSCheckBox;
	}


	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	
	
	public WebElement getUsersListLink() {
		return usersListLink;
	}




	public WebElement getDeleteThisUserButton() {
		return deleteThisUserButton;
	}




	public void createManagerMethod(String username,String Password,String fn,String ln)
	{
		create_new_user_Button.click();
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(Password);
		retypePassTB.sendKeys(Password);
		FirstNameTB.sendKeys(fn);
		LastNameTB.sendKeys(ln);
		
	}
	
	public void managerAccessMethod()
	{
		rightGrantedCheckBox.click();
		manageCust_ProCheckBox.click();
		generateReportsCheckBox.click();
		manageUserCheckBox.click();
		manageBillingTypesCheckBox.click();
		manageWSCheckBox.click();
		createUserButton.click();
	}
	
	public void deleteManagerMethod()
	{
		usersListLink.click();
		deleteThisUserButton.click();
        WorkLib wb = new WorkLib();
        wb.handleConfirmtionPopup();
	}

}
