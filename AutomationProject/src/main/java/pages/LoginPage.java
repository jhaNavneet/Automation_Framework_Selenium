package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.WaitUtility;
import utility.WebElementUtility;

import javax.xml.xpath.XPath;

public class LoginPage {



    WebDriver driver;

   /* @FindBy(xpath = "//a[text()='Forgot your password?']")
    WebElement forgotPasswordLink;

    @FindBy(xpath = "//input[@id='input-30']")
    WebElement emailInput;

    @FindBy(xpath = "//button[text()='RESET']")
    WebElement resetButton;

    @FindBy(xpath = "//h2[text()='Now check your email']")
    WebElement checkEmail;
*/
    @FindBy(xpath = "//span[text()='Incorrect email or password. Please try again']")  //inValidPassword
    WebElement inValidPassword;


    @FindBy(xpath = "//input[@data-id='inputUsername']")
    WebElement userNameTextBox;

    @FindBy(xpath = "//input[@data-id='inputPassword']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[text()=' Login']")
    WebElement LoginBtn;

   /* public void clickOnForgotPasswordLink(){
        forgotPasswordLink.click();
    }

    public void enterEmailForPasswordReset(String email){
        emailInput.sendKeys(email);

    }
    public void submitPasswordResetRequest(){
        resetButton.click();
    }

    public String getTextMsg(){
        WaitUtility.waitUntilElementToBeVisible(driver,checkEmail);
        return WebElementUtility.getTextElement(checkEmail);
    }
*/


    public String getTextErroMsg(){          // inValidPassword
        WaitUtility.waitUntilElementToBeVisible(driver,inValidPassword);
        return WebElementUtility.getTextElement(inValidPassword);
    }

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setLogin(String userName, String password) {
        WaitUtility.waitUntilElementToBeClickable(driver, userNameTextBox);
        userNameTextBox.sendKeys(userName);
        WaitUtility.waitUntilElementToBeClickable(driver, passwordTextBox);
        passwordTextBox.sendKeys(password);
        WaitUtility.waitUntilElementToBeClickable(driver,LoginBtn);



    }
}

