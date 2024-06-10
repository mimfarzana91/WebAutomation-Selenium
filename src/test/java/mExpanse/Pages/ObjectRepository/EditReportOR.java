package mExpanse.Pages.ObjectRepository;

import mExpance.Library.Operations;
import org.openqa.selenium.By;

public class EditReportOR {

    public static class Locator{
        public static By tableDataReportName=By.xpath("/html/body/div[1]/section/section/main/section/main/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[2]/div/div/h4/div/div/a");
        public static By reportDetailsScreenReportName=By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div[1]/div[1]/div");
        public static By reportDetailsScreenBusinessPurpose=By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div[1]/div[2]/table/tbody/tr/td/div/span/div[1]/div[2]/div[2]/div/div");
        public static By reportDetailsScreenFromDuration=By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div[1]/div[2]/table/tbody/tr/td/div/span/div[1]/div[1]/div[2]/div/div/span[1]");
        public static By reportDetailsScreenToDuration=By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[2]/div[1]/div[2]/table/tbody/tr/td/div/span/div[1]/div[1]/div[2]/div/div/span[3]");
        public static By reportDetailsScreenEditButton=By.xpath("//*[@id=\"root\"]/section/section/main/section/main/div/div[1]/div/div[2]/div/div[1]/button");
        public static By drawerTitleEditReport =By.xpath("//div[contains(text(),'Edit Report')]");
        public static By toDate =By.xpath("//*[@id=\"toDate\"]");
        public static By toDateTable =By.xpath("//table[@class='ant-picker-content']");
        public static By saveButton =By.xpath("/html/body/div[4]/div/div[2]/div/div/div[2]/div/div[1]/button/span");
        public static By editSubmitAlert =By.xpath("//span[contains(text(),'The report updated successfully')]");
        public static By reportDetailsExpensesTab =By.xpath("//span[contains(text(),'Expenses')]");
        public static By reportDetailsHistoryTab =By.xpath("//span[contains(text(),'History')]");

    }


    public static class UIElementConstant{

        public static  String editSubmitAlert="The report updated successfully";

    }
}
