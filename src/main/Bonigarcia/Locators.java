package Bonigarcia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import static Bonigarcia.HazirMethod.Methods.*;

public class Locators {
    public static void WebElement_ByName() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});//controlled by chrome yazisi kaldirilir
        options.addArguments("--incognito","--start-maximized");//--headless",


        WebDriver driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(options).create();
        //driver.manage().window().maximize();//ChromeOptions sayesinde maximize ayarini yaptim, bu satira ihtiyac kalmadi
        driver.get("https://www.facebook.com");
        Thread.sleep(10000);

        WebElement email = driver.findElement(By.name("email"));
    }
}
