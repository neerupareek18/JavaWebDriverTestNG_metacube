package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment3_1 {
    ChromeDriver chromeDriver = new ChromeDriver();

    @Test
    public void launchSiteAndNavigateBack(){
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

        chromeDriver.findElement(By.xpath("//a[@href=\"https://www.tutorialspoint.com\"]")).click();

        chromeDriver.navigate().back();

        chromeDriver.quit();
    }
}
