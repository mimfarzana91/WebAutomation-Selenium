package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface RejectedReport_Interface {

    public void navigateToMyView(WebDriver driver) throws InterruptedException;
    public void guiVerification(WebDriver driver)throws InterruptedException;
    public void rejectFlow(WebDriver driver)throws InterruptedException;
    public void rejectReasonBlankText(WebDriver driver)throws InterruptedException;
}
