package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpance.Library.Operations;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.NewExpanse_Impl;
import mExpanse.Pages.Implementation.NewReport_Impl;
import mExpanse.Pages.Implementation.SubmitReport_Impl;
import mExpanse.Pages.ObjectRepository.NewExpanseOR;
import mExpanse.Pages.ObjectRepository.NewReportOR;
import mExpanse.Pages.ObjectRepository.PendingApprovalListOR;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(mExpanse.Listener.CustomListener.class)

public class SubmitReportTC extends BaseClass {

    LogIn_Impl logInTC = new LogIn_Impl();
    NewExpanse_Impl newExpanse = new NewExpanse_Impl();
    NewReport_Impl newReport=new NewReport_Impl();
    SubmitReport_Impl submitReport = new SubmitReport_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void login() throws InterruptedException {
        logInTC.correctMailCorrectPass(driver,getMail("submitterEmail1"),getPassword("submitterPassword1"),"Admin");

        //login.correctMailCorrectPass(driver,getMail("email"),getPassword("password"),"Admin");
    }

    @Test(priority = 2)
    public void verifyNavigateToSubmitReportModal() throws InterruptedException {

        newReport.navigateToMyViewReports(driver);
        newReport.navigateToNewReport(driver);
        String reportName=newReport.createValidNewReport(driver);
        Operations.sleep(5000);
        Operations.click(Operations.modificationXpath("a","ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4",reportName), driver);
        String reportNumber=Operations.getText(NewReportOR.Locator.reportNo,driver);
        Operations.click(NewExpanseOR.locator.expanse,driver);
        Operations.click(NewExpanseOR.locator.newExpanseBtn,driver);
        newExpanse.createNewExpanseWithReimbursement(driver,reportNumber);
        submitReport.navigatetoSubmitReport(driver,reportName);

    }


    @Test(priority = 3)
    public void verifyGUIElements() {
        submitReport.guiVerification(driver);
    }


    @Test(priority = 4)
    public void verifyReportNotSubmittedError() throws InterruptedException {
        submitReport.submitReportWOApprover(driver);
    }



    @Test(priority = 5)
    public void verifySubmitValidReport() throws InterruptedException {
        submitReport.submitValidReport(driver);
    }
    @Test(priority = 6)
    public void verifySubmitWoExReport() throws InterruptedException {
        Operations.click(NewReportOR.Locator.sideNavSubMenuReport, driver);
        newReport.navigateToNewReport(driver);
        String reportName=newReport.createValidNewReport(driver);
        Operations.sleep(5000);
        Operations.click(Operations.modificationXpath("a","ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4",reportName), driver);
        submitReport.submitWOExPenceReport(driver);
    }

    /*
    @Test(priority = 6)
    public void verifySubmitValidReportWPSApprover() throws InterruptedException {
        submitReport.submitValidReportWPSApprover(driver);
    }
    */

   /* @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }*/
}