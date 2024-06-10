package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface EditExpanse_Interface {

    //void navigateToNewExpanse(WebDriver driver) throws InterruptedException;
    //void guiVerification(WebDriver driver)throws InterruptedException;
    String[] createUnreportedExpanse(WebDriver driver)throws InterruptedException;
    void openEditUnreportedExpanse(WebDriver driver)throws InterruptedException;
    //void openReportedExpanse(WebDriver driver)throws InterruptedException;
    String[] editExpanse(WebDriver driver)throws InterruptedException;


}
