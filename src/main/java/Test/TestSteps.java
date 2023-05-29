package Test;

import org.openqa.selenium.Keys;

import static Test.Constants.URL;
import static Test.Constants.VALUE;
import static Test.Driver.getDriver;
import static Test.WebElements.WebElements.*;

public class TestSteps extends ClassObjects{
    public void launch_and_navigate(){
        try{
            System.out.println("STEP 1 - launch_and_navigate STEP INITIALIZED...");
            getDriver().get(URL);
            System.out.println("STEP 1 - launch_and_navigate HAS DONE!!!");
        }catch(Exception e){
            System.out.println("STEP-1 HAS FAILED!!!");
        }
    }
    public void searchBook(){
            try {
                System.out.println("STEP 2 - searchBook STEP INITIALIZED...");
                searchBar=getWebElement("searchBar");
                wait.webDriverWait(searchBar,"visibility");
                searchBar.click();
                searchBar.sendKeys(VALUE);
                searchBar.sendKeys(Keys.ENTER);
                System.out.println("STEP 2 - searchBook HAS DONE!!!");
            } catch (Exception e) {
                System.out.println("There was an error sending the value you entered...");
            }
        }
    public void selectBook(){
        try{
            System.out.println("STEP 3 - selectBook STEP INITIALIZED");
            seeDetails=getWebElement("seeDetails");
            wait.webDriverWait(seeDetails,"visibility");
            seeDetails.click();
            System.out.println("STEP 3 - selectBook HAS DONE!!!");
        }catch (Exception e){
            System.out.println("The book could not be selected due to an error...");
        }
    }
    public void showingCopies(){
        try{
            System.out.println("STEP 4 - showingCopies STEP INITIALIZED");
            seeMoreCopies=getWebElement("seeMoreCopies");
            wait.webDriverWait(seeMoreCopies,"visibility");
            seeMoreCopies.click();
            System.out.println("STEP 4 - showingCopies HAS DONE!!!");
        }catch (Exception e){
            System.out.println("Copies could not be displayed...");
        }
    }
    public void addToCart(){
        try{
            System.out.println("STEP 5 - addToCart STEP INITIALIZED");
            addToCart =getWebElement("addToCart");
            wait.webDriverWait(addToCart,"visibility");
            addToCart.click();
            System.out.println("STEP 5 - addToCart HAS DONE");
        }catch (Exception e){
            System.out.println("The book could not added to the cart...");
        }
    }


    public void checkOut(){
        try{
            System.out.println("STEP 6 - checkOut STEP INITIALIZED");
            checkOut=getWebElement("checkOut");
            wait.webDriverWait(checkOut,"visibility");
            checkOut.click();
        }catch (Exception e){
            System.out.println("There's a problem in section CHECK OUT...");
        }
    }


    public void accountCheck(){
        try{
            System.out.println("STEP 7 - accountCheck STEP INITIALIZED");
            accountCheck=getWebElement("accountCheck");
            wait.webDriverWait(accountCheck,"clickability");
            accountCheck.click();
            System.out.println("STEP 7 - accountCheck HAS DONE");
        }catch (Exception e){
            System.out.println("there was a problem checking the 'ALREADY HAVE AN ACCOUNT' section");
        }
    }
}


