package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.Users_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(mExpanse.Listener.CustomListener.class)
public class UsersTC extends BaseClass {
    LogInTC login = new LogInTC();
    Users_Impl users = new Users_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }
    @Test(priority = 1)
    public void correctMailCorrectPass(){
        login.correctMailCorrectPass();
    }

    @Test(priority = 2)
    public void uiElementVerification() throws InterruptedException {
        users.navigationToUsers(driver);
        users.guiVerification(driver);
    }

    @Test(priority = 3)
    public void CheckMandatoryFieldsAreBlank() throws InterruptedException {
        users.checkBlankMandatoryFields(driver);
    }

    @Test(priority = 4)
    public void checkEmailWithIncorrectFormat() throws InterruptedException {
        users.checkEmailWithIncorrectFormat(driver);
    }
    @Test(priority = 5)
    public void CheckCancelButtonClosesDrawer()  {
        users.checkCancelButtonClosesDrawer(driver);
    }
    @Test(priority = 6)
    public void checkForSubmitterApprovesAndForwardsToNotDisplaying() throws InterruptedException  {
        //users.navigationToUsers(driver);
        users.checkForSubmitterApprovesAndForwardsToNotDisplaying(driver) ;
    }
    @Test(priority = 7)
    public void CheckCrossButtonClosesDrawer()  {
        //users.navigationToUsers(driver);
        users.checkCloseButtonClosesDrawer(driver);
    }
    @Test(priority = 8)
    public void addRandomUserByTakingInput() throws InterruptedException {
        //users.navigationToUsers(driver);
        users.addRandomUser(driver, "Admin") ;
    }
    @Test(priority = 9)
    public void addNewAdminSelectingAllTheFields() throws InterruptedException {
        //users.navigationToUsers(driver);
        users.addNewAdmin(driver);
    }
    @Test(priority = 10)
    public void successfullyCreateNewDesignation() throws InterruptedException{
        //users.navigationToUsers(driver);
        users.createNewDesignation(driver, "Approver");
    }
    @Test(priority = 11)
    public void createNewUserForFutureDate() throws InterruptedException {
        //users.navigationToUsers(driver);
        users.addUserForFutureDate(driver, "Approver");
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }
}
