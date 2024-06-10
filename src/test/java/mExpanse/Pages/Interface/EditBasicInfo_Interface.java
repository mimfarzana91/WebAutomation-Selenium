package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface EditBasicInfo_Interface {

    public void guiValidation(WebDriver driver)throws InterruptedException;
    public void nameVerification(WebDriver driver)throws InterruptedException;
    public void emailVerification(WebDriver driver)throws InterruptedException;
    public void empIdVerification(WebDriver driver)throws InterruptedException;
    public void mobileVerification(WebDriver driver)throws InterruptedException;
    public void dateOfJoiningVerification(WebDriver driver)throws InterruptedException;
    public void dateOfBirthVerification(WebDriver driver)throws InterruptedException;
    public void roleNameVerification(WebDriver driver)throws InterruptedException;
    public void saveButtonVerification(WebDriver driver)throws InterruptedException;
    public void cancelButtonVerification(WebDriver driver)throws InterruptedException;

}
