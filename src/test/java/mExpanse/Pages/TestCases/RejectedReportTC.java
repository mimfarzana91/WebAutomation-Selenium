package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpance.Library.Operations;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.Implementation.RejectedReport_Impl;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RejectedReportTC extends BaseClass {

    LogIn_Impl login= new LogIn_Impl();

    RejectedReport_Impl rejectReport = new  RejectedReport_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void login(){
        login.correctMailCorrectPass(driver,getMail("approverEmail2"),getPassword("approverPass1"),"Approver");

    }

    @Test(priority = 2)
    public void navigateToMyView() throws InterruptedException {
        rejectReport.navigateToMyView(driver);
    }

    @Test(priority = 3)
    public void  uiVerification() throws InterruptedException {
        rejectReport.guiVerification(driver);
    }
    @Test(priority = 4)
    public void  rejectFlow() throws InterruptedException {
        rejectReport.rejectFlow(driver);
    }
    @Test(priority = 5)
    public void  rejectBlankText() throws InterruptedException {
        rejectReport.rejectReasonBlankText(driver);
    }

    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }

}
