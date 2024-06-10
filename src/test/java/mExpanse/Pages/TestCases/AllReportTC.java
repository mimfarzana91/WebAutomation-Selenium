package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.AllReport_Impl;
import mExpanse.Pages.Implementation.LogIn_Impl;
import mExpanse.Pages.ObjectRepository.AllReportOR;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AllReportTC extends BaseClass {
    AllReport_Impl AllReports = new AllReport_Impl();
    LogIn_Impl login= new LogIn_Impl();

    @BeforeClass
    public void setupDriver(){
        setUp();
    }

    @Test(priority = 1)
    public void login(){
        login.correctMailCorrectPass(driver,getMail("approverEmail1"),getPassword("approverPass1"),"Approver");

    }
    @Test(priority = 2)
    public void navigateToPendingApprovals() throws InterruptedException {
        AllReports.navigateToPending(driver);
    }
    @Test(priority = 3)
    public void ApproveReport() throws InterruptedException {
        AllReports.ApprovingReport(driver);
    }
    @Test(priority = 4)
    public void navigateToAllReports() throws InterruptedException {
        AllReports.navigateToApprovals(driver);
    }
    @Test(priority = 5)
    public void guiVerification() throws InterruptedException {
        AllReports.guiVerificationOfAllReports(driver);

    }

    @Test(priority = 6)
    public void paginationCheck() throws InterruptedException {
        AllReports.paginationVerification(driver);
    }

}

