package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.WaitUtility;

public class HomePage {

    WebDriver driver;

    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptAllCookies;

    @FindBy(xpath = "//button[@title='Close']")
    WebElement closeAd;

    @FindBy(xpath = "//img[@alt='user avatar']")
    WebElement userLogo;

    @FindBy(xpath = "//img[@alt='user avatar']")
    WebElement userLogo1;


    public HomePage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }
    public void clickOnAcceptCookies(){
        WaitUtility.waitUntilElementToBeClickable(driver, acceptAllCookies);
    }

    public void clickOnClosedAd(){
        WaitUtility.waitUntilElementToBeClickable(driver, closeAd);
    }

    public void clickOnUserLogo(){
        WaitUtility.waitUntilElementToBeClickable(driver, userLogo);
    }

    public void clickOnUserLogo1(){
        try {
            WaitUtility.waitUntilElementToBeClickable(driver, userLogo1);
        } catch (StaleElementReferenceException s){
            s.printStackTrace();
        }
        driver.navigate().refresh();
        WaitUtility.waitUntilElementToBeClickable(driver, userLogo1);

    }



}
