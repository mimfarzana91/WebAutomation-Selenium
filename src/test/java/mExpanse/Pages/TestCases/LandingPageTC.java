package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpance.Library.Operations;
import mExpanse.Pages.Implementation.LandingPage_Impl;
import mExpanse.Pages.Implementation.LogIn_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)
public class LandingPageTC extends BaseClass {

    LogIn_Impl login= new LogIn_Impl();
    LandingPage_Impl landingPage= new LandingPage_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }


    @Test(priority = 1)
    public void guiValidationForNewUser() throws InterruptedException {
        landingPage.guiValidationForNewUser(driver);
        Operations.sleep(1000);
        landingPage.verifyLogout(driver);
    }
    @Test(priority = 2)
    public void correctMailCorrectPass(){
        String mail=getMail("adminEmail");
        String pass=getPassword("adminPass");
        login.correctMailCorrectPass(driver, mail, pass,"Admin");
    }
    @Test(priority = 3)
    public void guiValidationForExistingUser() throws InterruptedException {
        landingPage.guiValidationForExistingUser(driver);
    }

    @Test(priority = 4)
    public void verifySideMenuArrowClick() throws InterruptedException {
        landingPage.verifySideMenuArrowClick(driver);
    }
    @Test(priority = 5)
    public void verifyOrgDropdown() throws InterruptedException {
        landingPage.verifyOrgDropdown(driver);
    }
    @Test(priority = 6)
    public void verifyNotificationPanel() throws InterruptedException {
        landingPage.verifyNotificationPanel(driver);
    }
    @Test(priority = 7)
    public void verifyLanguageDropdown() throws InterruptedException {
        landingPage.verifyLanguageDropdown(driver);
    }
    @Test(priority = 8)
    public void verifyLogout() throws InterruptedException {
        landingPage.verifyLogout(driver);
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }
}