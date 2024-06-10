package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.LandingPage_Interface;
import mExpanse.Pages.ObjectRepository.LandingPageOR;
import mExpanse.Pages.ObjectRepository.SignUpOR;
import org.openqa.selenium.WebDriver;

public class LandingPage_Impl extends SignUp_Impl implements LandingPage_Interface {

    @Override
    public void guiValidationForNewUser(WebDriver driver) throws InterruptedException {

        Operations.click(SignUpOR.Locator.CreateNewAccount, driver);
        Operations.sleep(1000);
        String[] UserInfo = validRegistration(driver);
        String UserName = UserInfo[0];
        String Email = UserInfo[1];
        String Mobile = "+880"+UserInfo[2];

        String TempUserDP = String.valueOf(UserName.charAt(0));
        String UserDP = TempUserDP.toUpperCase();

        //Top Bar Element validation
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.UserName, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.UserRole, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.UserDP, driver);

        //Main Section Element validation
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.BasicInfo, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.EditButton, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.PersonalDetails, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.NameField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Name, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.EmailField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Email, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.IDField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.MobileField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Mobile, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.DOJField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.DOBField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.RoleField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Role, driver);

        //Top Bar Text Validation
        Operations.matchText(LandingPageOR.Locator.UserName,UserName, driver);
        Operations.matchText(LandingPageOR.Locator.UserRole,LandingPageOR.UIElements.UserRole, driver);
        Operations.matchText(LandingPageOR.Locator.UserDP, UserDP, driver);

        //Main Section Text Validation
        Operations.matchText(LandingPageOR.Locator.BasicInfo,LandingPageOR.UIElements.BasicInfo, driver);
        Operations.matchText(LandingPageOR.Locator.PersonalDetails,LandingPageOR.UIElements.PersonalDetails, driver);
        Operations.matchText(LandingPageOR.Locator.NameField,LandingPageOR.UIElements.NameField, driver);
        Operations.matchText(LandingPageOR.Locator.Name, UserName, driver);
        Operations.matchText(LandingPageOR.Locator.EmailField,LandingPageOR.UIElements.EmailField, driver);
        Operations.matchText(LandingPageOR.Locator.Email, Email, driver);
        Operations.matchText(LandingPageOR.Locator.IDField,LandingPageOR.UIElements.IDField, driver);
        Operations.matchText(LandingPageOR.Locator.MobileField,LandingPageOR.UIElements.MobileField, driver);
        Operations.matchText(LandingPageOR.Locator.Mobile, Mobile, driver);
        Operations.matchText(LandingPageOR.Locator.DOJField,LandingPageOR.UIElements.DOJField, driver);
        Operations.matchText(LandingPageOR.Locator.DOBField,LandingPageOR.UIElements.DOBField, driver);
        Operations.matchText(LandingPageOR.Locator.RoleField,LandingPageOR.UIElements.RoleField, driver);

    }

    @Override
    public void guiValidationForExistingUser(WebDriver driver) throws InterruptedException {

        //Side Menu Element validation
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Logo, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.SideMenuArrow, driver);

        //My View Menu
        Operations.click(LandingPageOR.Locator.MyView, driver);
        Operations.sleep(1000);

        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.MyView, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Expenses, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Reports, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Approvals, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.MySettings, driver);
        //Admin View Menu
        Operations.click(LandingPageOR.Locator.AdminView, driver);
        Operations.sleep(1000);

        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.AdminView, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Users, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.ExpenseCategories, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.AdminReports, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Merchants, driver);

        //Top Bar Element validation
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.OrgName, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.NotificationIcon, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.UserName, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.UserRole, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.UserDP, driver);

        //Main Section Element validation
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.BasicInfo, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.EditButton, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.PersonalDetails, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.NameField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Name, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.EmailField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Email, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.IDField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.ID, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.MobileField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Mobile, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.DOJField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.DOJ, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.DOBField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.DOB, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.RoleField, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Role, driver);

        //Side Menu Text Validation
        //My View Menu
        Operations.click(LandingPageOR.Locator.MyView, driver);
        Operations.sleep(1000);

        Operations.matchText(LandingPageOR.Locator.Expenses,LandingPageOR.UIElements.Expenses, driver);
        Operations.matchText(LandingPageOR.Locator.Reports,LandingPageOR.UIElements.Reports, driver);
        Operations.matchText(LandingPageOR.Locator.Approvals,LandingPageOR.UIElements.Approvals, driver);
        Operations.matchText(LandingPageOR.Locator.MySettings,LandingPageOR.UIElements.MySettings, driver);
        //Admin View Menu
        Operations.click(LandingPageOR.Locator.AdminView, driver);
        Operations.sleep(1000);

        Operations.matchText(LandingPageOR.Locator.Users,LandingPageOR.UIElements.Users, driver);
        Operations.matchText(LandingPageOR.Locator.ExpenseCategories,LandingPageOR.UIElements.ExpenseCategories, driver);
        Operations.matchText(LandingPageOR.Locator.AdminReports,LandingPageOR.UIElements.AdminReports, driver);
        Operations.matchText(LandingPageOR.Locator.Merchants,LandingPageOR.UIElements.Merchants, driver);

        //Top Bar Text Validation
        Operations.matchText(LandingPageOR.Locator.OrgName,LandingPageOR.UIElements.OrgName, driver);
        Operations.matchText(LandingPageOR.Locator.UserName,LandingPageOR.UIElements.UserName, driver);
        Operations.matchText(LandingPageOR.Locator.UserRole,LandingPageOR.UIElements.UserRole, driver);
        Operations.matchText(LandingPageOR.Locator.UserDP,LandingPageOR.UIElements.UserDP, driver);

        //Main Section Text Validation
        Operations.matchText(LandingPageOR.Locator.BasicInfo,LandingPageOR.UIElements.BasicInfo, driver);
        Operations.matchText(LandingPageOR.Locator.PersonalDetails,LandingPageOR.UIElements.PersonalDetails, driver);
        Operations.matchText(LandingPageOR.Locator.NameField,LandingPageOR.UIElements.NameField, driver);
        Operations.matchText(LandingPageOR.Locator.Name,LandingPageOR.UIElements.Name, driver);
        Operations.matchText(LandingPageOR.Locator.EmailField,LandingPageOR.UIElements.EmailField, driver);
        Operations.matchText(LandingPageOR.Locator.Email,LandingPageOR.UIElements.Email, driver);
        Operations.matchText(LandingPageOR.Locator.IDField,LandingPageOR.UIElements.IDField, driver);
        Operations.matchText(LandingPageOR.Locator.ID,LandingPageOR.UIElements.ID, driver);
        Operations.matchText(LandingPageOR.Locator.MobileField,LandingPageOR.UIElements.MobileField, driver);
        Operations.matchText(LandingPageOR.Locator.Mobile,LandingPageOR.UIElements.Mobile, driver);
        Operations.matchText(LandingPageOR.Locator.DOJField,LandingPageOR.UIElements.DOJField, driver);
        Operations.matchText(LandingPageOR.Locator.DOJ,LandingPageOR.UIElements.DOJ, driver);
        Operations.matchText(LandingPageOR.Locator.DOBField,LandingPageOR.UIElements.DOBField, driver);
        Operations.matchText(LandingPageOR.Locator.DOB,LandingPageOR.UIElements.DOB, driver);
        Operations.matchText(LandingPageOR.Locator.RoleField,LandingPageOR.UIElements.RoleField, driver);
        Operations.matchText(LandingPageOR.Locator.Role,LandingPageOR.UIElements.Role, driver);

    }
    @Override
    public void verifySideMenuArrowClick(WebDriver driver) throws InterruptedException{
        Operations.click(LandingPageOR.Locator.SideMenuArrow, driver);
        Operations.verifyElementIsPresent(LandingPageOR.Locator.Logo, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.SideMenuArrow, driver);
        Operations.click(LandingPageOR.Locator.SideMenuArrow, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.Logo, driver);
    }

    @Override
    public void verifyOrgDropdown(WebDriver driver) throws InterruptedException{
        Operations.click(LandingPageOR.Locator.OrgDropdown, driver);
        Operations.sleep(1000);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.MyOrg, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.ManageButton, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.OrgSearch, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.OrgList, driver);
        Operations.click(LandingPageOR.Locator.OrgDropdown, driver);
    }

    @Override
    public void verifyNotificationPanel(WebDriver driver) throws InterruptedException{
        Operations.click(LandingPageOR.Locator.NotificationIcon, driver);
        Operations.sleep(1000);
        Operations.matchText(LandingPageOR.Locator.NotificationText,LandingPageOR.UIElements.NotificationText, driver);
        Operations.click(LandingPageOR.Locator.NotificationCross, driver);
    }

    @Override
    public void verifyLanguageDropdown(WebDriver driver) throws InterruptedException{
        Operations.click(LandingPageOR.Locator.LangDropdown, driver);
        Operations.sleep(1000);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.LangList, driver);
        Operations.click(LandingPageOR.Locator.LangDropdown, driver);
    }
    @Override
    public void verifyLogout(WebDriver driver) throws InterruptedException{
        Operations.click(LandingPageOR.Locator.UserDP, driver);
        Operations.sleep(1000);
        Operations.click(LandingPageOR.Locator.LogoutButton, driver);
        Operations.verifyElementIsDisplayed(LandingPageOR.Locator.WelcomeText, driver);
    }

}
