package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class DeleteOrganizationOR {

    public static class Locator {

        public static By OrganizationListButton = By.className("OrganizationList_org__29v3F");
        public static By MyOrganizationListLabel = By.xpath("//div[contains(text(),'My Organizations')]");
        public static By ManageOrganizationButton = By.xpath("//small[contains(text(),'Manage')]");
        public static By FirstOrganizationTooltipButton = By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/section[1]/main[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/button[1]/span[1]/*[1]");
        public static By DefaultOrganizationSelectionButton = By.xpath("//span[contains(text(),'Mark As Default')]");
        public static By DeleteOrganizationButton = By.xpath("//span[contains(text(),'Delete')]");
        public static By DeleteOrganizationModalTitle = By.className("ant-modal-title");
        public static By DeleteReportCountTitle = By.xpath("//div[@Class='ant-statistic-title'][contains(text(), 'Expense Reports')]");
        public static By DeleteExpenseCountTitle = By.xpath("//div[@Class='ant-statistic-title'][contains(text(), 'Expenses')]");
        public static By DeleteButton = By.className("ant-btn-dangerous");
        public static By CancelButton = By.xpath("//span[contains(text(), 'Cancel')]");
        public static By DeleteSuccessMessage = By.xpath("//span[contains(text(),'Organization deleted successfully')]");
        public static By DeleteModalCloseButton = By.xpath("//body/div[4]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]");
    }

    public static class UIElementsConstant {

        public static String DefaultOrganizationButtonText = "Mark As Default";
        public static String DeleteOrganizationButtonText = "Delete";
        public static String DeleteOrganizationModalTitleText = "Delete Organization";
        public static String ReportTitleText = "Expense Reports";
        public static String ExpenseTitleText = "Expenses";
        public static String DeleteButtonText = "Delete";
        public static String CancelButtonText = "Cancel";
        public static String DeleteSuccessMessageText = "Organization deleted successfully";

    }
}
