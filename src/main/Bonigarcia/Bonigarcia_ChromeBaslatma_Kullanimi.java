package Bonigarcia;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bonigarcia_ChromeBaslatma_Kullanimi {
    public static void launchChromeBrowser(){
        WebDriver driver= WebDriverManager.chromedriver().avoidShutdownHook().create();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
    public static void launchChrome_with_chromeOptions() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});//controlled by chrome yazisi kaldirilir
        options.addArguments("--incognito","--start-maximized");//--headless",


        WebDriver driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(options).create();
        //driver.manage().window().maximize();//ChromeOptions sayesinde maximize ayarini yaptim, bu satira ihtiyac kalmadi
        driver.get("https://www.google.com");
        Thread.sleep(10000);
    }
}
