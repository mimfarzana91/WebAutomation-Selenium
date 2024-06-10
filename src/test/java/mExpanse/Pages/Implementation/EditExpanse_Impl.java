package mExpanse.Pages.Implementation;

import com.thedeanda.lorem.LoremIpsum;
import mExpance.Library.Operations;
import mExpanse.Pages.Interface.EditExpanse_Interface;
import mExpanse.Pages.ObjectRepository.EditExpanseOR;
import mExpanse.Pages.ObjectRepository.NewExpanseOR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditExpanse_Impl implements EditExpanse_Interface {
    LoremIpsum ipsum = new LoremIpsum();

    public String[] createUnreportedExpanse(WebDriver driver)throws InterruptedException{
        Operations.click(NewExpanseOR.locator.dateInput,driver);
        Operations.sleep(3000);
        Operations.selectRandomDateFromDatePicker(NewExpanseOR.locator.dateInput2,1,2,driver);
        Operations.sleep(2000);
        Operations.click(NewExpanseOR.locator.merchantDrpDown,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.merchantDrpDown2,driver);
        Operations.sleep(3000);
        String merchantName=Operations.getText(NewExpanseOR.locator.merchantDrpDown,driver);
        //Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.merchantDrpDown2,0,driver);
        Operations.sleep(1000);
        Operations.click(NewExpanseOR.locator.currencyDrpDown,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.currencyDrpDown2,driver);
        Operations.sleep(2000);

        Operations.click(NewExpanseOR.locator.categoryDrpDown,driver);
        Operations.sleep(1000);
        //Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.categoryDrpDown,2,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.categoryDrpDown2,driver);
        Operations.sleep(3000);
        String catagoryName=Operations.getTitle(NewExpanseOR.locator.catagoryText,driver);
        System.out.println(catagoryName);
        String amount1 = String.valueOf(Operations.createRandomIntBetween(10,50));
        Operations.sendText(NewExpanseOR.locator.amountInput,amount1,driver);
        Operations.sleep(1000);
        Operations.matchText(NewExpanseOR.locator.totalAmount,amount1,driver);
        Operations.scrollBarDown(driver);

        Operations.sendText(NewExpanseOR.locator.referenceInput,ipsum.getWords(2),driver);
        //Operations.randomDropdownList(NewExpanseOR.locator.addToReportDrpDown,driver);
        //Operations.click(NewExpanseOR.locator.addToReportDrpDown,driver);
        //Operations.sleep(3000);
        //Operations.scrollIntoElement(NewExpanseOR.locator.reportDrobBox,driver);
        //By selectedReport=Operations.modificationXpath("span", "ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line",reportNumber);
        //Operations.click(selectedReport,driver);
        Operations.sendText(NewExpanseOR.locator.descriptionInput,ipsum.getWords(10),driver);
        Operations.sleep(1000);

        Operations.click(NewExpanseOR.locator.saveBtn,driver);
        String[] expenseInfo={merchantName,amount1, catagoryName};
        return expenseInfo;
    }
    public void openEditUnreportedExpanse(WebDriver driver)throws InterruptedException{
        Operations.click(EditExpanseOR.locator.expanse,driver);
        Operations.click(EditExpanseOR.locator.dotButton,driver);
        Operations.click(EditExpanseOR.locator.editButton,driver);
    }
    public String[] editExpanse(WebDriver driver)throws InterruptedException{
        Operations.click(NewExpanseOR.locator.dateInput,driver);
        Operations.sleep(3000);
        Operations.selectRandomDateFromDatePicker(NewExpanseOR.locator.dateInput2,1,2,driver);
        Operations.sleep(2000);
        Operations.click(NewExpanseOR.locator.merchantDrpDown,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.merchantDrpDown2,driver);
        Operations.sleep(3000);
        String merchantName=Operations.getText(NewExpanseOR.locator.merchantDrpDown,driver);
        //Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.merchantDrpDown2,0,driver);
        Operations.sleep(1000);
        Operations.click(NewExpanseOR.locator.currencyDrpDown,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.currencyDrpDown2,driver);
        Operations.sleep(2000);

        Operations.click(NewExpanseOR.locator.categoryDrpDown,driver);
        Operations.sleep(1000);
        //Operations.selectRandomValueFromDivDropdownWithSize(NewExpanseOR.locator.categoryDrpDown,2,driver);
        Operations.randomDropdownList(NewExpanseOR.locator.categoryDrpDown2,driver);
        Operations.sleep(3000);
        String catagoryName=Operations.getTitle(NewExpanseOR.locator.catagoryText,driver);
        System.out.println(catagoryName);
        String amount1 = String.valueOf(Operations.createRandomIntBetween(10,50));
        Operations.sendText(NewExpanseOR.locator.amountInput,amount1,driver);
        Operations.sleep(1000);
        Operations.matchText(NewExpanseOR.locator.totalAmount,amount1,driver);
        Operations.scrollBarDown(driver);

        Operations.sendText(NewExpanseOR.locator.referenceInput,ipsum.getWords(2),driver);
        //Operations.randomDropdownList(NewExpanseOR.locator.addToReportDrpDown,driver);
        //Operations.click(NewExpanseOR.locator.addToReportDrpDown,driver);
        //Operations.sleep(3000);
        //Operations.scrollIntoElement(NewExpanseOR.locator.reportDrobBox,driver);
        //By selectedReport=Operations.modificationXpath("span", "ant-typography ant-typography-ellipsis ant-typography-single-line ant-typography-ellipsis-single-line",reportNumber);
        //Operations.click(selectedReport,driver);
        Operations.sendText(NewExpanseOR.locator.descriptionInput,ipsum.getWords(10),driver);
        Operations.sleep(1000);

        Operations.click(NewExpanseOR.locator.saveBtn,driver);
        String[] expenseInfo={merchantName,amount1, catagoryName};
        return expenseInfo;
    }
}
