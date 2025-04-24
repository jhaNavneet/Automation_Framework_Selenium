package testclasses;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

import testbase.WebTestBase;

public class LoginTest extends WebTestBase {

    public HomePage homepage;
    public LoginPage loginpage;
    public MyAccountPage myaccountpage;



    public LoginTest(){
        super();
    }

    @BeforeMethod
    public  void setUp(){
        Initialization();

        homepage = new HomePage(driver);
        loginpage = new LoginPage(driver);
        myaccountpage = new MyAccountPage(driver);




    }
/*
    @Test(description = "verify login with valid username and valid password")
    public void verifyLoginWithValidCredential(){
        SoftAssert soft = new SoftAssert();
        homepage.clickOnAcceptCookies();
        homepage.clickOnClosedAd();
        homepage.clickOnUserLogo();
        loginpage.setLogin(prop.getProperty("username"), prop.getProperty("password") );
        homepage.clickOnUserLogo1();
        soft.assertEquals(myaccountpage.grtTextOfMyProfile(),"MY PROFILE","MY PROFILE text should be matched");
        soft.assertAll();
*/
  @Test(description = "verify login with valid username and invalid password")
    public void verifyLoginWithValidusernameinvalidpassword(){
        SoftAssert soft = new SoftAssert();
        homepage.clickOnAcceptCookies();
        homepage.clickOnClosedAd();
        homepage.clickOnUserLogo();
        loginpage.setLogin(prop.getProperty("username"), prop.getProperty("invalidpassword") );
        homepage.clickOnUserLogo1();




   /* @Test(description = "verify forgot password functionality with valid email")
    public void verifyForgotPasswordWithValidEmail(){
        SoftAssert soft = new SoftAssert();
        homepage.clickOnAcceptCookies();
        homepage.clickOnClosedAd();
        homepage.clickOnUserLogo();
        loginpage.clickOnForgotPasswordLink();
        forgotPasswordPage.enterEmail(prop.getProperty("username"));
        forgotPasswordPage.clickOnSendResetLink();
        String successMsg =forgotPasswordPage.getSuccessMessage();
        soft.assertTrue(successMsg.contains("reset email has been sent"), "Reset message mismatch!");
        soft.assertAll();
*/
    }



    @AfterMethod
    public void tearDown(){
       driver.close();

    }
}
