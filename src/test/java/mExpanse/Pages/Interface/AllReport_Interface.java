package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface AllReport_Interface {
    public void navigateToApprovals(WebDriver driver);
    public void guiVerificationOfAllReports(WebDriver driver) throws InterruptedException;
    public void navigateToPending(WebDriver driver);
    public void paginationVerification(WebDriver driver) throws InterruptedException;
    public void ApprovingReport(WebDriver driver) throws InterruptedException;
}

