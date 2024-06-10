package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class UnreportedExpenseOR {

    public static class Locator{

        public static By sideNavMenuMyView =By.xpath("//*[@id=\"root\"]/section/aside/div/div[2]/div[1]/div[1]/div[2]");
        public static By sideNavSubMenuExpenses =By.xpath("//a[contains(text(),'Expenses')]");
        public static By unreportedExpenseTab =By.xpath("//span[contains(text(),'Unreported Expenses')]");
        public static By allExpenseTab =By.xpath("//span[contains(text(),'All Expenses')]");
        public static By newExpenseCTA =By.xpath("//span[contains(text(),'New Expense')]");
        public static By tableHeaderExpenseDetails =By.xpath("//span[contains(text(),'Expense Details')]");
        public static By tableHeaderMerchant =By.xpath("//span[contains(text(),'Merchant')]");
        public static By tableHeaderAmount =By.xpath("//span[contains(text(),'Amount')]");
        public static By tableHeaderStatus =By.xpath("//span[contains(text(),'Status')]");
        public static By tableFirstDataExpenseName =By.xpath("/html/body/div/section/section/main/section/main/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[1]/div/div/h4/div/div/a");
        public static By tableFirstDataExpenseCreateDate =By.xpath("/html/body/div/section/section/main/section/main/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[1]/div/div/div/div/span");
        public static By tableFirstDataExpenseAmount =By.xpath("/html/body/div[1]/section/section/main/section/main/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[3]/span");
        public static By tableFirstDataExpenseStatus =By.xpath("/html/body/div[1]/section/section/main/section/main/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[4]/span");
        public static By tableFirstDataExpenseMerchant =By.xpath("//*[@id=\"rc-tabs-0-panel-1\"]/div/div/div/div/div/div/div[1]/table/thead/tr/th[2]/div/span[1]");
        public static By TooltipDes =By.xpath("//div[contains(text(),'Click to sort descending')]");
        public static By TooltipAsc =By.xpath("//div[contains(text(),'Click to sort ascending')]");
        public static By CancelSorting =By.xpath("//div[contains(text(),'Click to cancel sorting')]");
        public static By amountTooltip =By.cssSelector("div:nth-child(11) div:nth-child(1) div.ant-tooltip.ant-tooltip-placement-top div.ant-tooltip-content > div.ant-tooltip-inner");


    }


    public static class UIElementConstant{


        public static  String unreportedExpenseText="Unreported Expenses";
        public static  String allExpenseText="All Expenses";
        public static  String newExpenseBtnText="New Expense";
        public static  String tableHeaderExpenseDetailsText="Expense Details";
        public static  String tableHeaderMerchant="Merchant";
        public static  String tableHeaderAmount="Amount";
        public static  String tableHeaderStatus="Status";


    }
}
