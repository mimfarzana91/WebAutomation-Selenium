package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.CreateOrganization_Impl;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.OrganizationListView_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrganizationListViewTC extends BaseClass {

    LogIn_Impl login = new LogIn_Impl();
    CreateOrganization_Impl createOrg = new CreateOrganization_Impl();
    OrganizationListView_Impl orgLV = new OrganizationListView_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void login() throws InterruptedException {

        login.correctMailCorrectPass(driver,getMail("submitterEmail1"),getPassword("submitterPassword1"),"Admin");

    }

    @Test(priority = 2)
    public void verifyGUIElements()  {

        orgLV.guiVerification(driver);

    }

    @Test(priority = 3)
    public void verifyCreatedOrganization() throws InterruptedException {

        createOrg.navigateToCreateOrganization(driver);
        String organizationName = createOrg.createOrganization(driver);
        orgLV.verifyCreatedOrganization(driver,organizationName);

    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }
}
