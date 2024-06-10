package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class EditOrganizationOR {

    public static class Locator {

        public static By OrganizationListButton = By.className("OrganizationList_org__29v3F");
        public static By MyOrganizationListLabel = By.xpath("//div[contains(text(),'My Organizations')]");
        public static By ManageOrganizationButton = By.xpath("//small[contains(text(),'Manage')]");
        public static By FirstOrganizationSelectionButton = By.xpath("//span[contains(text(),'Gail Wilkins Org')]");
        public static By FirstOrganizationTooltipButton = By.xpath("//body/div[@id='root']/section[1]/section[1]/main[1]/section[1]/main[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/button[1]/span[1]/*[1]");
        public static By DefaultOrganizationSelectionButton = By.xpath("//span[contains(text(),'Mark As Default')]");
        public static By EditOrganizationButton = By.xpath("//span[contains(text(),'Edit')]");
        public static By DeleteOrganizationButton = By.xpath("//span[contains(text(),'Delete')]");
        public static By EditOrganizationFormLabel = By.xpath("//div[contains(text(),'Edit Organization')]");
        public static By OrganizationNameLabel = By.xpath("//label[contains(text(),'Organization Name')]");
        public static By OrganizationNameField = By.xpath("//input[@id='name']");
        public static By OrganizationCountryLabel = By.xpath("//label[contains(text(),'Country')]");
        public static By OrganizationCountryField = By.xpath("//input[@id='countryCode']");
        public static By OrganizationCurrencyLabel = By.xpath("//label[contains(text(),'Currency')]");
        public static By OrganizationCurrencyField = By.xpath("//input[@id='currencyId']");
        public static By OrganizationAddressLabel = By.xpath("//label[contains(text(),'Address')]");
        public static By OrganizationAddressField = By.xpath("//input[@id='address']");
        public static By OrganizationMobileLabel = By.xpath("//label[contains(text(),'Mobile')]");
        public static By OrganizationMobileField = By.xpath("//input[@id='mobile']");
        public static By EditOrganizationSaveButton = By.xpath("//span[contains(text(),'Save')]");
        public static By EditOrganizationCancelButton = By.xpath("//span[contains(text(),'Cancel')]");
        public static By EditOrganizationCrossButton = By.xpath("//body/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]");
        public static By OrganizationAddressMandatoryLabel = By.xpath("//div[contains(text(),'Please enter the organization address')]");
        public static By OrganizationMobileMandatoryLabel = By.xpath("//div[contains(text(),'Please enter the organization mobile number')]");
        public static By OrganizationEditSuccessMessage = By.xpath("//span[contains(text(),'Your organization has been edited')]");

    }

    public static class UIElementsConstant {

        public static String CreateOrganizationFormTitleText = "Edit Organization";
        public static String OrganizationNameLabelText = "ORGANIZATION NAME";
        public static String OrganizationCountryLabelText = "COUNTRY";
        public static String OrganizationCurrencyLabelText = "CURRENCY";
        public static String OrganizationAddressLabelText = "ADDRESS";
        public static String OrganizationMobileLabelText = "MOBILE";
        public static String SaveButtonText = "Save";
        public static String CancelButtonText = "Cancel";
        public static String OrganizationAddressMandatoryLabelText = "Please enter the organization address";
        public static String OrganizationMobileMandatoryLabelText = "Please enter the organization mobile number";

    }
}