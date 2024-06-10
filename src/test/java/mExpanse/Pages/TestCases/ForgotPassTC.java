package mExpanse.Pages.TestCases;

import mExpance.Library.Operations;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.ForgotPassword_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import mExpance.Library.BaseClass;

import java.io.IOException;


@Listeners(mExpanse.Listener.CustomListener.class)
public class ForgotPassTC extends BaseClass {

    ForgotPassword_Impl forgotpassword = new ForgotPassword_Impl();
    LogIn_Impl login= new LogIn_Impl();

    @BeforeClass
    public void setupDriver() {

        setUp();
    }

    @Test(priority = 1)
    public void uiElementVerification() throws InterruptedException {
        forgotpassword.guiVerification(driver);

    }
    @Test(priority = 2)
    public void blankMailVerification() throws InterruptedException {
        forgotpassword.blankEmailValidation(driver);

    }
    @Test(priority = 3)
    public void invalidEmailVerification() throws InterruptedException {
        forgotpassword.invalidEmailValidation(driver);

    }
    @Test(priority = 4)
    public void nonUserEmailAlert() throws InterruptedException, IOException {
        forgotpassword.nonUserEmailVerification(driver);
    }

    @Test(priority = 5)
    public void validEmailResetPassword() throws InterruptedException, IOException {
        forgotpassword.validEmailResetPassword(driver,getMail("forgotpassEmail"));
      //  System.out.println(getPassword("newPassword"));
       // System.out.println(getPassword("forgotpassEmailPass"));

    }
    @Test(priority = 6)
    public void invalidPassword() throws InterruptedException, IOException {
        forgotpassword.invalidPassword(driver);
    }

    @Test(priority = 7)
    public void resetPassword() throws InterruptedException, IOException{
        forgotpassword.resetPassword(getPassword("newPassword"),driver);
        setPassword(("forgotpassEmailPass"),getPassword("newPassword"));
        Operations.sleep(10000);
        login.correctMailCorrectPass(driver,getMail("forgotpassEmail"),getPassword("forgotpassEmailPass"),"Admin");
        Operations.sleep(10000);
        driver.switchTo().defaultContent();
    }
    @Test(priority = 8)
    public void invalidLink() throws InterruptedException, IOException{
        forgotpassword.invalidLink(driver);
        forgotpassword.notResetPassword(getPassword("newPassword"),driver);

    }
    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }

}



