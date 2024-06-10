package mExpance.Library;

import com.thedeanda.lorem.LoremIpsum;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static org.apache.commons.lang3.RandomStringUtils.*;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Set;


public class Operations {

    public static WebElement findElement(By path, WebDriver driver) {
        WebElement el = driver.findElement(path);
        return el;
    }

    public static String getTitle(By path, WebDriver driver) {
        String el = driver.findElement(path).getAttribute("title");
        return el;
    }

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static void click(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        el.click();
    }
    public static void clickActions(By locator,WebDriver driver){
        WebElement el = findElement(locator,driver);

        Actions actions = new Actions(driver);

        actions.moveToElement(el).click().build().perform();
    }

    public static void clear(By locator, WebDriver driver) {

        WebElement el = findElement(locator, driver);
        while (!el.getAttribute("value").equals("")) {
            el.click();
            el.sendKeys(Keys.BACK_SPACE);
        }
     }
    public static String randomName(By locator, WebDriver driver){
        WebElement el = findElement(locator, driver);
        LoremIpsum lorem = LoremIpsum.getInstance();
        String name = lorem.getName();
        el.sendKeys(name);
        return name;

    }
    public static String randomNumber(By locator, WebDriver driver) throws InterruptedException{

        WebElement el = findElement(locator, driver);
        Random rnd = new Random();
        int number = rnd.nextInt(99999999);
        String num = String.format("%08d", number);
        el.sendKeys(num);
        return num;

    }

    public static void refresh(WebDriver driver){

        driver.navigate().refresh();
    }

    public static String randomPass(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        String symbol = "-/.^&*_!@%=+>)";
        String cap_letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_letter = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String pwd = RandomStringUtils.random(10, cap_letter+small_letter+numbers);
        el.sendKeys(pwd);
        return pwd;
    }


    public static void enter(By locator, WebDriver driver) {

        WebElement el = findElement(locator, driver);
            el.sendKeys(Keys.RETURN);
    }


    public static void sendText(By locator, String text, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        el.clear();
        el.sendKeys(text);
    }

    public static void matchText(By locator, String expectedText, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        String actualText = el.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public static String getText(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        return el.getText();
    }

    public static void matchAttribute(By locator, String expectedText, String attributeName, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        String actualText = el.getAttribute(attributeName);

        Assert.assertEquals(actualText, expectedText);
    }

    public static void matchColor(By locator, String expectedColorCode, String ValueName, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        String actualColor = el.getCssValue(ValueName);
        String hexcolor = Color.fromString(actualColor).asHex();
        Assert.assertEquals(hexcolor, expectedColorCode);
    }


    public static void sleep(long ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    public static boolean verifyElementIsDisplayed(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        boolean isDisplayed = el.isDisplayed();
        System.out.println("Element displayed is : " + isDisplayed);
        return isDisplayed;
    }

    public static boolean verifyElementIsEnabled(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        boolean isEnabled = el.isEnabled();
        System.out.println("Element enabled is : " + isEnabled);
        return isEnabled;
    }

    public static boolean verifyElementIsSelected(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        boolean isSelected = el.isSelected();
        System.out.println("Element selected is : " + isSelected);
        return isSelected;
    }

    public static void scrollIntoElement(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
    }

    public static boolean verifyElementIsPresent(By locator, WebDriver driver) {
        try{
            WebElement el = findElement(locator, driver);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public static void waitUntilElementIsClickable(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        // explicit wait
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(1L));
        // elementToBeClickable expected criteria
        wt.until(ExpectedConditions.elementToBeClickable(el));
    }


    public static void waitUntilElementIsVisible(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        // explicit wait
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20L));
        // elementToBeClickable expected criteria
        wt.until(ExpectedConditions.visibilityOf(el));
    }

    public static void switchToWindow(WebDriver driver) {
        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Heading of parent window is " + mainWindowHandle);

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        for (String ChildWindow : allWindowHandles) {
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                System.out.println("Heading of child window is " + ChildWindow);
            }


        }

    }

    public static void uploadSingleFile(By locator, String filepath, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        el.sendKeys(filepath);
    }

     public static void randomDropdownSelect(By locator, WebDriver driver){
        Select dropdown= new Select (findElement(locator, driver));
        List<WebElement> elementCount = dropdown.getOptions();
        int listNUmber=elementCount.size()-1;
        System.out.println(listNUmber);

        Random rand = new Random();
        int indexNumber = rand.nextInt(listNUmber) + 1;
        System.out.println(indexNumber);

        dropdown.selectByIndex(indexNumber);
    }

    public static String createRandomDate(int startYear, int endYear, int startMonth, int endMonth, int startDate, int endDate) {
        int day = createRandomIntBetween(startDate, endDate);
        int month = createRandomIntBetween(startMonth, endMonth);
        int year = createRandomIntBetween(startYear, endYear);
        //return String.format("%d/%d/%s", year, month, day);
        return (year + "-" + month + "-" + day).toString();
    }

    public static void checkElementNotFound(By locator, WebDriver driver) {
        WebElement el = null;
        try {
            el = findElement(locator, driver);
        } catch (NoSuchElementException ex) {
            //do nothing
        }
        Assert.assertNull(el);
    }
    public static  boolean checkElementIsClickable(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);

        if (el.isEnabled()==true){
            return true;
        }

        else{
            return false;
        }

    }


    public static int selectRandomValueFromDivDropdownWithSize(By locator, int sizeOfStartIndex, WebDriver driver) {
        List<WebElement> webElementList = driver.findElements(locator);
        System.out.println("Element size ---------");
        System.out.println(webElementList.size());
        int startIndex = sizeOfStartIndex;
        int endIndex = webElementList.size();
        //Printing element xpath
        webElementList.forEach(webElement -> System.out.println(webElement.toString()));
        //Printing the value of dropdown list
        webElementList.forEach(webElement -> System.out.println(webElement.getText()));
        //Click random index from the div dropdown
        int randomIndex = createRandomIntBetween(startIndex++, --endIndex);
        System.out.println("Random index "+ randomIndex);
        System.out.println("Start index "+ startIndex);
        webElementList.get(randomIndex).click();
        return endIndex;
    }

    public static void selectRandomDateAndMonthFromDatePicker(By monthLocator, By dateLocator, WebDriver driver) {
        WebElement monthSelector = driver.findElement(monthLocator);
        monthSelector.click();
        WebElement monthWidget = driver.findElement(dateLocator);

        List<WebElement> monthColumns = monthWidget.findElements(By.tagName("td"));
        String [] randomMonth = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Random random = new Random();

        // randomly selects an index from the arr
        int select = random.nextInt(randomMonth.length-1);

        // prints out the value at the randomly selected index
        System.out.println("Random String selected: " + randomMonth[select]);

        for(WebElement month:monthColumns){
            if(month.getText().equals(randomMonth[select])){
                System.out.println(month.getText());
                month.click();
                selectRandomDateFromDatePicker(dateLocator,driver);
                break;
            }
        }

    }

    public static void selectRandomDateFromDatePicker(By locator, WebDriver driver){
        WebElement dateWidget = driver.findElement(locator);
        List<WebElement> dateColumns = dateWidget.findElements(By.tagName("td"));
        // Choose a random day from 1 to 28
        int day = createRandomIntBetween(1, 28);
       // int month = createRandomIntBetween(1, 11);
        for (WebElement date : dateColumns) {
            // check the date is equals with day and if yes select
            if (date.getText().equals(day+"")) {
                date.click();
                break;
            }
        }
    }

    public static void selectLastIndexFromDropdown(By locator, WebDriver driver){
       List<WebElement> elementList = driver.findElements(locator);
       // clicking the last index from the list
        elementList.get(elementList.size()-1).click();
    }

    public static String generateValidRandomEmail(String emailPrefix){
        int randomNumber = Operations.createRandomIntBetween(1,100);
        String randomEmail =  emailPrefix+randomNumber+"@monstar-lab.com";
        return randomEmail;
    }
    public static By modifiedXpathWithoutClass(String tagName, String ElementValue){
        By path = By.xpath("//"+tagName+"[contains(text(),'" + ElementValue + "')]");
        return path;
    }
    public static By modificationXpath(String tagName, String className, String ElementValue){
          By RoleApprover = By.xpath("//"+tagName+"[@class='"+className+"'][contains(text(),'" + ElementValue + "')]");
          return RoleApprover;
    }
    public static int tableSize(By locator, WebDriver driver){
        List<WebElement> rows = driver.findElements(locator);
        int count = rows.size();
        return count;
    }
    public static By modifiedTableXpath(By locator, WebDriver driver,int tdNo) {
        List<WebElement> rows = driver.findElements(locator);
        int count = rows.size()+1;
        String rowNumber = String.format("%08d", count);
        By  lastProperty=null;
        if (tdNo == 1) {
            String tdNumber = String.format("%08d", tdNo);
             lastProperty = By.xpath("//tbody/tr[" + rowNumber + "]/td[" + tdNumber + "]/div[1]/div[1]/h4[1]");
          return lastProperty;
        }
        else if (tdNo == 2) {
            String tdNumber = String.format("%08d", tdNo);
             lastProperty = By.xpath("//tbody/tr[" + rowNumber + "]/td[" + tdNumber + "]/span");
          return lastProperty;
        }
        else if (tdNo == 3) {
            String tdNumber = String.format("%08d", tdNo);
             lastProperty = By.xpath("//tbody/tr[" + rowNumber + "]/td[" + tdNumber + "]/div[1]/div[1]/h4[1]/div[1]/div[1]/a");
            return lastProperty;
        }
        else if (tdNo == 6) {
            String tdNumber = String.format("%08d", tdNo);
            lastProperty = By.xpath("//tbody/tr[" + rowNumber + "]/td[" + tdNumber + "]/span[1]");
            return lastProperty;
        }
        else if (tdNo == 7) {
            String tdNumber = String.format("%08d", tdNo);
           lastProperty = By.xpath("//tbody/tr[" + rowNumber + "]/td[" + tdNumber + "]/span[1]");
           return lastProperty;
        }

        else {
            return lastProperty;
        }
    }



    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception {

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot)webdriver);
        //Call getScreenshotAs method to create image file
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        File destFile = new File(fileWithPath);
        //Copy file at destination
        FileUtils.copyFile(srcFile, destFile);

    }

    public static void scrollBarDown(WebDriver driver) throws InterruptedException {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
        System.out.println("Scroll down perfomed");
        Thread.sleep(2000);
    }

    public static void scrollBarUp(WebDriver driver) throws InterruptedException {
        Actions act = new Actions(driver);
        act.sendKeys(Keys.PAGE_UP).build().perform();       //Page Up
        System.out.println("Scroll up perfomed");
        Thread.sleep(2000);
    }

    public static void randomDropdownList(By locator, WebDriver driver){
        List<WebElement> options = driver.findElements(locator);
        int size = options.size()-1;
        int number = createRandomIntBetween(0,size);
        options.get(number).click();
        //options.get(new Random().nextInt(size)).click();
    }

    public static void selectRandomDateFromDatePicker(By locator,int startDate, int endDate, WebDriver driver) {
        WebElement dateWidget = driver.findElement(locator);
        //List of 30/31 dates
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
        // Choose a random day from 1 to 28
        int day = createRandomIntBetween(startDate, endDate);
        for (WebElement cell : columns) {
            // check the date is equals with day and if yes select
            if (cell.getText().equals(day+"")) {
                cell.click();
                break;
            }
        }
    }

    public static void clickusingJS(By locator, WebDriver driver) {
        WebElement el = findElement(locator, driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
        System.out.println("Element is clicked");
    }

    public static void mouseHoverOnElement(By locator, WebDriver driver) {
        Actions actions = new Actions(driver);
        WebElement el = findElement(locator, driver);
        actions.moveToElement(el).build().perform();
    }
    public static void gmailLogin(By locator1, By locator2, By locator3, By locator4, String mail, String pass, WebDriver driver) throws InterruptedException {
        WebElement el1 = findElement(locator1, driver);
        el1.sendKeys(mail);
        sleep(5000);
        WebElement el2 = findElement(locator2, driver);
        el2.click();
        sleep(5000);
        WebElement el3 = findElement(locator3, driver);
        el3.sendKeys((pass));
        sleep(5000);
        WebElement el4 = findElement(locator4, driver);
        el4.click();
        // sleep(10000);

        // WebElement el5 = findElement(GmailOR.Locator.gmail, driver);
        // waitUntilElementIsClickable(GmailOR.Locator.gmail, driver);
        // el5.click();
        //driver.switchTo().window("Google Account");

    }

    public static String createRandomString(WebDriver driver) {
        // create a string of uppercase and lowercase characters and numbers
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        // combine all strings
        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = createRandomIntBetween(1,10);
        // length = Math.random(1,10);
        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphaNumeric.length());

            // get character specified by index
            // from the string
            char randomChar = alphaNumeric.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }


        String randomString = sb.toString();
        return randomString;
        //  System.out.println("Random String is: " + randomString);

    }

    public static void switchToTab(String url, WebDriver driver){
        driver.switchTo().newWindow(WindowType.TAB);
        // Opens url in the newly opened tab
        driver.navigate().to(url);
    }

    public static String randomMobileNumber(By locator, WebDriver driver) throws InterruptedException{

        WebElement el = findElement(locator, driver);
        Random rnd = new Random();
        int number = rnd.nextInt(999999999);
        String num = String.format("%09d", number);
        el.sendKeys("01"+num);
        return num;

    }

    public static String getTooltipText( By locator, By tooltipElement, WebDriver driver){
        Actions actions = new Actions(driver);
        WebElement el = findElement(locator, driver);
        actions.moveToElement(el).build().perform();
        WebElement toolTip = findElement(tooltipElement, driver);
        return toolTip.getText();
    }

}
