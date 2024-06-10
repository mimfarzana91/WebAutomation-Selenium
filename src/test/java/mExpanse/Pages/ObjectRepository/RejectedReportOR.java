package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class RejectedReportOR {

    public static class Locator {

        public static By ReportName = By.xpath("//tbody/tr[2]/td[3]/div[1]/div[1]/h4[1]/div[1]/div[1]/a[1]");
        public static By RejectButton = By.xpath("//span[contains(text(),'Reject')]");
        public static By RejectReason = By.xpath("//textarea[@id='reason']");
        public static By RejectConfirm = By.xpath("//button[@class='ant-btn ant-btn-primary']");


        //UI_Locators

        public static By PendingApprovalStatus = By.xpath("//span[contains(text(),'PENDING APPROVAL')]");
        public static By RejectReportHeader = By.xpath("//div[@id='rc_unique_0']");

        public static By RejectStatus = By.xpath("//div[contains(text(),'This report has been rejected.')]");
        public static By RejectReasonTitle = By.xpath("//span[contains(text(),'Please specify an appropriate reason for rejection')]");
        public static By AlertMassage = By.xpath("//div[contains(text(),'Please enter the rejection reason')]");
        public static By RejectValidation = By.xpath("//div[contains(text(),'This report has been rejected.')]");
        public static By RejectReasonValidation = By.xpath("//span[contains(text(),'invalid report')]");
        public static By RejectStatusView = By.xpath("//span[contains(text(),'REJECTED')]");
        public static By SuccessMessage= By.xpath("//span[normalize-space()='Report Rejected successfully']");
    }


        public static class UIElementConstant {

            public static String PendingApprovalText="PENDING APPROVAL";
            public static String ReportText="Reject Report";
            public static String RejectValidationText="This report has been rejected.";
            public static String TitleText="PLEASE SPECIFY AN APPROPRIATE REASON FOR REJECTION";
            public static String AlertText="Please enter the rejection reason";
            public static String SuccessMessageText="Report Rejected successfully";

            public static String RejectReasonText="invalid report";
            public static String RejectStatusText="REJECTED";


        }

}


