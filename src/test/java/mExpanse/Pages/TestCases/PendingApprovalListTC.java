package mExpanse.Pages.TestCases;

import mExpance.Library.BaseClass;
import mExpanse.Pages.Implementation.LogIn_Impl;

import mExpanse.Pages.Implementation.PendingApprovalList_Impl;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PendingApprovalListTC extends BaseClass {

    PendingApprovalList_Impl pendingApprovals = new PendingApprovalList_Impl();
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
        pendingApprovals.navigateToApprovals(driver);
    }
    @Test(priority = 3)
    public void guiVerification(){
        pendingApprovals.guiVerification(driver);
    }
    @Test(priority = 4)
    public void paginationCheck() throws InterruptedException {
        pendingApprovals.paginationVerification(driver);
    }
    @Test(priority = 5)
    public void sortingCheck() throws InterruptedException {
        pendingApprovals.sortingVerification(driver);
    }
    @Test(priority = 6)
    public void submittedReportCheck() throws InterruptedException {
        pendingApprovals.SubmittedReportVerification(driver);
    }

}
