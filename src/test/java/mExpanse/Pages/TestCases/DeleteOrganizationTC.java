package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteOrganizationTC extends BaseClass {

    LogIn_Impl login = new LogIn_Impl();
    CreateOrganization_Impl createOrg = new CreateOrganization_Impl();
    DeleteOrganization_Impl deleteOrg = new DeleteOrganization_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void login() throws InterruptedException {

        login.correctMailCorrectPass(driver,getMail("submitterEmail1"),getPassword("submitterPassword1"),"Admin");

    }

    @Test(priority = 2)
    public void verifyCreateNewOrganizationAndNavigateToDeleteOrganization() throws InterruptedException {

        createOrg.navigateToCreateOrganization(driver);
        createOrg.createOrganization(driver);
        deleteOrg.navigateToDeleteOrganization(driver);

    }

    @Test(priority = 3)
    public void verifyDeleteOrganization() {
        deleteOrg.deleteOrganization(driver);
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }

}
