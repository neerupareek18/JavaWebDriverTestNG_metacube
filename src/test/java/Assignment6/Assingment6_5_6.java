package Assignment6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assingment6_5_6 {
    WebDriver chromeDriver = new ChromeDriver();

    //Launch browser in Before Class / TestFixute Setup
    @BeforeClass
    public void launchSite(){
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://practice.automationtesting.in");
    }

    //Verify Home page is rendered on clicking ‘Your Logo’
    @Test(priority = 1)
    public void homePageRendering(){
        chromeDriver.findElement(By.xpath("//a[@title=\"Automation Practice Site\"]/img[@title=\"Automation Practice Site\"]")).click();
        Assert.assertEquals(chromeDriver.getCurrentUrl(),"https://practice.automationtesting.in/");
    }

    //Verify Clicking on Demo tab and verify
    @Test(priority = 2)
    public void clickDemoTab(){
        chromeDriver.findElement(By.linkText("Demo Site")).click();
        Assert.assertEquals(chromeDriver.getCurrentUrl(),"https://demo.automationtesting.in/Register.html");

    }

    //Verify “Automation Demo Site” should be found
    @Test(priority = 3)
    public void assertDemoAutomationSite(){
        Assert.assertTrue(chromeDriver.getPageSource().contains("Automation Demo Site"));
    }

    //Make sure to close the browser after completion of three cases.
    @AfterClass
    public void closeBroser(){
        chromeDriver.quit();
    }


}
