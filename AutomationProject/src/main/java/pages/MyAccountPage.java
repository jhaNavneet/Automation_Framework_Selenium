package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.WebElementUtility;

public class MyAccountPage {
    WebDriver driver;
    @FindBy(xpath = "//h2[text()='My Profile']")
    WebElement myProfile;

    public MyAccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public  String grtTextOfMyProfile(){
        return WebElementUtility.getTextElement(myProfile);
    }
}
