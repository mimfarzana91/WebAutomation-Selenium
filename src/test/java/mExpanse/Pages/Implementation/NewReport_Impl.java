/**
 * Owner: Eftiar
 * Ticket-no:
 * Modifier-name:
 * Ticket-no:
 **/

package mExpanse.Pages.Implementation;

import com.thedeanda.lorem.LoremIpsum;
import mExpance.Library.Operations;
import mExpanse.Pages.Interface.NewReport_Interface;
import mExpanse.Pages.ObjectRepository.NewReportOR;
import org.openqa.selenium.WebDriver;

public class NewReport_Impl implements NewReport_Interface {

    public void navigateToMyViewReports(WebDriver driver) {

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.sideNavMenuMyView, driver);
        Operations.click(NewReportOR.Locator.sideNavMenuMyView, driver);
        Operations.waitUntilElementIsVisible(NewReportOR.Locator.sideNavSubMenuReport, driver);
        Operations.verifyElementIsDisplayed(NewReportOR.Locator.sideNavSubMenuReport, driver);
        Operations.click(NewReportOR.Locator.sideNavSubMenuReport, driver);
        Operations.verifyElementIsDisplayed(NewReportOR.Locator.newReportCTA, driver);

    }

    public void navigateToNewReport(WebDriver driver) {
        Operations.click(NewReportOR.Locator.newReportCTA, driver);
        Operations.waitUntilElementIsVisible(NewReportOR.Locator.drawerTitleNewReport, driver);
        Operations.verifyElementIsDisplayed(NewReportOR.Locator.drawerTitleNewReport, driver);

    }

    public void guiVerification(WebDriver driver) {
        Operations.verifyElementIsDisplayed(NewReportOR.Locator.drawerTitleNewReport, driver);
        Operations.matchText(NewReportOR.Locator.drawerTitleNewReport,NewReportOR.UIElementConstant.drawerTitleNewReport, driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.drawerCloserBTN, driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.fieldTitleReportName, driver);
        Operations.matchText(NewReportOR.Locator.fieldTitleReportName,NewReportOR.UIElementConstant.fieldTitleReportName, driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.fieldTitleBusinessPurpose, driver);
        Operations.matchText(NewReportOR.Locator.fieldTitleBusinessPurpose,NewReportOR.UIElementConstant.fieldTitleBusinessPurpose, driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.fieldTitleDurationFrom, driver);
        Operations.matchText(NewReportOR.Locator.fieldTitleDurationFrom,NewReportOR.UIElementConstant.fieldTitleDurationFrom, driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.fieldTitleDurationTo, driver);
        Operations.matchText(NewReportOR.Locator.fieldTitleDurationTo,NewReportOR.UIElementConstant.fieldTitleDurationTo, driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.reportNameField, driver);
        Operations.matchAttribute(NewReportOR.Locator.reportNameField,NewReportOR.UIElementConstant.reportNameField,"placeholder", driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.businessPurposeField, driver);
        Operations.matchAttribute(NewReportOR.Locator.businessPurposeField,NewReportOR.UIElementConstant.businessPurposeField,"placeholder", driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.fromDateField, driver);
        Operations.matchAttribute(NewReportOR.Locator.fromDateField,NewReportOR.UIElementConstant.fromDateField,"placeholder", driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.toDateField, driver);
        Operations.matchAttribute(NewReportOR.Locator.toDateField,NewReportOR.UIElementConstant.toDateField,"placeholder", driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.saveButton, driver);
        Operations.matchText(NewReportOR.Locator.saveButton,NewReportOR.UIElementConstant.saveButton, driver);

        Operations.verifyElementIsDisplayed(NewReportOR.Locator.cancelButton, driver);
        Operations.matchText(NewReportOR.Locator.cancelButton,NewReportOR.UIElementConstant.cancelButton, driver);

    }

    public void verifyDrawerCancelButton(WebDriver driver){
        Operations.verifyElementIsDisplayed(NewReportOR.Locator.drawerCloserBTN, driver);
        Operations.click(NewReportOR.Locator.drawerCloserBTN, driver);

    }

    public String createValidNewReport(WebDriver driver) throws InterruptedException {
        LoremIpsum ipsum = new LoremIpsum();
        String reportName = ipsum.getWords(2,3);
        String businessPurpose = ipsum.getWords(3,4);

        Operations.waitUntilElementIsVisible(NewReportOR.Locator.drawerTitleNewReport, driver);
        Operations.verifyElementIsDisplayed(NewReportOR.Locator.drawerTitleNewReport, driver);

        Operations.click(NewReportOR.Locator.reportNameField, driver);
        Operations.sendText(NewReportOR.Locator.reportNameField, reportName, driver);

        Operations.click(NewReportOR.Locator.businessPurposeField, driver);
        Operations.sendText(NewReportOR.Locator.businessPurposeField, businessPurpose, driver);

        Operations.click(NewReportOR.Locator.fromDateField, driver);
        Operations.waitUntilElementIsVisible(NewReportOR.Locator.fromDateTable, driver);
        Operations.selectRandomDateFromDatePicker(NewReportOR.Locator.fromDateTable, 1, 3, driver);

        Operations.click(NewReportOR.Locator.toDateField, driver);
        Operations.waitUntilElementIsVisible(NewReportOR.Locator.toDateTable, driver);
        Operations.selectRandomDateFromDatePicker(NewReportOR.Locator.toDateTable, 16, 19, driver);

        Thread.sleep(3000);
        Operations.click(NewReportOR.Locator.saveButton, driver);

        Operations.waitUntilElementIsVisible(NewReportOR.Locator.creationSubmitAlert, driver);
        Operations.matchText(NewReportOR.Locator.creationSubmitAlert,NewReportOR.UIElementConstant.creationSubmitAlert , driver);
        //String reportNo=Operations.getText(NewReportOR.Locator.reportNo, driver);

        return reportName;

    }

    public void verifyCancelCreatingReport(WebDriver driver) {
        LoremIpsum ipsum = new LoremIpsum();
        String reportName = ipsum.getWords(2,3);
        String businessPurpose = ipsum.getWords(3,4);

        Operations.click(NewReportOR.Locator.reportNameField, driver);
        Operations.sendText(NewReportOR.Locator.reportNameField, reportName, driver);

        Operations.click(NewReportOR.Locator.businessPurposeField, driver);
        Operations.sendText(NewReportOR.Locator.businessPurposeField, businessPurpose, driver);

        Operations.click(NewReportOR.Locator.fromDateField, driver);
        Operations.waitUntilElementIsVisible(NewReportOR.Locator.fromDateTable, driver);
        Operations.selectRandomDateFromDatePicker(NewReportOR.Locator.fromDateTable, 1, 15, driver);

        Operations.click(NewReportOR.Locator.toDateField, driver);
        Operations.waitUntilElementIsVisible(NewReportOR.Locator.toDateTable, driver);
        Operations.selectRandomDateFromDatePicker(NewReportOR.Locator.toDateTable, 16, 28, driver);

        Operations.click(NewReportOR.Locator.cancelButton, driver);
        Operations.waitUntilElementIsVisible(NewReportOR.Locator.newReportCTA, driver);
        assert !Operations.verifyElementIsPresent(NewReportOR.Locator.creationSubmitAlert, driver);

    }

    public void verifyReportCreationWithoutInputtingOptionalField(WebDriver driver) {
        LoremIpsum ipsum = new LoremIpsum();
        String reportName = ipsum.getWords(2,3);

        Operations.click(NewReportOR.Locator.reportNameField, driver);
        Operations.sendText(NewReportOR.Locator.reportNameField, reportName, driver);

        Operations.click(NewReportOR.Locator.saveButton, driver);

        Operations.waitUntilElementIsVisible(NewReportOR.Locator.creationSubmitAlert, driver);
        Operations.matchText(NewReportOR.Locator.creationSubmitAlert,NewReportOR.UIElementConstant.creationSubmitAlert , driver);

    }

    public void verifyMandatoryFieldAlert(WebDriver driver) {
        LoremIpsum ipsum = new LoremIpsum();
        String reportName = ipsum.getWords(2,3);

        Operations.click(NewReportOR.Locator.reportNameField, driver);
        Operations.sendText(NewReportOR.Locator.reportNameField, reportName, driver);
        Operations.clear(NewReportOR.Locator.reportNameField, driver);

        Operations.waitUntilElementIsVisible(NewReportOR.Locator.saveButton, driver);
        Operations.click(NewReportOR.Locator.saveButton, driver);
        Operations.waitUntilElementIsVisible(NewReportOR.Locator.fieldReportNameErrorAlert, driver);
        Operations.matchText(NewReportOR.Locator.fieldReportNameErrorAlert,NewReportOR.UIElementConstant.fieldReportNameErrorAlert , driver);
        Operations.matchColor(NewReportOR.Locator.fieldReportNameErrorAlert, "#ff4d4f", "color", driver);


    }

}
