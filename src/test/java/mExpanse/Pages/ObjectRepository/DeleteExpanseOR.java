package mExpanse.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class DeleteExpanseOR {
    public static class locator{
        public static By deleteButton = By.xpath("//span[contains(text(),'Delete')]");
        public static By amount = By.xpath("//tbody/tr[2]/td[3]");
        public static By modalTextLocator = By.xpath("/div[contains(text(),'If you delete this expense, you cannot retrieve it')]");
        public static By modalDeleteButton = By.xpath("//body/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[2]");
    }

    public static class UIElements{
        public static String modalText = "If you delete this expense, you cannot retrieve it. Are you sure you want to delete?";
    }
}
