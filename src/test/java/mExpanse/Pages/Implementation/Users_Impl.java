package mExpanse.Pages.Implementation;

import com.thedeanda.lorem.LoremIpsum;
import mExpance.Library.Operations;
import mExpanse.Pages.Interface.Users_Interface;
import mExpanse.Pages.ObjectRepository.LogInOR;
import mExpanse.Pages.ObjectRepository.UsersOR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Users_Impl implements Users_Interface {

    LoremIpsum ipsum = new LoremIpsum();
    String userName = ipsum.getWords(1,2);
    String emailPrefix = "test.monstarlab001+";
    String designation = ipsum.getTitle(1,2);
    int randomEmployeeID = Operations.createRandomIntBetween(1000,4000);
    String randomEmail = Operations.generateValidRandomEmail(emailPrefix);
    @Override
    public void guiVerification(WebDriver driver) throws InterruptedException {

        //Operations.matchText(UsersOR.Locator.AdminView, UsersOR.UIElementConstant.AdminViewLinkText, driver);
        //Operations.click(UsersOR.Locator.AdminView, driver);
        //Operations.sleep(3000);
        //Operations.matchText(UsersOR.Locator.Users, UsersOR.UIElementConstant.UsersLinkText, driver);
        //Operations.click(UsersOR.Locator.Users, driver);
        //Operations.matchText(UsersOR.Locator.AddUserButton, UsersOR.UIElementConstant.AddUserButtonText, driver);
        //Operations.click(UsersOR.Locator.AddUserButton, driver);
        Operations.matchText(UsersOR.Locator.AddUserLabel, UsersOR.UIElementConstant.AddUserLabelText, driver);
        Operations.matchText(UsersOR.Locator.NameLabel, UsersOR.UIElementConstant.NameLabelText, driver);
        Operations.matchAttribute(UsersOR.Locator.NameTextBox, UsersOR.UIElementConstant.AddUserNamePlaceholder,"placeholder", driver);
        Operations.matchText(UsersOR.Locator.EmployeeIdLabel, UsersOR.UIElementConstant.EmployeeIdLabelText, driver);
        Operations.sleep(3000);
        Operations.matchAttribute(UsersOR.Locator.EmployeeIDTextBox, UsersOR.UIElementConstant.EmployeeIdPlaceholder,"placeholder", driver);
        Operations.matchText(UsersOR.Locator.EmailLabel, UsersOR.UIElementConstant.EmailLevelText, driver);
        Operations.sleep(3000);
        Operations.matchAttribute(UsersOR.Locator.EmailTextBox, UsersOR.UIElementConstant.EmailPlaceholder,"placeholder", driver);
        Operations.matchText(UsersOR.Locator.RoleLabel, UsersOR.UIElementConstant.RoleLabelText, driver);
        Operations.matchText(UsersOR.Locator.SubmitsToLabel, UsersOR.UIElementConstant.SubmitsToLabelText, driver);
        Operations.scrollIntoElement(UsersOR.Locator.SubmitsToDropdown, driver);
        Operations.matchText(UsersOR.Locator.SubmitsToDropdown, UsersOR.UIElementConstant.SubmitsToPlaceholder, driver);
        Operations.matchText(UsersOR.Locator.DateOfJoiningLabel, UsersOR.UIElementConstant.DateOfJoiningLabelText, driver);
        Operations.matchText(UsersOR.Locator.DesignationLabel, UsersOR.UIElementConstant.DesignationLabelText, driver);
        //Operations.sleep(3000);
        //Operations.click(UsersOR.Locator.DesignationDropdown, driver);
        //Operations.matchText(UsersOR.Locator.DesignationDropdownList, UsersOR.UIElementConstant.DesignationPlaceholder, driver);

    }
    public void navigationToUsers(WebDriver driver){
        Operations.click(UsersOR.Locator.AdminView, driver);
        Operations.click(UsersOR.Locator.Users, driver);
        Operations.click(UsersOR.Locator.AddUserButton, driver);
    }
    public void checkBlankMandatoryFields(WebDriver driver){

        Operations.click(UsersOR.Locator.SaveButton, driver);
        Operations.matchText(UsersOR.Locator.NameRequireValidationAlert, UsersOR.UIElementConstant.NameRequireValidationText, driver);
        Operations.matchText(UsersOR.Locator.EmailRequireValidationAlert, UsersOR.UIElementConstant.EmailRequireValidationText, driver);
    }
    public void checkCancelButtonClosesDrawer(WebDriver driver){

        Operations.click(UsersOR.Locator.CancelButton, driver);
        Operations.verifyElementIsPresent(UsersOR.Locator.UsersDrawerBody, driver);
        Operations.verifyElementIsPresent(UsersOR.Locator.UsersDrawerBody, driver);
    }
    public void checkCloseButtonClosesDrawer(WebDriver driver){

        Operations.click(UsersOR.Locator.DrawerCloseButton, driver);
        Operations.verifyElementIsPresent(UsersOR.Locator.UsersDrawerBody, driver);

    }
    public void checkEmailWithIncorrectFormat(WebDriver driver) throws InterruptedException{

        Operations.sendText(UsersOR.Locator.EmailTextBox, "tamrin-lab.com", driver);
        Operations.matchText(UsersOR.Locator.InvalidEmailValidationAlert, UsersOR.UIElementConstant.InvalidEmailValidationText, driver);
        Operations.sleep(2000);
        Operations.clear(UsersOR.Locator.EmailTextBox, driver);
        Operations.sendText(UsersOR.Locator.EmailTextBox, "tamrin@@gmail.com", driver);
        Operations.matchText(UsersOR.Locator.InvalidEmailValidationAlert, UsersOR.UIElementConstant.InvalidEmailValidationText, driver);
        Operations.sleep(2000);
        Operations.clear(UsersOR.Locator.EmailTextBox, driver);
        Operations.sendText(UsersOR.Locator.EmailTextBox, "tamrin@gmail..com", driver);
        Operations.matchText(UsersOR.Locator.InvalidEmailValidationAlert, UsersOR.UIElementConstant.InvalidEmailValidationText, driver);
    }
    public void checkForSubmitterApprovesAndForwardsToNotDisplaying(WebDriver driver) throws InterruptedException{

        Operations.click(UsersOR.Locator.AddUserButton, driver);
        Operations.sendText(UsersOR.Locator.NameTextBox,"Tamrin QA", driver);
        Operations.sendText(UsersOR.Locator.EmployeeIDTextBox,"100", driver);
        Operations.sendText(UsersOR.Locator.EmailTextBox,"test384@g.com", driver);
        Operations.click(UsersOR.Locator.RoleSubmitter, driver);
        Operations.checkElementNotFound(UsersOR.Locator.ApprovesAndForwardsToLabel,driver);
        Operations.sleep(4000);
    }
    public void addRandomUser(WebDriver driver, String Role) throws InterruptedException{

        Operations.click(UsersOR.Locator.AddUserButton, driver);
        Operations.sendText(UsersOR.Locator.NameTextBox,userName, driver);
        Operations.sendText(UsersOR.Locator.EmployeeIDTextBox,String.valueOf(randomEmployeeID), driver);
        Operations.sendText(UsersOR.Locator.EmailTextBox,randomEmail, driver);
        Operations.click((UsersOR.Locator.RoleSubmitter), driver);
        Operations.sleep(4000);
        By RoleName = Operations.modificationXpath("div", "ant-select-item-option-content", Role);
        Operations.click(RoleName, driver );
        Operations.click(UsersOR.Locator.SaveButton, driver);
        Operations.waitUntilElementIsVisible(UsersOR.Locator.UserCreatedSuccessfullyMessage, driver);
        Operations.matchText(UsersOR.Locator.UserCreatedSuccessfullyMessage, UsersOR.UIElementConstant.UserCreatedSuccessMsgText, driver);
        Operations.sleep(4000);
    }
    public void addNewApprover( WebDriver driver) throws InterruptedException{

        Operations.sendText(UsersOR.Locator.NameTextBox,userName, driver);
        Operations.sendText(UsersOR.Locator.EmployeeIDTextBox,String.valueOf(randomEmployeeID), driver);
        Operations.sendText(UsersOR.Locator.EmailTextBox,randomEmail, driver);
        Operations.scrollIntoElement(UsersOR.Locator.SubmitsToTextBox, driver);
        Operations.click(UsersOR.Locator.RoleSubmitter, driver);
        Operations.click(UsersOR.Locator.RoleApprover, driver);
        Operations.click(UsersOR.Locator.SubmitsToTextBox,driver);
        int sizeOfStartIndex = Operations.selectRandomValueFromDivDropdownWithSize(UsersOR.Locator.DivDropdownList,3, driver);
        Operations.click(UsersOR.Locator.ApprovesAndForwardsToTextBox, driver);
        Operations.selectRandomValueFromDivDropdownWithSize(UsersOR.Locator.DivDropdownList,sizeOfStartIndex, driver);
        Operations.click(UsersOR.Locator.DateOfJoiningDatePicker, driver);
        Operations.sleep(3000);
        Operations.click(UsersOR.Locator.DatePickerYear, driver);
        Operations.sleep(3000);
        Operations.selectRandomDateAndMonthFromDatePicker(UsersOR.Locator.DatePickerMonth,UsersOR.Locator.DatePickerBody, driver);
        Operations.sleep(3000);
        Operations.scrollIntoElement(UsersOR.Locator.DesignationTextBox, driver);
        Operations.click(UsersOR.Locator.DesignationTextBox, driver);
        Operations.click(UsersOR.Locator.AddDesignationTextBox,driver);
        Operations.sendText(UsersOR.Locator.AddDesignationTextBox, "qa", driver);
        Operations.click(UsersOR.Locator.AddDesignationButton, driver);
        //Operations.click(UsersOR.Locator.SaveButton, driver);
    }
    public void addNewAdmin(WebDriver driver) throws InterruptedException{

        Operations.click(UsersOR.Locator.AddUserButton, driver);
        Operations.sendText(UsersOR.Locator.NameTextBox,userName, driver);
        Operations.sendText(UsersOR.Locator.EmployeeIDTextBox, String.valueOf(randomEmployeeID), driver);
        Operations.sendText(UsersOR.Locator.EmailTextBox,randomEmail, driver);
        Operations.scrollIntoElement(UsersOR.Locator.SubmitsToTextBox, driver);
        Operations.click(UsersOR.Locator.RoleSubmitter, driver);
        Operations.click(UsersOR.Locator.RoleAdmin, driver);
        Operations.click(UsersOR.Locator.SubmitsToTextBox,driver);
        int sizeOfStartIndex = Operations.selectRandomValueFromDivDropdownWithSize(UsersOR.Locator.DivDropdownList,3, driver);
        Operations.click(UsersOR.Locator.ApprovesAndForwardsToTextBox, driver);
        Operations.selectRandomValueFromDivDropdownWithSize(UsersOR.Locator.DivDropdownList,sizeOfStartIndex, driver);
        Operations.click(UsersOR.Locator.DateOfJoiningDatePicker, driver);
        Operations.sleep(3000);
        Operations.click(UsersOR.Locator.DatePickerYear, driver);
        Operations.sleep(3000);
        Operations.selectRandomDateAndMonthFromDatePicker(UsersOR.Locator.DatePickerMonth,UsersOR.Locator.DatePickerBody, driver);
        Operations.sleep(3000);
        Operations.scrollIntoElement(UsersOR.Locator.DesignationTextBox, driver);
        Operations.click(UsersOR.Locator.DesignationTextBox, driver);
        Operations.click(UsersOR.Locator.AddDesignationTextBox,driver);
        Operations.sendText(UsersOR.Locator.AddDesignationTextBox, designation, driver);
        Operations.click(UsersOR.Locator.AddDesignationButton, driver);
        Operations.selectLastIndexFromDropdown(UsersOR.Locator.DivDropdownList, driver);
        Operations.click(UsersOR.Locator.SaveButton, driver);
        Operations.waitUntilElementIsVisible(UsersOR.Locator.UserCreatedSuccessfullyMessage, driver);
        Operations.matchText(UsersOR.Locator.UserCreatedSuccessfullyMessage, UsersOR.UIElementConstant.UserCreatedSuccessMsgText, driver);
        Operations.sleep(4000);
    }

    public void createNewDesignation(WebDriver driver, String Role) throws InterruptedException{

        Operations.click(UsersOR.Locator.AddUserButton, driver);
        Operations.sendText(UsersOR.Locator.NameTextBox,userName, driver);
        Operations.sendText(UsersOR.Locator.EmployeeIDTextBox,String.valueOf(randomEmployeeID), driver);
        Operations.sendText(UsersOR.Locator.EmailTextBox,randomEmail, driver);
        Operations.click((UsersOR.Locator.RoleSubmitter), driver);
        By RoleName = Operations.modificationXpath("div", "ant-select-item-option-content", Role);
        Operations.click(RoleName, driver );
        Operations.scrollIntoElement(UsersOR.Locator.DesignationTextBox, driver);
        Operations.click(UsersOR.Locator.DesignationTextBox, driver);
        Operations.click(UsersOR.Locator.AddDesignationTextBox,driver);
        Operations.sendText(UsersOR.Locator.AddDesignationTextBox, designation, driver);
        Operations.click(UsersOR.Locator.AddDesignationButton, driver);
        Operations.selectLastIndexFromDropdown(UsersOR.Locator.DivDropdownList, driver);
        Operations.click(UsersOR.Locator.SaveButton, driver);
        Operations.sleep(4000);
    }
    public void addUserForFutureDate(WebDriver driver, String Role) throws InterruptedException{

        Operations.click(UsersOR.Locator.AddUserButton, driver);
        Operations.sendText(UsersOR.Locator.NameTextBox,userName, driver);
        Operations.sendText(UsersOR.Locator.EmployeeIDTextBox,String.valueOf(randomEmployeeID), driver);
        Operations.sendText(UsersOR.Locator.EmailTextBox,randomEmail, driver);
        Operations.click((UsersOR.Locator.RoleSubmitter), driver);
        By RoleName = Operations.modificationXpath("div", "ant-select-item-option-content", Role);
        Operations.click(RoleName, driver );
        Operations.scrollIntoElement(UsersOR.Locator.DesignationTextBox, driver);
        Operations.click(UsersOR.Locator.DateOfJoiningDatePicker, driver);
        Operations.sleep(3000);
        Operations.click(UsersOR.Locator.DatePickerYear, driver);
        Operations.sleep(3000);
        Operations.selectRandomDateAndMonthFromDatePicker(UsersOR.Locator.DatePickerMonth,UsersOR.Locator.DatePickerBody, driver);
        Operations.sleep(3000);
        Operations.click(UsersOR.Locator.SaveButton, driver);
        Operations.waitUntilElementIsVisible(UsersOR.Locator.UserCreatedSuccessfullyMessage, driver);
        Operations.matchText(UsersOR.Locator.UserCreatedSuccessfullyMessage, UsersOR.UIElementConstant.UserCreatedSuccessMsgText, driver);
        Operations.sleep(4000);

    }


}
