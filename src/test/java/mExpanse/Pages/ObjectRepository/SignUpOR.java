package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpOR {

    public static class Locator{
        public static By CreateNewAccount = By.xpath("//A[@href='/sign-up'][text()='Create an Account']"); //Changed XPath
        public static By WelcomeToMExpense = By.cssSelector("h4.ant-typography.AuthScreens_signUpLogoText__29Z39");
        public static By OrganizationNameLabel = By.xpath("//label[contains(text(),'Organization Name')]");
        public static By OrganizationNameTextBox = By.xpath("//input[@id='organizationName']");
        public static By FullNameLabel = By.xpath("//label[contains(text(),'Full Name')]");
        public static By FullNameTextBox = By.xpath("//input[@id='name']");
        public static By EmailLabel = By.xpath("//label[contains(text(),'Email')]");
        public static By EmailTextBox = By.xpath("//input[@id='username']");
        public static By PasswordLabel = By.xpath("//div[@id='root']/section/main/div/div/div/div/form/div[5]/div/label/span");
        public static By PasswordToolTip = By.xpath("//div[@id='root']/section/main/div/div/div/div/form/div[5]/div/label/span/span");
        public static By PasswordTextBox = By.xpath("//input[@id='password']");
        public static By PasswordEye = By.xpath("//div[@id='root']/section/main/div/div/div/div/form/div[5]/div[2]/div/div/span/span");
        public static By CountryLabel = By.xpath("//label[contains(text(),'Country')]");
        public static By CountryDropDown = By.xpath("//div[@class='ant-select ant-select-in-form-item ant-select-single ant-select-show-arrow']//input[@id='organizationCountryCode']");
        public static By CountryNameBangladesh = By.xpath("//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']");
        public static By CurrencyLabel = By.xpath("//label[contains(text(),'Currency')]");

        public static By CurrencyBDT = By.xpath("//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active']");
        public static By CurrencyDropDown = By.cssSelector("input#organizationCurrencyId");
        public static By PhoneNumberLabel = By.xpath("//label[contains(text(),'Phone Number')]");
        public static By SelectedCountryCode = By.xpath("//span[contains(text(),'+880')]");
        public static By PhoneNumberTextBox = By.xpath("//input[@id='mobile']");
        public static By CheckBox = By.xpath("//input[@id='tnc']");
        public static By CreateAccountButton = By.xpath("(//BUTTON[@type='submit'])[1]"); //Changed XPath
        public static By AlreadyHaveAccountLabel = By.xpath("div#root div:nth-child(11) > span");
        public static By SignInLink = By.xpath("//a[contains(text(),'Sign in')]");
        public static By SignInUsingSocialSiteSection = By.xpath("div#root div.ant-row.ant-row-center.ant-row-middle.AuthScreens_socialBtns__2LK5p");
        public static By RequiredOrganizationNameAlert = By.xpath("//div[contains(text(),'Please enter your organization name')]");
        public static By RequiredFullNameAlert = By.xpath("//div[contains(text(),'Please enter your full name')]");
        public static By RequiredEmailAlert = By.xpath("//div[contains(text(),'Please enter your email')]");
        public static By RequiredPasswordAlert = By.xpath("//div[contains(text(),'Please enter your password')]");
        public static By RequiredCountrySelectAlert = By.xpath("//div[contains(text(),'Please select your country')]");
        public static By RequiredCurrencySelectAlert = By.xpath("//div[contains(text(),'Please select currency')]");
        public static By RequiredPhoneNumberAlert = By.xpath("//div[contains(text(),'Please enter your phone number')]");
        public static By RequiredTermsAndConditionsAlert = By.xpath("//div[contains(text(),'Please accept the T&C and Privacy Policy')]");

        public static By EmailAlreadyRegisteredAlert = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='BDT'])[3]/following::div[7]");
        public static By PasswordMinAlert = By.xpath("//div[contains(text(),'Password needs to be at least 6 digits')]");
        public static By PasswordUppercaseAlert = By.xpath("//div[contains(text(),'Password must contain at least one uppercase lette')]");
        public static By PasswordNumberAlert = By.xpath("//div[contains(text(),'Password must contain at least one number')]");


    }

    public static class UIElementConstant{
        public static String WelcomeToMExpenseText = "Welcome to MExpense";
        public static String OrganizationNameText = "ORGANIZATION NAME";
        public static String OrganizationNamePlaceHolder = "Organization Name";
        public static String FullNameText = ("FULL NAME");
        public static String FullNamePlaceHolder = ("Full Name");
        public static String EmailText = ("EMAIL");
        public static String EmailPlaceHolder = ("Enter your email");
        public static String PasswordText = ("PASSWORD");
        public static String PasswordPlaceholder = ("Choose a password");
        public static String CountryText = ("COUNTRY");
        public static String CountryPlaceHolder = ("Select your country");
        public static String CurrencyText = ("CURRENCY");
        public static String CurrencyPlaceholder = "Select currency";
        public static String PhoneNumberText = ("PHONE NUMBER");
        public static String PhoneNumberPlaceHolder = ("Your phone number");

        public static String CreateNewAccountText = "CREATE ACCOUNT";
        public static String AlreadyHaveAnAccount = "Already have an account?";
        public static String OrganizationAlert = "Please enter your organization name";
        public static String FullNameAlert = "Please enter your full name";
        public static String EmailAlert = "Please enter your email";
        public static String PasswordAlert = "Please enter your password";
        public static String CountryAlert = "Please select your country";
        public static String CurrencyAlert = "Please select currency";
        public static String PhoneNumberAlert = "Please enter your phone number";
        public static String TermsAndConditionsAlert = "Please accept the T&C and Privacy Policy";

        public static String PasswordMinAlertText = "Password needs to be at least 6 digits";

        public static String PasswordUppercaseAlertText = "Password must contain at least one uppercase letter";

        public static String PasswordNumberAlertText = "Password must contain at least one number";



    }


}




