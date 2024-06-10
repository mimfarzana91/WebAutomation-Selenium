package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface EditReport_Interface {

    void navigateToReportDetails(WebDriver driver);

    void guiVerificationReportDetailsScreen(WebDriver driver) throws InterruptedException;

    void navigateToEditReport(WebDriver driver) throws InterruptedException;

    void editReport(WebDriver driver) throws InterruptedException;

    void verifyEditReportChangedReportDetails(WebDriver driver);

    void verifyEditReportWithoutInputtingOptionalField(WebDriver driver);

    void verifyMandatoryFieldAlert(WebDriver driver) throws InterruptedException;


}
