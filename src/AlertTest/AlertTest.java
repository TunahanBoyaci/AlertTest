package AlertTest;

import Utilities.ParameterDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertTest extends ParameterDriver {
    @Test
    public void test1(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement fakeButton = driver.findElement(By.id("fakealerttest"));
        fakeButton.click();

        WebElement fakeButton2 = driver.findElement(By.id("fakealert"));
        fakeButton2.click();

        WebElement message = driver.findElement(By.id("dialog-text"));
        Assert.assertTrue(message.isDisplayed());

        WebElement okButton = driver.findElement(By.id("dialog-ok"));
        okButton.click();

        Assert.assertFalse(message.isDisplayed());

    }
}
