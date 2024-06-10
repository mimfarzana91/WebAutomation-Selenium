package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface PendingApprovalList_Interface {

    public void navigateToApprovals(WebDriver driver) throws InterruptedException;
    public void guiVerification(WebDriver driver) ;
    public void paginationVerification(WebDriver driver);
    public void sortingVerification(WebDriver driver)throws InterruptedException;
    public void SubmittedReportVerification(WebDriver driver)throws InterruptedException;

    }
