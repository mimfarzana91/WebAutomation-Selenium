package mExpanse.Pages.Implementation;

import com.thedeanda.lorem.LoremIpsum;
import mExpance.Library.Operations;
import mExpanse.Pages.Interface.EditReport_Interface;
import mExpanse.Pages.Interface.NewReport_Interface;
import mExpanse.Pages.ObjectRepository.EditReportOR;
import mExpanse.Pages.ObjectRepository.NewReportOR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditReport_Impl implements EditReport_Interface {

    public String reportName, businessPurpose, fromDate, toDate;

    public void navigateToReportDetails(WebDriver driver){
        Operations.verifyElementIsDisplayed(EditReportOR.Locator.tableDataReportName, driver);
        Operations.click(EditReportOR.Locator.tableDataReportName, driver);
    }

    public void guiVerificationReportDetailsScreen(WebDriver driver) throws InterruptedException {
        Thread.sleep(5000);
        Operations.waitUntilElementIsVisible(EditReportOR.Locator.reportDetailsScreenReportName, driver);
        Operations.verifyElementIsDisplayed(EditReportOR.Locator.reportDetailsScreenReportName, driver);
        Operations.waitUntilElementIsVisible(EditReportOR.Locator.reportDetailsScreenBusinessPurpose, driver);
        Operations.verifyElementIsDisplayed(EditReportOR.Locator.reportDetailsScreenBusinessPurpose, driver);
        Operations.waitUntilElementIsVisible(EditReportOR.Locator.reportDetailsScreenFromDuration, driver);
        Operations.verifyElementIsDisplayed(EditReportOR.Locator.reportDetailsScreenFromDuration, driver);
        Operations.waitUntilElementIsVisible(EditReportOR.Locator.reportDetailsScreenToDuration, driver);
        Operations.verifyElementIsDisplayed(EditReportOR.Locator.reportDetailsScreenToDuration, driver);
        reportName = Operations.getText(EditReportOR.Locator.reportDetailsScreenReportName, driver);
        businessPurpose = Operations.getText(EditReportOR.Locator.reportDetailsScreenBusinessPurpose, driver);
        fromDate = Operations.getText(EditReportOR.Locator.reportDetailsScreenFromDuration, driver);
        toDate = Operations.getText(EditReportOR.Locator.reportDetailsScreenToDuration, driver);
        System.out.println(reportName);
        System.out.println(businessPurpose);
        System.out.println(fromDate);
        System.out.println(toDate);
        Operations.verifyElementIsDisplayed(EditReportOR.Locator.reportDetailsHistoryTab,driver);
        Operations.click(EditReportOR.Locator.reportDetailsHistoryTab,driver);
        Operations.verifyElementIsDisplayed(EditReportOR.Locator.reportDetailsExpensesTab,driver);
        Operations.click(EditReportOR.Locator.reportDetailsExpensesTab,driver);

    }

    public void navigateToEditReport(WebDriver driver){
        Operations.verifyElementIsDisplayed(EditReportOR.Locator.reportDetailsScreenEditButton, driver);
        Operations.click(EditReportOR.Locator.reportDetailsScreenEditButton, driver);

    }

    public void editReport(WebDriver driver) {
        LoremIpsum ipsum = new LoremIpsum();
        String reportName = ipsum.getWords(2,3);
        String businessPurpose = ipsum.getWords(3,4);

        Operations.waitUntilElementIsVisible(EditReportOR.Locator.drawerTitleEditReport, driver);
        Operations.verifyElementIsDisplayed(EditReportOR.Locator.drawerTitleEditReport, driver);

        Operations.click(NewReportOR.Locator.reportNameField, driver);
        Operations.clear(NewReportOR.Locator.reportNameField, driver);
        Operations.sendText(NewReportOR.Locator.reportNameField, reportName, driver);

        Operations.click(NewReportOR.Locator.businessPurposeField, driver);
        Operations.sendText(NewReportOR.Locator.businessPurposeField, businessPurpose, driver);

        Operations.click(NewReportOR.Locator.fromDateField, driver);
        Operations.waitUntilElementIsVisible(NewReportOR.Locator.fromDateTable, driver);
        Operations.selectRandomDateFromDatePicker(NewReportOR.Locator.fromDateTable, 5, 15, driver);
        Operations.click(EditReportOR.Locator.toDate, driver);
        Operations.clear(EditReportOR.Locator.toDate, driver);
        Operations.selectRandomDateFromDatePicker(EditReportOR.Locator.toDateTable,20,28, driver);

        Operations.click(EditReportOR.Locator.saveButton, driver);

        Operations.waitUntilElementIsVisible(EditReportOR.Locator.editSubmitAlert, driver);
        Operations.matchText(EditReportOR.Locator.editSubmitAlert,EditReportOR.UIElementConstant.editSubmitAlert , driver);


    }

    public void verifyEditReportChangedReportDetails(WebDriver driver){
        assert Operations.getText(EditReportOR.Locator.reportDetailsScreenReportName, driver) != reportName;
        assert Operations.getText(EditReportOR.Locator.reportDetailsScreenBusinessPurpose, driver) != businessPurpose;
        assert Operations.getText(EditReportOR.Locator.reportDetailsScreenFromDuration, driver) != fromDate;

    }

    public void verifyMandatoryFieldAlert(WebDriver driver) throws InterruptedException {
        LoremIpsum ipsum = new LoremIpsum();
        String reportName = ipsum.getWords(2,3);

        Operations.click(NewReportOR.Locator.reportNameField, driver);
        Operations.sendText(NewReportOR.Locator.reportNameField, reportName, driver);
        Operations.clear(NewReportOR.Locator.reportNameField, driver);
        Thread.sleep(3000);

        Operations.waitUntilElementIsVisible(EditReportOR.Locator.saveButton, driver);
        Operations.click(EditReportOR.Locator.saveButton, driver);
        Operations.waitUntilElementIsVisible(NewReportOR.Locator.fieldReportNameErrorAlert, driver);
        Operations.matchText(NewReportOR.Locator.fieldReportNameErrorAlert,NewReportOR.UIElementConstant.fieldReportNameErrorAlert , driver);
        Operations.matchColor(NewReportOR.Locator.fieldReportNameErrorAlert, "#ff4d4f", "color", driver);


    }

    public void verifyEditReportWithoutInputtingOptionalField(WebDriver driver) {
        LoremIpsum ipsum = new LoremIpsum();
        String reportName = ipsum.getWords(2,3);
        String businessPurpose = ipsum.getWords(3,4);

        Operations.waitUntilElementIsVisible(EditReportOR.Locator.drawerTitleEditReport, driver);
        Operations.verifyElementIsDisplayed(EditReportOR.Locator.drawerTitleEditReport, driver);

        Operations.click(NewReportOR.Locator.reportNameField, driver);
        Operations.clear(NewReportOR.Locator.reportNameField, driver);
        Operations.sendText(NewReportOR.Locator.reportNameField, reportName, driver);

        Operations.click(NewReportOR.Locator.businessPurposeField, driver);
        Operations.clear(NewReportOR.Locator.businessPurposeField, driver);

        Operations.click(NewReportOR.Locator.fromDateField, driver);
        Operations.clear(NewReportOR.Locator.fromDateField, driver);
        Operations.enter(NewReportOR.Locator.fromDateField, driver);
        Operations.click(EditReportOR.Locator.toDate, driver);
        Operations.clear(EditReportOR.Locator.toDate, driver);
        Operations.enter(EditReportOR.Locator.toDate, driver);

        Operations.click(EditReportOR.Locator.saveButton, driver);

        Operations.waitUntilElementIsVisible(EditReportOR.Locator.editSubmitAlert, driver);
        Operations.matchText(EditReportOR.Locator.editSubmitAlert,EditReportOR.UIElementConstant.editSubmitAlert , driver);

    }



}
