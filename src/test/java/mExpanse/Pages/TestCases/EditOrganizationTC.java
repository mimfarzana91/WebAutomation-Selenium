package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpance.Library.Operations;
import mExpanse.Pages.Implementation.CreateOrganization_Impl;
import mExpanse.Pages.Implementation.EditOrganization_Impl;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.OrganizationListView_Impl;
import mExpanse.Pages.ObjectRepository.EditOrganizationOR;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EditOrganizationTC extends BaseClass {

    LogIn_Impl login = new LogIn_Impl();
    EditOrganization_Impl editOrg = new EditOrganization_Impl();
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
    public void verifyCreateNewOrganizationAndNavigateToEditOrganizationForm() throws InterruptedException {

        createOrg.navigateToCreateOrganization(driver);
        String organizationName = createOrg.createOrganization(driver);
        editOrg.navigateToEditOrganizationForm(driver, organizationName);

    }

    @Test(priority = 3)
    public void verifyGuiElements()  {

        editOrg.guiVerification(driver);

    }

    @Test(priority = 4)
    public void verifyMandatoryFieldCheck()  {

        editOrg.mandatoryFieldCheck(driver);

    }

    @Test(priority = 5)
    public void verifyEditOrganizationFunctionality() throws InterruptedException {

        Operations.clear(EditOrganizationOR.Locator.OrganizationNameField, driver);
        editOrg.editOrganization(driver);
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }


}
