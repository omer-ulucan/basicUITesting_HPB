package Bonigarcia.HazirMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Methods {
    public static void driver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito","--start-maximized");//--headless",


        WebDriver driver= WebDriverManager.chromedriver().avoidShutdownHook().capabilities(options).create();
    }
}
