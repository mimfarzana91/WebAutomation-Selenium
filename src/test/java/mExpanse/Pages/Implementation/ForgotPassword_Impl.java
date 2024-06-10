/**
        * Owner: Afrina Zahan Mithila
        * Ticket - no: Forgot Password
        */



package mExpanse.Pages.Implementation;
import mExpance.Library.Operations;
import mExpanse.Pages.Interface.ForgotPassword_Interface;

import mExpanse.Pages.ObjectRepository.ForgotPassOR;
import mExpanse.Pages.ObjectRepository.GmailOR;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ForgotPassword_Impl implements ForgotPassword_Interface{

    String currentURL;
    @Override
    public void guiVerification(WebDriver driver) throws InterruptedException {
        Operations.click(ForgotPassOR.locator.forgotPassBtn,driver);
        Operations.sleep(3000);

        Operations.verifyElementIsDisplayed(ForgotPassOR.locator.logo, driver);
        Operations.matchText(ForgotPassOR.locator.logo,ForgotPassOR.UIElementConstant.LogoText, driver);

        Operations.matchText(ForgotPassOR.locator.pageSubTitle,ForgotPassOR.UIElementConstant.ForgotPassword,driver);
        Operations.matchText(ForgotPassOR.locator.pageInstruction,ForgotPassOR.UIElementConstant.Instruction,driver);
        Operations.matchText(ForgotPassOR.locator.emailLabel,ForgotPassOR.UIElementConstant.EmailLabelText,driver);
        Operations.matchAttribute(ForgotPassOR.locator.emailInput,ForgotPassOR.UIElementConstant.EmailPlaceHolder,"placeholder",driver);
        // Operations.matchText(ForgotPassOR.locator.invalidMailAlert,ForgotPassOR.UIElementConstant.MailAlertText,driver);
        Operations.matchText(ForgotPassOR.locator.sendLinkBtn,ForgotPassOR.UIElementConstant.ResetBtnTitle,driver);
        Operations.matchText(ForgotPassOR.locator.backLoginBtn,ForgotPassOR.UIElementConstant.BackToLoginText,driver);


    }

    @Override
    public void blankEmailValidation(WebDriver driver) throws InterruptedException {
        Operations.click(ForgotPassOR.locator.sendLinkBtn,driver);
        Operations.sleep(5000);
        Operations.waitUntilElementIsVisible(ForgotPassOR.locator.invalidMailAlert,driver);
        Operations.verifyElementIsDisplayed(ForgotPassOR.locator.invalidMailAlert,driver);
        Operations.matchText(ForgotPassOR.locator.invalidMailAlert,ForgotPassOR.UIElementConstant.MailAlertText,driver);
        Operations.sleep(5000);
    }

    @Override
    public void invalidEmailValidation(WebDriver driver) throws InterruptedException {
        Operations.sendText(ForgotPassOR.locator.emailInput,Operations.createRandomString(driver),driver);
        Operations.click(ForgotPassOR.locator.sendLinkBtn,driver);
        Operations.sleep(3000);
        Operations.waitUntilElementIsVisible(ForgotPassOR.locator.invalidMailAlert,driver);
        Operations.verifyElementIsDisplayed(ForgotPassOR.locator.invalidMailAlert,driver);
        Operations.matchText(ForgotPassOR.locator.invalidMailAlert,ForgotPassOR.UIElementConstant.InvalidMailAlertText,driver);
        Operations.sleep(3000);
        Operations.clear(ForgotPassOR.locator.emailInput, driver);
    }

    @Override
    public void nonUserEmailVerification(WebDriver driver) throws InterruptedException{
        //Operations.clear(ForgotPassOR.locator.emailInput, driver);
       // Operations.sleep(5000);
        Operations.sendText(ForgotPassOR.locator.emailInput, "afrina@gmail.com", driver);
        Operations.click(ForgotPassOR.locator.sendLinkBtn, driver);
        Operations.waitUntilElementIsVisible(ForgotPassOR.locator.nonUserMailAlert,driver);
        Operations.matchText(ForgotPassOR.locator.nonUserMailAlert,ForgotPassOR.UIElementConstant.NonUserEmailAlertMsg,driver);
    }

    @Override
    public void validEmailResetPassword(WebDriver driver, String mail) throws InterruptedException {
        Operations.clear(ForgotPassOR.locator.emailInput, driver);
        Operations.sleep(5000);
        Operations.sendText(ForgotPassOR.locator.emailInput, mail, driver);
        Operations.click(ForgotPassOR.locator.sendLinkBtn, driver);
        //Operations.sleep(3000);
        Operations.waitUntilElementIsVisible(ForgotPassOR.locator.sendResetLinkMsg, driver);
        Operations.matchText(ForgotPassOR.locator.sendResetLinkMsg, ForgotPassOR.UIElementConstant.SendResetLinkText, driver);
        Operations.switchToTab("https://accounts.google.com/v3/signin/identifier?dsh=S-1056617318%3A1667810706150279&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAuavzYbA5g-suzTfqoVNJLAUjcsYFJS8fHxkQOsXv4wPOYFldJRXdm-DqudB3t2dfncYkOX", driver);
        Operations.sleep(5000);
        Operations.gmailLogin(GmailOR.Locator.EmailInput, GmailOR.Locator.EmailNext, GmailOR.Locator.PasswordInput, GmailOR.Locator.PasswordNext, "aztestmexpense@gmail.com", "QC12345@", driver);
        Operations.sleep(10000);
        Operations.switchToTab("https://mail.google.com/mail/u/0/?tab=km#inbox", driver);
        Operations.click(GmailOR.Locator.GmailInbox, driver);
        Operations.sleep(5000);
        //Operations.scrollIntoElement(GmailOR.Locator.Reply,driver);
        //Operations.sleep(3000);
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //Scroll down till the bottom of the page
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        //js.executeScript("window.scrollBy(0,3000)");
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform();
        Operations.sleep(5000);
        Operations.click(GmailOR.Locator.MsgExpand, driver);
        Operations.sleep(5000);
        Operations.click(GmailOR.Locator.Sentlink, driver);
        Operations.sleep(5000);
        Operations.switchToWindow(driver);
        currentURL = driver.getCurrentUrl();
        Operations.sleep(5000);
        //UI verification
        Operations.verifyElementIsDisplayed(ForgotPassOR.locator.logoForgotPass, driver);
        Operations.matchText(ForgotPassOR.locator.logoForgotPass, ForgotPassOR.UIElementConstant.LogoText, driver);

        Operations.matchText(ForgotPassOR.locator.resetPassTitle, ForgotPassOR.UIElementConstant.ResetPassTitleText, driver);

        Operations.matchText(ForgotPassOR.locator.newPass, ForgotPassOR.UIElementConstant.NewPassText, driver);

        Operations.matchText(ForgotPassOR.locator.confirmPass, ForgotPassOR.UIElementConstant.ConfirmPasstext, driver);

        Operations.matchText(ForgotPassOR.locator.setNewPassBtn, ForgotPassOR.UIElementConstant.SetNewPassBtnText, driver);

        Operations.matchText(ForgotPassOR.locator.backToLoginBtn, ForgotPassOR.UIElementConstant.BackToLoginBtnText, driver);

        Operations.sleep(10000);


    }

    @Override
    public void resetPassword(String newPass, WebDriver driver) throws InterruptedException {
        //Operations.click(ForgotPassOR.locator.SetPassword,driver);
        Operations.sendText(ForgotPassOR.locator.setPassword,newPass,driver);
        Operations.sendText(ForgotPassOR.locator.confirmPassword,Operations.createRandomString(driver),driver);
        Operations.sleep(2000);
        Operations.matchText(ForgotPassOR.locator.wrongConfirmPassMsg,ForgotPassOR.UIElementConstant.WrongConfirmPassMsgText,driver);
        Operations.clear(ForgotPassOR.locator.confirmPassword,driver);
        Operations.sleep(2000);
        Operations.sendText(ForgotPassOR.locator.confirmPassword,newPass,driver);
        //Operations.sleep(5000);
        Operations.click(ForgotPassOR.locator.setPasswordBtn,driver);
        Operations.waitUntilElementIsVisible(ForgotPassOR.locator.resetPassSuccessMsg,driver);
        Operations.matchText(ForgotPassOR.locator.resetPassSuccessMsg,ForgotPassOR.UIElementConstant.ResetPassSuccessMsgText,driver);
        Operations.sleep(5000);
    }

    @Override
    public void invalidPassword(WebDriver driver) throws InterruptedException {
        Operations.click(ForgotPassOR.locator.setPassword,driver);
        Operations.sendText(ForgotPassOR.locator.setPassword,"a",driver);
        Operations.sleep(2000);
        Operations.matchText(ForgotPassOR.locator.invalidPassMsg1,ForgotPassOR.UIElementConstant.InvalidPassMsg1Text,driver);
        Operations.matchText(ForgotPassOR.locator.invalidPassMsg2,ForgotPassOR.UIElementConstant.InvalidPassMsg2Text,driver);
        Operations.matchText(ForgotPassOR.locator.invalidPassMsg3,ForgotPassOR.UIElementConstant.InvalidPassMsg3Text,driver);
        Operations.clear(ForgotPassOR.locator.setPassword,driver);
        Operations.sleep(2000);
        Operations.matchText(ForgotPassOR.locator.blankPassMsg,ForgotPassOR.UIElementConstant.BlankPassMsgText,driver);

    }

    @Override
    public void invalidLink(WebDriver driver) throws InterruptedException {
       // driver.switchTo().window(mainWindowHandle);
        Operations.switchToTab(currentURL,driver);
        Operations.sleep(2000);

    }
    @Override
    public void notResetPassword(String newPass, WebDriver driver) throws InterruptedException {
        Operations.sendText(ForgotPassOR.locator.setPassword,newPass,driver);
        Operations.sleep(2000);
        Operations.sendText(ForgotPassOR.locator.confirmPassword,newPass,driver);
        //Operations.sleep(5000);
        Operations.click(ForgotPassOR.locator.setPasswordBtn,driver);
        Operations.waitUntilElementIsVisible(ForgotPassOR.locator.invalidLinkMsg,driver);
        Operations.matchText(ForgotPassOR.locator.invalidLinkMsg,ForgotPassOR.UIElementConstant.InvalidLinkMsgText,driver);
        Operations.sleep(5000);
        Operations.click(ForgotPassOR.locator.backToLoginBtn,driver);
        Operations.sleep(5000);
        Operations.verifyElementIsDisplayed(ForgotPassOR.locator.afterLoginLogo,driver);

    }

}

