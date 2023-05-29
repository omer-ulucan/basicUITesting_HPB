package Test.Scenarios;

import Test.ClassObjects;

public class Runner extends ClassObjects {
    public static void main(String[] args) throws InterruptedException{
        testSteps.launch_and_navigate();
        testSteps.searchBook();
        Thread.sleep(500);
        testSteps.selectBook();
        Thread.sleep(500);
        testSteps.showingCopies();
        Thread.sleep(500);
        testSteps.addToCart();
        Thread.sleep(500);
        testSteps.checkOut();
        Thread.sleep(500);
        testSteps.accountCheck();
    }
}
