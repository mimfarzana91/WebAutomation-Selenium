package mExpanse.Pages.Interface;

import org.openqa.selenium.WebDriver;

public interface SubmitReport_Interface {

    public void navigatetoSubmitReport (WebDriver driver ,String reportName)throws InterruptedException;

    void guiVerification (WebDriver driver)throws InterruptedException;



    void submitReportWOApprover (WebDriver driver)throws InterruptedException;

     void submitValidReport (WebDriver driver) throws InterruptedException ;
    void submitWOExPenceReport (WebDriver driver)throws InterruptedException;



}
