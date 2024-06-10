package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.CreateOrganization_Impl;
import mExpanse.Pages.Implementation.LogIn_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateOrganizationTC extends BaseClass {

    LogIn_Impl logInTC = new LogIn_Impl();
    CreateOrganization_Impl createOrganizationTC = new CreateOrganization_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void login() throws InterruptedException {

        logInTC.correctMailCorrectPass(driver,getMail("submitterEmail1"),getPassword("submitterPassword1"),"Admin");

    }

    @Test(priority = 2)
    public void verifyUserCanNavigateToCreateOrganizationModal() throws InterruptedException {
        createOrganizationTC.navigateToCreateOrganization(driver);
    }

    @Test (priority = 3)
    public void verifyGUIElementsofOrganizationCreateForm() throws InterruptedException {
        createOrganizationTC.guiVerification(driver);
    }

    @Test (priority = 4)
    public void verifyMandatoryFields() throws InterruptedException {
        createOrganizationTC.mandatoryFieldCheck(driver);
    }

    @Test (priority = 5)
    public void verifyOrganizationCreateSuccessfully () throws InterruptedException {
        createOrganizationTC.createOrganization(driver);
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }

}
