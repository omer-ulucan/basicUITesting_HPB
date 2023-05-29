package Test.ReusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Test.Constants.DEFAULT_WAIT_DURATION;
import static Test.Driver.getDriver;

public class WaitUtility {
    public void webDriverWait(Object webElement, String condition)
    {
        WebDriverWait wait = null;

        if(!condition.isEmpty()) {
            wait = new WebDriverWait(getDriver(), Duration.ofSeconds(DEFAULT_WAIT_DURATION));

            switch (condition) {
                case "visibility":
                    wait.until(ExpectedConditions.visibilityOfAllElements((WebElement) webElement));
                    break;
                case "clickability":
                    wait.until(ExpectedConditions.elementToBeClickable((WebElement) webElement));
                    break;
                case "":
                    getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(DEFAULT_WAIT_DURATION));
                    break;
            }
        }
    }
}
