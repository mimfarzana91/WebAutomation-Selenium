package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class CreateOrganizationOR {

    public static class Locator {

        public static By OrganizationListButton = By.className("OrganizationList_org__29v3F");
        public static By MyOrganizationListLabel = By.xpath("//div[contains(text(),'My Organizations')]");
        public static By ManageOrganizationButton = By.xpath("//small[contains(text(),'Manage')]");
        public static By NewOrganiationButton = By.xpath("//span[contains(text(),'New Organization')]");
        public static By OrganizationNameField = By.xpath("//input[@id='name']");
        public static By OrganizationCountryField = By.xpath("//input[@id='countryCode']");
        public static By SelectOrganizationCountry = By.xpath("//body/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
        public static By OrganizationCurrencyField = By.xpath("//input[@id='currencyId']");
        public static By SelectOrganizationCurrency = By.xpath("//div[contains(text(),'Bangladeshi Taka')]");
        public static By CrossButton = By.xpath("//body/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]/*[1]");
        public static By SaveButton = By.xpath("//span[contains(text(),'Save')]");
        public static By CancelButton = By.xpath("//span[contains(text(),'Cancel')]");
        public static By CreateOrganizationFormTitle = By.xpath("//div[contains(text(),'New Organization')]");
        public static By OrganizationNameLabel = By.xpath("//label[contains(text(),'Organization Name')]");
        public static By OrganizationCountryLabel = By.xpath("//label[contains(text(),'Country')]");
        public static By OrganizationCurrencyLabel = By.xpath("//label[contains(text(),'Currency')]");
        public static By OrganizationNameMandatoryLabel = By.xpath("//div[contains(text(),'Please enter the organization name')]");
        public static By OrganizationCountryMandatoryLabel = By.xpath("//div[contains(text(),'Please select your country')]");
        public static By OrganizationCurrencyMandatoryLabel = By.xpath("//div[contains(text(),'Please select currency')]");
        public static By OrganizationCreateSuccessMessage = By.xpath("//span[contains(text(),'New organization created successfully')]");

    }

    public static class UIElementsConstant {

        public static String CreateOrganizationFormTitleText = "New Organization";
        public static String OrganizationNameLabelText = "ORGANIZATION NAME";
        public static String OrganizationCountryLabelText = "COUNTRY";
        public static String OrganizationCurrencyLabelText = "CURRENCY";
        public static String SaveButtonText = "Save";
        public static String CancelButtonText = "Cancel";
        public static String MyOrganizationsText = "My Organizations";
        public static String NewOrganizationButtonText = "New Organization";
        public static String OrganizationNameMandatoryLabelText = "Please enter the organization name";
        public static String OrganizationCountryMandatoryLabelText = "Please select your country";
        public static String OrganizationCurrencyMandatoryLabelText = "Please select currency";
        public static String OrganizationCreateSuccessMessageText = "New organization created successfully";

    }
}
