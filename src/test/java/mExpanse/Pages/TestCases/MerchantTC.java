package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.Merchant_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//@Listeners(mExpanse.Listener.CustomListener.class)


public class MerchantTC extends BaseClass {
    LogIn_Impl logIn = new LogIn_Impl();
    Merchant_Impl Merchant = new Merchant_Impl();
    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void verifyGuiElements() {
        logIn.correctMailCorrectPass(driver, getMail("adminEmail"), getPassword("adminPass"), "Admin");
        Merchant.navigateToAdminViewMerchant(driver);
        Merchant.navigateToAddMerchant(driver);
        Merchant.guiVerification(driver);
    }
    @Test(priority = 2)
    public void verifyMerchantCrossButton() throws InterruptedException {
        Thread.sleep(1000);

        Merchant.verifyCancelButtonMerchant(driver);

    }
    @Test(priority = 3)
    public void verifyNewMerchantCreation() throws InterruptedException {
        Thread.sleep(1000);
        Merchant.navigateToAddMerchant(driver);
        Merchant.createValidNewMerchant(driver);
        Thread.sleep(1000);

    }
    @Test(priority = 4)
    public void verifyCancelNewMerchantCreation() throws InterruptedException {
        Thread.sleep(1000);
        Merchant.navigateToAddMerchant(driver);
        Merchant.verifyCancelCreatingMerchant(driver);
        Thread.sleep(1000);

    }

    @Test(priority = 5)
    public void verifyMandatoryFieldAlert() throws InterruptedException {
        Thread.sleep(1000);
        Merchant.navigateToAddMerchant(driver);
        Merchant.verifyMandatoryFieldAlert(driver);
        Thread.sleep(1000);

    }


    @AfterTest
    public void  testCaseTearDown() {
        tearDown();

    }
}