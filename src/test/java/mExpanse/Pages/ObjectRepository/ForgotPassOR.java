package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class ForgotPassOR {
    public static class locator{
        public static By forgotPassBtn = By.xpath("//*[@id=\"root\"]/section/main/div/div/div/div/form/div[4]/div/div[1]/label/span/a");
        public static By emailInput = By.xpath("//*[@id=\"email\"]");
        public static By sendLinkBtn = By.xpath("//*[@id=\"root\"]/section/main/div/div/div/div/form/div[4]/div/div/div/button");
        public static By logo = By.xpath("//*[@id=\"root\"]/section/main/div/div/div/div/form/div[1]/h3");
        public static By pageSubTitle = By.xpath("//*[@id=\"root\"]/section/main/div/div/div/div/form/div[2]/h4");
        public static By pageInstruction = By.xpath("//*[@id=\"root\"]/section/main/div/div/div/div/form/div[2]/span");
        public static By emailLabel = By.xpath("//*[@id=\"root\"]/section/main/div/div/div/div/form/div[3]/div[1]/label");
        public static By backLoginBtn = By.xpath("//*[@id=\"root\"]/section/main/div/div/div/div/form/div[5]/a");
        public static By invalidMailAlert = By.xpath("//*[@id=\"root\"]/section/main/div/div/div/div/form/div[3]/div[2]/div[2]/div");

        public static By sendResetLinkMsg = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");

        public static By setPassword = By.xpath("/html/body/div/section/main/div/div/div/div/form/div[3]/div[2]/div/div/span/input");

        public static By confirmPassword = By.xpath("/html/body/div/section/main/div/div/div/div/form/div[4]/div[2]/div/div/span/input");

        public static By setPasswordBtn = By.xpath("/html/body/div/section/main/div/div/div/div/form/div[5]/div/div/div/button/span");

        public static By logoForgotPass = By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/h3[1]");

        public static By resetPassTitle = By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/h4[1]");

        public static By newPass = By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/label[1]/span[1]");

        public static By confirmPass = By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/label[1]");

        public static By setNewPassBtn = By.xpath("/html[1]/body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[1]/button[1]/span[1]");

        public static By backToLoginBtn = By.linkText("Back to login");

        public static By blankPassMsg = By.xpath("/html/body/div/section/main/div/div/div/div/form/div[3]/div[2]/div[2]/div");

        public static By invalidPassMsg1 = By.xpath("//*[@id=\"root\"]/section/main/div/div/div/div/form/div[3]/div[2]/div[2]/div[1]");
        public static By invalidPassMsg2 = By.xpath("/html/body/div/section/main/div/div/div/div/form/div[3]/div[2]/div[2]/div[2]");
        public static By invalidPassMsg3 = By.xpath("/html/body/div/section/main/div/div/div/div/form/div[3]/div[2]/div[2]/div[3]");

        public static By wrongConfirmPassMsg = By.xpath("/html/body/div/section/main/div/div/div/div/form/div[4]/div[2]/div[2]/div");

        public static By resetPassSuccessMsg = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]");

        public static By invalidLinkMsg = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]");

        public static By nonUserMailAlert = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[2]");

        public static By afterLoginLogo = By.xpath("//body/div[@id='root']/section[1]/aside[1]/div[1]/div[1]/*[1]");
    }
    public static class UIElementConstant {
        public static  String LogoText="MExpense";
        public static String ForgotPassword="Forgot Password?";
        public static String Instruction="Enter your email and we'll send you instructions to reset your password";
        public static String EmailLabelText="EMAIL";
        public static String EmailPlaceHolder="Enter your email";
        public static String ResetBtnTitle="Send Reset Link";
        public static String BackToLoginText="Back to login";
        public static String MailAlertText="Please enter your email";

        public static String InvalidMailAlertText = "Please enter a valid email address";

        public static String SendResetLinkText = "Check your inbox to reset your password";

        public static String ResetPassTitleText = "Reset Password";

        public static String NewPassText = "PASSWORD";

        public static String ConfirmPasstext = "CONFIRM PASSWORD";

        public static String SetNewPassBtnText = "Set New Password";

        public static String BackToLoginBtnText = "Back to login";

        public static String BlankPassMsgText = "Please enter your password";

        public static String InvalidPassMsg1Text = "Password can't be less than 6 digits";
        public static String InvalidPassMsg2Text = "Password must contain at least one uppercase letter";
        public static String InvalidPassMsg3Text = "Password must contain at least one number";

        public static String WrongConfirmPassMsgText = "The password and its confirm are not the same";

        public static String ResetPassSuccessMsgText = "Your password has been set successfully";

        public static String InvalidLinkMsgText = "the token in the reset password link is invalid";

        public static String NonUserEmailAlertMsg = "No user is found by this email";

    }
}

