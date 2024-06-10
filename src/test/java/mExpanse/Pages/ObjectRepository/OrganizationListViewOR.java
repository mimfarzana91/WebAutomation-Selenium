package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class OrganizationListViewOR {

    public static class Locator {

        public static By OrganizationNavBarListButton = By.className("OrganizationList_org__29v3F");
        public static By OrganizationNavBarListLabel = By.xpath("//div[contains(text(),'My Organizations')]");
        public static By ManageOrganizationButton = By.xpath("//small[contains(text(),'Manage')]");
        public static By SearchOrganizationField = By.cssSelector("div.ant-popover.ant-popover-placement-bottom div.ant-popover-content div.ant-popover-inner div.ant-popover-inner-content span.ant-input-affix-wrapper:nth-child(1) > input.ant-input");
        public static By SearchOrganizationResult = By.xpath("//span[contains(text(),'Test Org 2')]");
        public static By NewOrganiationButton = By.xpath("//span[contains(text(),'New Organization')]");
        public static By OrganizationIDLabel = By.xpath("//body[1]/div[1]/section[1]/section[1]/main[1]/section[1]/main[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/span[1]/b[1]");
        public static By UserRoleLabel = By.xpath("//body[1]/div[1]/section[1]/section[1]/main[1]/section[1]/main[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/div[1]/div[1]/span[2]/b[1]");
        public static By CreateOrganizationName = By.xpath("//h4[contains(text(),'Test org')]");

    }

    public static class UIElementsConstant {

        public static String OrganizationNavBarListLabelTitle = "My Organizations";
        public static String OrganizationIDLabelText = "Organization ID:";
        public static String UserRoleLabelText = "User Role:";
        public static String NewOrganizationButtonText = "New Organization";

    }
}