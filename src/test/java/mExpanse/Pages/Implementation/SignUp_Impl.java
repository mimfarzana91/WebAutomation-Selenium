package mExpanse.Pages.Implementation;


import mExpanse.Pages.Interface.SignUp_Interface;
import mExpanse.Pages.ObjectRepository.SignUpOR;

import static mExpanse.Pages.ObjectRepository.SignUpOR.Locator;

import static mExpanse.Pages.ObjectRepository.SignUpOR.Locator.EmailTextBox;
import static mExpanse.Pages.ObjectRepository.SignUpOR.UIElementConstant;

import org.openqa.selenium.WebDriver;

import mExpance.Library.Operations;
import java.util.Random;

public class SignUp_Impl implements SignUp_Interface {

    @Override
    public void guiVerification(WebDriver driver) {

        Operations.click(SignUpOR.Locator.CreateNewAccount, driver);
        Operations.matchText(SignUpOR.Locator.WelcomeToMExpense, UIElementConstant.WelcomeToMExpenseText, driver);
        Operations.matchText(SignUpOR.Locator.OrganizationNameLabel, UIElementConstant.OrganizationNameText, driver);
        Operations.matchAttribute(SignUpOR.Locator.OrganizationNameTextBox, UIElementConstant.OrganizationNamePlaceHolder,"Placeholder", driver);
        Operations.matchText(SignUpOR.Locator.FullNameLabel, UIElementConstant.FullNameText, driver);
        Operations.matchAttribute(SignUpOR.Locator.FullNameTextBox, UIElementConstant.FullNamePlaceHolder, "Placeholder", driver);
        Operations.matchText(SignUpOR.Locator.EmailLabel, UIElementConstant.EmailText, driver);
        Operations.matchAttribute(EmailTextBox,UIElementConstant.EmailPlaceHolder,"Placeholder", driver);
        Operations.matchText(SignUpOR.Locator.PasswordLabel, UIElementConstant.PasswordText, driver);
        Operations.matchAttribute(SignUpOR.Locator.PasswordTextBox, UIElementConstant.PasswordPlaceholder, "Placeholder", driver);
        Operations.verifyElementIsDisplayed(SignUpOR.Locator.PasswordEye, driver);
        Operations.verifyElementIsDisplayed(SignUpOR.Locator.PasswordToolTip,driver);
        Operations.matchText(SignUpOR.Locator.CountryLabel, UIElementConstant.CountryText, driver);
        //Operations.matchAttribute(SignUpOR.Locator.CountryDropDown, UIElementConstant.CountryPlaceHolder,"Placeholder", driver);
        Operations.matchText(SignUpOR.Locator.CurrencyLabel, UIElementConstant.CurrencyText, driver);
        //Operations.matchAttribute(SignUpOR.Locator.CurrencyDropDown, UIElementConstant.CurrencyPlaceholder,"Placeholder", driver);
        Operations.matchText(SignUpOR.Locator.PhoneNumberLabel, UIElementConstant.PhoneNumberText,driver);
        Operations.matchAttribute(SignUpOR.Locator.PhoneNumberTextBox, UIElementConstant.PhoneNumberPlaceHolder, "Placeholder", driver);
        Operations.verifyElementIsDisplayed(SignUpOR.Locator.CheckBox, driver);
        Operations.matchText(SignUpOR.Locator.CreateAccountButton, UIElementConstant.CreateNewAccountText, driver);
        Operations.verifyElementIsPresent(SignUpOR.Locator.AlreadyHaveAccountLabel, driver);
        Operations.waitUntilElementIsClickable(SignUpOR.Locator.SignInLink, driver);

    }
    @Override
    public void alertVerification(WebDriver driver) throws InterruptedException {

        Operations.sleep(5000);
        Operations.click(SignUpOR.Locator.CreateAccountButton, driver);
        Operations.matchText(Locator.RequiredOrganizationNameAlert, UIElementConstant.OrganizationAlert, driver);
        Operations.matchColor(Locator.RequiredOrganizationNameAlert,"#ff4d4f", "color", driver);
        Operations.matchText(Locator.RequiredFullNameAlert, UIElementConstant.FullNameAlert, driver);
        Operations.matchColor(Locator.RequiredFullNameAlert,"#ff4d4f", "color", driver);
        Operations.matchText(Locator.RequiredEmailAlert, UIElementConstant.EmailAlert, driver);
        Operations.matchColor(Locator.RequiredEmailAlert,"#ff4d4f", "color", driver);
        Operations.matchText(Locator.RequiredPasswordAlert, UIElementConstant.PasswordAlert, driver);
        Operations.matchColor(Locator.RequiredPasswordAlert,"#ff4d4f", "color", driver);
        Operations.matchText(Locator.RequiredCountrySelectAlert, UIElementConstant.CountryAlert, driver);
        Operations.matchColor(Locator.RequiredCountrySelectAlert,"#ff4d4f", "color", driver);
        Operations.sleep(2000);
        Operations.matchText(Locator.RequiredCurrencySelectAlert, UIElementConstant.CurrencyAlert, driver);
        Operations.matchColor(Locator.RequiredCurrencySelectAlert,"#ff4d4f", "color", driver);
        Operations.matchText(Locator.RequiredPhoneNumberAlert, UIElementConstant.PhoneNumberAlert, driver);
        Operations.matchColor(Locator.RequiredPhoneNumberAlert,"#ff4d4f", "color", driver);
        Operations.sleep(1000);
        Operations.matchText(Locator.RequiredTermsAndConditionsAlert, UIElementConstant.TermsAndConditionsAlert, driver);


    }

    @Override
    public void alreadyRegisteredEmailVerification(WebDriver driver)throws InterruptedException {
        Operations.refresh(driver);
        Operations.sendText(Locator.OrganizationNameTextBox,"Monstarlab", driver);
        Operations.randomName(Locator.FullNameTextBox,driver);
        Operations.sendText(EmailTextBox, "sumaiya@monstar-lab.com", driver);
        Operations.sendText(Locator.PasswordTextBox,"Expense1", driver);
        Operations.sleep(1000);
        Operations.click(Locator.PasswordEye, driver);
        Operations.click(Locator.CountryDropDown, driver);
        Operations.sleep(1000);
        Operations.click(Locator.CountryNameBangladesh, driver);
        Operations.sleep(1000);
        Operations.click(Locator.CurrencyDropDown, driver);
        Operations.click(Locator.CurrencyBDT, driver);
        Operations.sendText(Locator.PhoneNumberTextBox,"12334678", driver);
        Operations.click(Locator.CheckBox, driver);
        Operations.click(Locator.CreateAccountButton, driver);
        Operations.verifyElementIsDisplayed(SignUpOR.Locator.EmailAlreadyRegisteredAlert,driver);

    }

    @Override
    public void passwordAlerts(WebDriver driver)throws InterruptedException{
        Operations.refresh(driver);
        Operations.sendText(Locator.PasswordTextBox, "aaa", driver);
        Operations.sleep(2000);
        Operations.matchText(Locator.PasswordMinAlert, UIElementConstant.PasswordMinAlertText, driver);
        Operations.matchColor(Locator.PasswordMinAlert, "#ff4d4f", "color", driver);
        Operations.matchText(Locator.PasswordUppercaseAlert, UIElementConstant.PasswordUppercaseAlertText, driver);
        Operations.matchColor(Locator.PasswordUppercaseAlert, "#ff4d4f", "color", driver);
        Operations.matchText(Locator.PasswordNumberAlert, UIElementConstant.PasswordNumberAlertText, driver);
        Operations.matchColor(Locator.PasswordNumberAlert, "#ff4d4f", "color", driver);

    }
    @Override
    public String[] validRegistration(WebDriver driver)throws InterruptedException{

        Operations.refresh(driver);
        Operations.sendText(Locator.OrganizationNameTextBox,"Monstarlab", driver);
       // Operations.randomName(Locator.FullNameTextBox,driver);
        String Username = Operations.randomName(Locator.FullNameTextBox, driver);

//        Operations.click(EmailTextBox, driver);
//        Random randomGenerator = new Random();
//        int randomInt = randomGenerator.nextInt(1000);
        String mail = Operations.generateValidRandomEmail( "sayma.nasrin+");
        Operations.sendText(Locator.EmailTextBox, mail,driver);

        String Password = Operations.randomPass(Locator.PasswordTextBox, driver);
        Operations.click(Locator.PasswordEye, driver);
        Operations.sleep(1000);
        Operations.click(Locator.PasswordEye, driver);

        Operations.click(Locator.CountryDropDown, driver);
        Operations.sleep(1000);
        Operations.randomDropdownList(Locator.CountryNameBangladesh, driver);

        Operations.click(Locator.CurrencyDropDown, driver);
        Operations.sleep(1000);
        Operations.randomDropdownList(Locator.CurrencyBDT, driver);

        Operations.click(Locator.PhoneNumberTextBox, driver);
        Operations.sleep(1000);

        String PhNumber = Operations.randomNumber(Locator.PhoneNumberTextBox, driver);
        Operations.click(Locator.CheckBox, driver);
        Operations.click(Locator.CreateAccountButton, driver);
        String[] userInfo = {Username, mail, PhNumber, Password};
        return userInfo;

    }
}




