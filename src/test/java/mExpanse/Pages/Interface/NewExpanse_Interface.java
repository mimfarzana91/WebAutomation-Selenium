package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface NewExpanse_Interface {

    void navigateToNewExpanse(WebDriver driver) throws InterruptedException;
    void guiVerification(WebDriver driver)throws InterruptedException;
    void requiredFieldCheck(WebDriver driver)throws InterruptedException;

    String[] createNewExpanseWithReimbursement(WebDriver driver,String reportName )throws InterruptedException;
    void createNewExpanseWithoutReimbursement(WebDriver driver)throws InterruptedException;
    String createNewExpanseWithoutReport(WebDriver driver)throws InterruptedException;
    void createNewExpanseWithMultipleItem(WebDriver driver)throws InterruptedException;

}