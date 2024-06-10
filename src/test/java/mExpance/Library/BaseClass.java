package mExpance.Library;

import io.github.bonigarcia.wdm.WebDriverManager;
import mExpanse.Pages.ObjectRepository.LogInOR;

import java.io.*;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

    public static WebDriver driver;
    private Properties properties;
    private String pass1;
    private String pass2;

    public BaseClass() {
        try {
            properties = new Properties();
            String filePath = System.getProperty("user.dir") + "/src/test/java/mExpanse/Resources/properties";
            FileInputStream inputStream = null;

            inputStream = new FileInputStream(filePath);
            properties.load(inputStream);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("baseUrl"));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public String getMail(String mail) {

        return (properties.getProperty(mail)).toString();
    }

    public String getPassword(String pass) {

        return (properties.getProperty(pass)).toString();
    }
    public void setPassword(String pass1name, String pass2) throws IOException {
        this.pass2 = pass2.toString();
        System.out.println(pass1name);
        System.out.println(pass2);
        properties.setProperty(pass1name,pass2); //write password
        //save password in properties file
        String filePath = System.getProperty("user.dir") + "/src/test/java/mExpanse/Resources/properties";
        OutputStream output = new FileOutputStream(filePath);
        properties.store(output,"store password");
    }


    public void tearDown() {

        driver.quit();
    }

    public static void takeScreenshot(String testMethodName) {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String currentDir = System.getProperty("user.dir") + "/build/screenshots/";
            FileUtils.copyFile(scrFile, new File(currentDir + testMethodName + ".jpg"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
