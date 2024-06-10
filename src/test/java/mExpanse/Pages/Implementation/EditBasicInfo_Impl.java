package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.EditBasicInfo_Interface;
import mExpanse.Pages.ObjectRepository.EditBasicInfoOR;
import mExpanse.Pages.ObjectRepository.LandingPageOR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.SQLOutput;

public class EditBasicInfo_Impl implements EditBasicInfo_Interface {

    @Override
    public void guiValidation(WebDriver driver) throws InterruptedException {

        Operations.click(EditBasicInfoOR.Locator.EditButton, driver);
        Operations.sleep(1000);
        Operations.matchText(EditBasicInfoOR.Locator.EditFormTitle, EditBasicInfoOR.UIElements.EditFormTitle, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.EditFormCross, driver);
        Operations.click(EditBasicInfoOR.Locator.EditFormCross, driver);
        Operations.click(EditBasicInfoOR.Locator.EditButton, driver);
        Operations.sleep(1000);

        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.NameField, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.Name, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.EmailField, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.Email, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.IDField, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.ID, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.MobileField, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.Mobile, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.DOJField, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.DOJ, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.DOBField, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.DOB, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.RoleField, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.Role, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.CancelButton, driver);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.SaveButton, driver);

        Operations.matchText(EditBasicInfoOR.Locator.NameField,EditBasicInfoOR.UIElements.NameField, driver);
        Operations.matchAttribute(EditBasicInfoOR.Locator.Name,EditBasicInfoOR.UIElements.Name, "value",driver);
        Operations.matchText(EditBasicInfoOR.Locator.EmailField,EditBasicInfoOR.UIElements.EmailField, driver);
        Operations.matchAttribute(EditBasicInfoOR.Locator.Email,EditBasicInfoOR.UIElements.Email, "value",driver);
        Operations.matchText(EditBasicInfoOR.Locator.IDField,EditBasicInfoOR.UIElements.IDField, driver);
        Operations.matchAttribute(EditBasicInfoOR.Locator.ID,EditBasicInfoOR.UIElements.ID, "value",driver);
        Operations.matchText(EditBasicInfoOR.Locator.MobileField,EditBasicInfoOR.UIElements.MobileField, driver);
        Operations.matchAttribute(EditBasicInfoOR.Locator.Mobile,EditBasicInfoOR.UIElements.Mobile, "value",driver);
        Operations.matchText(EditBasicInfoOR.Locator.DOJField,EditBasicInfoOR.UIElements.DOJField, driver);
        Operations.matchAttribute(EditBasicInfoOR.Locator.DOJ,EditBasicInfoOR.UIElements.DOJ, "value",driver);
        Operations.matchText(EditBasicInfoOR.Locator.DOBField,EditBasicInfoOR.UIElements.DOBField, driver);
        Operations.matchAttribute(EditBasicInfoOR.Locator.DOB,EditBasicInfoOR.UIElements.DOB, "value",driver);
        Operations.matchText(EditBasicInfoOR.Locator.RoleField,EditBasicInfoOR.UIElements.RoleField, driver);
        Operations.matchAttribute(EditBasicInfoOR.Locator.Role,EditBasicInfoOR.UIElements.Role, "value",driver);

        Operations.matchText(EditBasicInfoOR.Locator.CancelButton,EditBasicInfoOR.UIElements.CancelButton, driver);
        Operations.matchText(EditBasicInfoOR.Locator.SaveButton,EditBasicInfoOR.UIElements.SaveButton, driver);

    }
    @Override
    public void nameVerification(WebDriver driver) throws InterruptedException{
        Operations.clear(EditBasicInfoOR.Locator.Name, driver);
        Operations.sleep(1000);
        Operations.clear(EditBasicInfoOR.Locator.Name, driver);
        Operations.matchText(EditBasicInfoOR.Locator.NameError, EditBasicInfoOR.UIElements.NameError, driver);
        Operations.sendText(EditBasicInfoOR.Locator.Name, "567890-=][poiuytrewqasdfghjkl;'/.,mnbvcxz", driver);
        Operations.sleep(1000);
        Operations.matchText(EditBasicInfoOR.Locator.NameErrorMaxChar, EditBasicInfoOR.UIElements.NameErrorMaxChar, driver);
        Operations.clear(EditBasicInfoOR.Locator.Name, driver);
        Operations.sendText(EditBasicInfoOR.Locator.Name, "Test234_)(*&", driver);
        Operations.click(EditBasicInfoOR.Locator.SaveButton, driver);
        Operations.sleep(1000);
        Operations.click(EditBasicInfoOR.Locator.EditButton, driver);
        Operations.sleep(1000);
        Operations.matchAttribute(EditBasicInfoOR.Locator.Name, "Test234_)(*&", "value",driver);
        Operations.clear(EditBasicInfoOR.Locator.Name, driver);
        Operations.sendText(EditBasicInfoOR.Locator.Name, "Test qa", driver);
        Operations.click(EditBasicInfoOR.Locator.SaveButton, driver);
        Operations.sleep(1000);
        Operations.click(EditBasicInfoOR.Locator.EditButton, driver);
    }
    @Override
    public void emailVerification(WebDriver driver) throws InterruptedException{
        Operations.verifyElementIsEnabled(EditBasicInfoOR.Locator.Email, driver);
    }
    @Override
    public void empIdVerification(WebDriver driver) throws InterruptedException{
        Operations.verifyElementIsEnabled(EditBasicInfoOR.Locator.ID, driver);
    }
    @Override
    public void mobileVerification(WebDriver driver) throws InterruptedException{
        Operations.clear(EditBasicInfoOR.Locator.Mobile, driver);
        Operations.sleep(1000);
        Operations.matchText(By.xpath("//DIV[@role='alert'][text()='Please enter your mobile number']"), "Please enter your mobile number", driver);
        Operations.sendText(EditBasicInfoOR.Locator.Mobile, "@135356-93865", driver);
        Operations.sleep(1000);
        Operations.matchText(By.xpath("//DIV[@role='alert'][text()='Please use a valid mobile number']"), "Please use a valid mobile number", driver);
        Operations.clear(EditBasicInfoOR.Locator.Mobile, driver);

        Operations.sendText(EditBasicInfoOR.Locator.Mobile, "@135-w:39385", driver);
        Operations.sleep(1000);
        Operations.matchText(By.xpath("//DIV[@role='alert'][text()='Please use a valid mobile number']"), "Please use a valid mobile number", driver);
        Operations.clear(EditBasicInfoOR.Locator.Mobile, driver);

        Operations.sendText(EditBasicInfoOR.Locator.Mobile, "swsfbjurtygh", driver);
        Operations.sleep(1000);
        Operations.matchText(By.xpath("//DIV[@role='alert'][text()='Please use a valid mobile number']"), "Please use a valid mobile number", driver);
        Operations.clear(EditBasicInfoOR.Locator.Mobile, driver);

        Operations.sendText(EditBasicInfoOR.Locator.Mobile, "12345678", driver);
        Operations.sleep(1000);
        Operations.matchText(By.xpath("//DIV[@role='alert']"), "Mobile number can't be less than 11 characters", driver);
        Operations.clear(EditBasicInfoOR.Locator.Mobile, driver);

        Operations.sendText(EditBasicInfoOR.Locator.Mobile, "+8801912345169", driver);
        Operations.sleep(1000);

        Operations.click(EditBasicInfoOR.Locator.SaveButton, driver);
        Operations.sleep(1000);
        Operations.click(EditBasicInfoOR.Locator.EditButton, driver);
        Operations.sleep(1000);
    }
    @Override
    public void dateOfJoiningVerification(WebDriver driver) throws InterruptedException{
        Operations.verifyElementIsEnabled(EditBasicInfoOR.Locator.DOJ, driver);
    }
    @Override
    public void dateOfBirthVerification(WebDriver driver) throws InterruptedException{
        Operations.scrollIntoElement(EditBasicInfoOR.Locator.DOB, driver);
        Operations.sleep(1000);
        Operations.clear(EditBasicInfoOR.Locator.DOB, driver);
        Operations.sleep(1000);

        String RandomDate = Operations.createRandomDate(2023,2025,1,12,1,31);
        Operations.sendText(EditBasicInfoOR.Locator.DOB,RandomDate, driver);
        Operations.sleep(2000);
        Operations.click(EditBasicInfoOR.Locator.RoleField, driver);

        Operations.clear(EditBasicInfoOR.Locator.DOB, driver);
        Operations.sleep(1000);
        Operations.selectRandomDateFromDatePicker(EditBasicInfoOR.Locator.DatePicker,1,31, driver);
        Operations.click(EditBasicInfoOR.Locator.RoleField, driver);
        Operations.sleep(2000);

        Operations.clear(EditBasicInfoOR.Locator.DOB, driver);
        Operations.sleep(1000);
        Operations.sendText(EditBasicInfoOR.Locator.DOB, "2022-10-01", driver);
        Operations.sleep(1000);
        Operations.click(By.xpath("(//DIV[@class='date-cell-custom'][text()='1'])[1]"), driver);
        Operations.click(EditBasicInfoOR.Locator.RoleField, driver);

    }
    @Override
    public void roleNameVerification(WebDriver driver) throws InterruptedException{
        Operations.verifyElementIsEnabled(EditBasicInfoOR.Locator.Role, driver);
    }
    @Override
    public void saveButtonVerification(WebDriver driver) throws InterruptedException{
        Operations.click(EditBasicInfoOR.Locator.SaveButton, driver);
        Operations.sleep(1000);
        Operations.matchText(LandingPageOR.Locator.Name,LandingPageOR.UIElements.Name, driver);
        Operations.matchText(LandingPageOR.Locator.Mobile,LandingPageOR.UIElements.Mobile, driver);
        Operations.matchText(LandingPageOR.Locator.DOB,LandingPageOR.UIElements.DOB, driver);

    }
    @Override
    public void cancelButtonVerification(WebDriver driver) throws InterruptedException{
        Operations.click(EditBasicInfoOR.Locator.EditButton, driver);
        Operations.sleep(1000);
        Operations.click(EditBasicInfoOR.Locator.CancelButton, driver);
        Operations.sleep(1000);
        Operations.verifyElementIsDisplayed(EditBasicInfoOR.Locator.EditButton, driver);

    }

}
