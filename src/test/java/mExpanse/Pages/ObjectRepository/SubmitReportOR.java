package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class SubmitReportOR {

    public static class Locator {

        public static By sideNavMenuMyView =By.xpath("//*[@id=\"root\"]/section/aside/div/div[2]/div[1]/div[1]/div[2]");
        public static By sideNavSubMenuReport =By.xpath("//a[contains(text(),'Reports')]");
        public static By reportName = By.xpath("//a[contains(text(),'splendide maecenas')]");
        public static By submitCTA = By.xpath("//span[contains(text(),'Submit')]");
        public static By submitModalTitle = By.xpath("//div[contains(@class, 'ant-modal-title')]");
        public static By submitModalDrodownLabelText = By.xpath("//label[contains(@for, 'approver')]");
        public static By submitModalDropdownPlaceholderText = By.xpath("//span[contains(@class, 'ant-select-selection-placeholder')]");
        public static By approverDropdown = By.xpath("//input[@id='approver']");
        public static By selectApprover = By.xpath("//div[contains(text(),'Approver 3')]");
        public static By submitModalCloseCTA = By.xpath("//body/div[4]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/span[1]");
        public static By submitModalCancelCTA = By.xpath("//span[contains(text(),'Cancel')]");
        public static By submitModalSubmitCTA = By.cssSelector("body.ant-scrolling-effect:nth-child(2) div.ant-modal-root div.ant-modal-wrap div.ant-modal div.ant-modal-content:nth-child(2) div.ant-modal-footer button.ant-btn.ant-btn-primary:nth-child(2) > span:nth-child(1)"); ////button[contains(@class,'ant-btn ant-btn-primary')]//span[contains(text(),'Submit')]"
        public static By reportSubmittedStatus = By.xpath("//span[contains(text(),'Report submitted successfully')]");
        public static By reportStatusFlag = By.xpath("//span[contains(text(),'AWAITING APPROVAL')]");
        public static By NoExpenceAdded=By.xpath("//span[contains(text(),'No expense added to the report yet')]");
        public static By approverNotSelectedFlag = By.xpath("//div[contains(text(),'Please select the approver')]");
    }

    public static class UIElementConstant {

        public static String modalTitle = "Submit Report";
        public static String approverDropDownLabel = "YOUR REPORT WILL BE SUBMITTED TO";
        public static String approverDropdownPlaceHolder = "Select";
        public static String approverNotSelectedErrorMessage = "Please select the approver";
        public static String expenseNotAttachedErrorMessage = "This report cannot be submitted since there are no associated expenses";
        public static String reportSubmitSuccessMessage = "Report submitted successfully";
        public static String reportStatusFlagMessage = "AWAITING APPROVAL";
        public static String  NoExpenceAddedMesg="No expense added to the report yet";

    }
}
