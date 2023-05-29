package Test;

import Test.ReusableMethods.WaitUtility;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Test.Driver.getDriver;

public class ClassObjects {
    public static TestSteps testSteps = new TestSteps();
    public static WaitUtility wait = new WaitUtility();
    public static Actions actions = new Actions(getDriver());

}
