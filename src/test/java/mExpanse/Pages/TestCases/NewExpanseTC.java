
package mExpanse.Pages.TestCases;
import mExpance.Library.BaseClass;
import mExpance.Library.Operations;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.NewExpanse_Impl;
import mExpanse.Pages.Implementation.NewReport_Impl;
import mExpanse.Pages.ObjectRepository.NewExpanseOR;
import mExpanse.Pages.ObjectRepository.NewReportOR;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)

public class NewExpanseTC extends BaseClass {
    NewExpanse_Impl newExpanse = new NewExpanse_Impl();
    NewReport_Impl newReport=new NewReport_Impl();
    LogIn_Impl login= new LogIn_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void login() throws InterruptedException {
        login.correctMailCorrectPass(driver,getMail("submitterEmail1"),getPassword("submitterPassword1"),"Admin");

        //login.correctMailCorrectPass(driver,getMail("email"),getPassword("password"),"Admin");
    }

    @Test(priority = 2)
    public void navigateToNewExpanse() throws InterruptedException {
        newExpanse.navigateToNewExpanse(driver);
    }

    @Test(priority = 3)
    public void uiVerification() throws InterruptedException {
        newExpanse.guiVerification(driver);
    }

    @Test(priority = 4)
    public void requiredFieldVerification() throws InterruptedException {
        newExpanse.requiredFieldCheck(driver);
        Operations.click(NewExpanseOR.locator.cancelBtn,driver);
    }

    @Test(priority = 5)
    public void createNewExpanseWithReimbursement() throws InterruptedException {
        Operations.click(NewReportOR.Locator.sideNavSubMenuReport, driver);
        Operations.verifyElementIsDisplayed(NewReportOR.Locator.newReportCTA, driver);
        newReport.navigateToNewReport(driver);
        String reportName=newReport.createValidNewReport(driver);
        Operations.sleep(5000);
        Operations.click(Operations.modificationXpath("a","ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4",reportName), driver);
        String reportNumber=Operations.getText(NewReportOR.Locator.reportNo,driver);
        Operations.click(NewExpanseOR.locator.expanse,driver);
        Operations.click(NewExpanseOR.locator.newExpanseBtn,driver);
        newExpanse.createNewExpanseWithReimbursement(driver,reportNumber);
    }

    @Test(priority = 6)
    public void createNewExpanseWithoutReimbursement() throws InterruptedException {
        newExpanse.createNewExpanseWithoutReimbursement(driver);
    }

    @Test(priority = 7)
    public void createNewExpanseWithMultipleItem() throws InterruptedException {
        newExpanse.createNewExpanseWithMultipleItem(driver);
    }

    @Test(priority = 8)
    public void createUnreportedExpense() throws InterruptedException {
        Operations.click(NewExpanseOR.locator.newExpanseBtn,driver);
        newExpanse.createNewExpanseWithoutReport(driver);
    }


    @AfterClass
    public void  testCaseTearDown() {

        tearDown();
    }
}

