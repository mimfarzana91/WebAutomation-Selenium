package mExpanse.Pages.TestCases;

import mExpanse.Pages.Implementation.SignUp_Impl;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import mExpance.Library.BaseClass;

@Listeners(mExpanse.Listener.CustomListener.class)

public class SignUpTC extends BaseClass{


    SignUp_Impl signUp = new SignUp_Impl();

    @BeforeClass
    public void setupDriver(){

        setUp();
    }

    @Test(priority = 1)
    public void uiElementVerification(){

        signUp.guiVerification(driver);

    }

    @Test(priority = 2)
    public void alertVerification() throws InterruptedException{

        signUp.alertVerification(driver);


    }

    @Test(priority = 3)
    public void alreadyRegisteredEmailVerification() throws InterruptedException{

        signUp.alreadyRegisteredEmailVerification(driver);
    }

    @Test(priority = 4)
    public void passwordAlerts()throws InterruptedException{

        signUp.passwordAlerts(driver);
    }

    @Test(priority = 5)
    public void validRegistration() throws InterruptedException{

        signUp.validRegistration(driver);
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();

    }
}


