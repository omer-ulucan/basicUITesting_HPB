package Test.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Test.Driver.getDriver;

public class WebElements {
    static public WebElement searchBar = null;
    static public WebElement seeDetails = null;
    static public WebElement seeMoreCopies = null;
    static public WebElement addToCart = null;
    //static public WebElement cardButton = null;
    static public WebElement checkOut = null;
    static public WebElement accountCheck = null;

    public static WebElement getWebElement(String webElement) throws ElementNameIsWrongException {
        WebElement element = null;
        switch (webElement) {
            case "searchBar":
                element = getDriver().findElement(By.xpath("//input[@id='keywords']"));
                break;
            case "seeDetails":
                element = getDriver().findElement(By.xpath("(//a[@class='button primary mtn'])[7]"));
                break;
            case "seeMoreCopies":
                element = getDriver().findElement(By.xpath("//div[@class='text-center plm']"));
                break;
            case "addToCart":
                element = getDriver().findElement(By.xpath("(//form[@method='POST']/button)[1]"));
                break;
            case "checkOut":
                element = getDriver().findElement(By.xpath("//button[@name='checkout']"));
                break;
            case "accountCheck":
                element = getDriver().findElement(By.xpath("//div[@class='large-12 columns']/p/a"));
                break;
            default:
                throw new ElementNameIsWrongException("Given String parameter is wrong");
        }
        return element;
    }
}
/*case "cardButton":
                element = getDriver().findElement(By.xpath("//i[@id='cart-badge']"));
                break;*/