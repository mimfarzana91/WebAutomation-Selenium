package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.SubmitReport_Interface;
import mExpanse.Pages.ObjectRepository.NewReportOR;
import mExpanse.Pages.ObjectRepository.PendingApprovalListOR;
import mExpanse.Pages.ObjectRepository.SubmitReportOR;
//import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
import org.openqa.selenium.WebDriver;

public class SubmitReport_Impl implements SubmitReport_Interface {

    public void navigatetoSubmitReport (WebDriver driver ,String reportName) throws InterruptedException {



        //Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.sideNavMenuMyView, driver);
       // Operations.click(NewReportOR.Locator.sideNavMenuMyView, driver);
        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.sideNavSubMenuReport, driver);
        Operations.click(NewReportOR.Locator.sideNavSubMenuReport, driver);
        Operations.sleep(5000);
        Operations.verifyElementIsDisplayed(Operations.modificationXpath("a","ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4",reportName), driver);
        Operations.click(Operations.modificationXpath("a","ReportsTable_dataCell_200__ZJ6ze ReportsTable_dataCell_ellipsis__sleh4",reportName), driver);

    }

    public void guiVerification (WebDriver driver) {

        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.submitCTA, driver);
        Operations.click(SubmitReportOR.Locator.submitCTA, driver);
        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.submitModalTitle, driver);
        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.submitModalDrodownLabelText, driver);
        Operations.matchText(SubmitReportOR.Locator.submitModalDrodownLabelText, SubmitReportOR.UIElementConstant.approverDropDownLabel, driver);
        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.approverDropdown, driver);
        Operations.verifyElementIsEnabled(SubmitReportOR.Locator.approverDropdown, driver);
        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.submitModalCloseCTA, driver);
        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.submitModalSubmitCTA, driver);
        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.submitModalCancelCTA, driver);
        Operations.click(SubmitReportOR.Locator.submitModalCancelCTA,driver);

    }

    public void submitValidReport (WebDriver driver) throws InterruptedException {
        Operations.waitUntilElementIsVisible(SubmitReportOR.Locator.submitCTA,driver);
        String userName=Operations.findElement(PendingApprovalListOR.Locator.userName,driver).getText();
        Operations.click(SubmitReportOR.Locator.submitCTA, driver);
        Operations.click(SubmitReportOR.Locator.approverDropdown, driver);
        Operations.waitUntilElementIsVisible(Operations.modificationXpath("div","ant-select-item-option-content",userName), driver);
        Operations.verifyElementIsDisplayed(Operations.modificationXpath("div","ant-select-item-option-content",userName), driver);
        Operations.click(Operations.modificationXpath("div","ant-select-item-option-content",userName), driver);
        Operations.clickusingJS(SubmitReportOR.Locator.submitModalSubmitCTA, driver);
        Operations.waitUntilElementIsVisible(SubmitReportOR.Locator.reportSubmittedStatus, driver);
        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.reportSubmittedStatus, driver);
        Operations.matchText(SubmitReportOR.Locator.reportSubmittedStatus,SubmitReportOR.UIElementConstant.reportSubmitSuccessMessage, driver);

    }
    public void submitWOExPenceReport (WebDriver driver) throws InterruptedException {
        Operations.waitUntilElementIsVisible(SubmitReportOR.Locator.submitCTA,driver);
        String userName=Operations.findElement(PendingApprovalListOR.Locator.userName,driver).getText();
        Operations.click(SubmitReportOR.Locator.submitCTA, driver);
        Operations.click(SubmitReportOR.Locator.approverDropdown, driver);
        Operations.waitUntilElementIsVisible(Operations.modificationXpath("div","ant-select-item-option-content",userName), driver);
        Operations.verifyElementIsDisplayed(Operations.modificationXpath("div","ant-select-item-option-content",userName), driver);
        Operations.click(Operations.modificationXpath("div","ant-select-item-option-content",userName), driver);
        Operations.clickusingJS(SubmitReportOR.Locator.submitModalSubmitCTA, driver);
        Operations.waitUntilElementIsVisible(SubmitReportOR.Locator.NoExpenceAdded, driver);
        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.NoExpenceAdded, driver);
        Operations.matchText(SubmitReportOR.Locator.NoExpenceAdded,SubmitReportOR.UIElementConstant.NoExpenceAddedMesg, driver);

    }

    public void submitReportWOApprover (WebDriver driver) throws InterruptedException {

        Operations.clickusingJS(SubmitReportOR.Locator.submitModalSubmitCTA, driver);
        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.approverNotSelectedFlag, driver);
        Operations.matchText(SubmitReportOR.Locator.approverNotSelectedFlag,SubmitReportOR.UIElementConstant.approverNotSelectedErrorMessage, driver);

    }

    public void submitValidReportWPSApprover (WebDriver driver) throws InterruptedException {

        Operations.verifyElementIsDisplayed(SubmitReportOR.Locator.submitModalSubmitCTA, driver);
        Operations.clickusingJS(SubmitReportOR.Locator.submitModalSubmitCTA, driver);
        Operations.waitUntilElementIsVisible(SubmitReportOR.Locator.reportStatusFlag, driver);
        Operations.matchText(SubmitReportOR.Locator.reportStatusFlag,SubmitReportOR.UIElementConstant.reportStatusFlagMessage, driver);
    }

}