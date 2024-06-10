package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.EditBasicInfo_Impl;
import mExpanse.Pages.Implementation.LogIn_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)
public class EditBasicInfoTC extends BaseClass {

    LogIn_Impl login= new LogIn_Impl();
    EditBasicInfo_Impl editUserInfo= new EditBasicInfo_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void correctMailCorrectPass(){
        String mail=getMail("adminEmail");
        String pass=getPassword("adminPass");
        login.correctMailCorrectPass(driver,mail,pass,"Admin");
    }

    @Test(priority = 2)
    public void guiValidation() throws InterruptedException {
        editUserInfo.guiValidation(driver);
    }
    @Test(priority = 3)
    public void nameFieldVerification() throws InterruptedException {
        editUserInfo.nameVerification(driver);
    }
    @Test(priority = 4)
    public void emailFieldVerification() throws InterruptedException {
        editUserInfo.emailVerification(driver);
    }
    @Test(priority = 5)
    public void empIdFieldVerification() throws InterruptedException {
        editUserInfo.empIdVerification(driver);
    }
    @Test(priority = 6)
    public void mobileFieldVerification() throws InterruptedException {
        editUserInfo.mobileVerification(driver);
    }
    @Test(priority = 7)
    public void dateOfJoiningFieldVerification() throws InterruptedException {
        editUserInfo.dateOfJoiningVerification(driver);
    }
    @Test(priority = 8)
    public void dateOfBirthFieldVerification() throws InterruptedException {
        editUserInfo.dateOfBirthVerification(driver);
    }
    @Test(priority = 9)
    public void roleNameFieldVerification() throws InterruptedException {
        editUserInfo.roleNameVerification(driver);
    }
    @Test(priority = 10)
    public void saveButtonVerification() throws InterruptedException {
        editUserInfo.saveButtonVerification(driver);
    }
    @Test(priority = 11)
    public void cancelButtonVerification() throws InterruptedException {
        editUserInfo.cancelButtonVerification(driver);
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }
}