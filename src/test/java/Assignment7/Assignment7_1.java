package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment7_1 {
    WebDriver chromeDriver = new ChromeDriver();

    @Test
    public void htmlWebAppDev(){
        //Launch Site
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://practice.automationtesting.in");

        //Choose - Shop
        chromeDriver.findElement(By.linkText("Shop")).click();

        //Choose Click on “HTML5 WebApp Development”
        chromeDriver.findElement(By.linkText("HTML")).click();
        chromeDriver.findElement(By.xpath("//h3[text()='HTML5 WebApp Develpment']")).click();

        //Add quantity 2 and click on Add to Basket
        chromeDriver.findElement(By.xpath("//input[@type=\"number\"]")).clear();
        chromeDriver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("2");
        chromeDriver.findElement(By.xpath("//button[text()=\"Add to basket\"]")).click();

        //Verify Cost for lot - 2 Items₹360.00 should visible on Basket
        Assert.assertEquals(chromeDriver.findElement(By.xpath("//ul[@id=\"main-nav\"]/li[@class=\"wpmenucartli wpmenucart-display-standard menu-item\"]/a/span[1]")).getText(),"2 items");
        Assert.assertEquals(chromeDriver.findElement(By.xpath("//ul[@id=\"main-nav\"]/li[@class=\"wpmenucartli wpmenucart-display-standard menu-item\"]/a/span[2]")).getText(),"₹380.00");
    }
    @Test
    public void closeBrowser(){
        chromeDriver.quit();
    }
}
