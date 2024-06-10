package mExpanse.Pages.Implementation;

import mExpance.Library.Operations;
import mExpanse.Pages.Interface.DeleteExpanse_Interface;
import mExpanse.Pages.ObjectRepository.DeleteExpanseOR;
import mExpanse.Pages.ObjectRepository.EditExpanseOR;
import org.openqa.selenium.WebDriver;

public class DeleteExpanse_Impl implements DeleteExpanse_Interface {

    public void openDeleteUnreportedExpanse(WebDriver driver)throws InterruptedException{
        Operations.click(EditExpanseOR.locator.expanse,driver);
        Operations.click(EditExpanseOR.locator.dotButton,driver);
        Operations.click(DeleteExpanseOR.locator.deleteButton,driver);
        Operations.sleep(1000);


    }

    public void deleteUnreportedExpanse(WebDriver driver)throws InterruptedException{
        Operations.matchText(DeleteExpanseOR.locator.modalTextLocator,DeleteExpanseOR.UIElements.modalText,driver);
        Operations.click(DeleteExpanseOR.locator.modalDeleteButton,driver);
        Operations.sleep(3000);

    }
}
