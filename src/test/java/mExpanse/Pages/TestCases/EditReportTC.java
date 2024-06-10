package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpance.Library.Operations;
import mExpanse.Pages.Implementation.EditReport_Impl;
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


public class EditReportTC extends BaseClass {
    NewReport_Impl newReport = new NewReport_Impl();
    EditReport_Impl editReport = new EditReport_Impl();
    LogIn_Impl login= new LogIn_Impl();
    NewExpanse_Impl newExpanse= new NewExpanse_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void login(){
        login.correctMailCorrectPass(driver,getMail("submitterEmail1"),getPassword("submitterPassword1"),"Admin");
    }

    @Test(priority = 2)
    public void verifyReportDetailsScreen() throws InterruptedException {
        Operations.click(NewReportOR.Locator.sideNavMenuMyView, driver);
        Operations.click(NewReportOR.Locator.sideNavSubMenuReport, driver);
        Operations.verifyElementIsDisplayed(NewReportOR.Locator.newReportCTA, driver);
        newReport.navigateToNewReport(driver);
        String reportName=newReport.createValidNewReport(driver);
        Operations.sleep(5000);
        Operations.click(Operations.modificationXpath("a","ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4",reportName), driver);
        String reportNumber=Operations.getText(NewReportOR.Locator.reportNo,driver);
        Operations.click(NewExpanseOR.locator.expanse,driver);
        Operations.click(NewExpanseOR.locator.newExpanseBtn,driver);
        String[] text =newExpanse.createNewExpanseWithReimbursement(driver,reportNumber);
        Thread.sleep(2000);
        newReport.navigateToMyViewReports(driver);
        Thread.sleep(5000);
        editReport.navigateToReportDetails(driver);
        editReport.guiVerificationReportDetailsScreen(driver);
        By editDetailsMerchantName = Operations.modifiedXpathWithoutClass("a",text[0]);
        By editDetailsAmount = By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/section[1]/main[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/h4[1]/div[1]/span[1]");
        By editDetailsCategoryName = Operations.modifiedXpathWithoutClass("a",text[2]);
        Operations.verifyElementIsDisplayed(editDetailsMerchantName,driver);
        Operations.matchText(editDetailsMerchantName, text[0], driver);
        Operations.verifyElementIsDisplayed(editDetailsCategoryName,driver);
        Operations.matchText(editDetailsCategoryName, text[2], driver);
        Operations.verifyElementIsDisplayed(editDetailsAmount,driver);
        System.out.println(Operations.getText(editDetailsAmount,driver));
        System.out.println(Operations.getText(editDetailsMerchantName,driver));
        System.out.println(Operations.getText(editDetailsCategoryName,driver));


    }
    @Test(priority = 3)
    public void verifyEditReport() throws InterruptedException {
        editReport.navigateToEditReport(driver);
        editReport.editReport(driver);
    }

    @Test(priority = 4)
    public void verifyDetailsAfterEdit() {
        editReport.verifyEditReportChangedReportDetails(driver);
    }

    @Test(priority = 5)
    public void editReportWithoutOptionalData() {
        editReport.navigateToEditReport(driver);
        editReport.verifyEditReportWithoutInputtingOptionalField(driver);
    }

    @Test(priority = 6)
    public void requiredFieldVerification() throws InterruptedException {
        editReport.navigateToEditReport(driver);
        editReport.verifyMandatoryFieldAlert(driver);
    }


    @AfterClass
    public void  testCaseTearDown() {

        tearDown();
    }
}
